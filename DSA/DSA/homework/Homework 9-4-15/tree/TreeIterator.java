package tree;
import list.Iterator;
import queue.*;

/**
 * Inorder traversal of every element of BinarySearchTree TreeIterator here.
 * 
 * @author (Dennis Klauder) 
 * @version (10/20/2015)
 */
public class TreeIterator<E>
implements Iterator<E>
{
    BinaryTree<E> tree;
    QueueADT<E> queue;
    E lastGotten;

    /**
     * Constructor for objects of class TreeIterator
     */
    public TreeIterator(BinaryTree<E> tree)
    {
        this.tree = tree;
        queue=new Queue<E>();
        buildQ(tree);
    }

    /**
     * An example of a method header - replace this comment with your own
     * 
     * @return      true only if there are more items.
     */
    public boolean hasNext()
    {
        return !queue.isEmpty();
    }

    /**
     * @return the next value
     * pre: hasNext() is true.
     */
    public E next()
    {
        return lastGotten = queue.remove();
    }

    /**
     * remove the last value obtained.
     * pre: next() has been called
     */
    public void remove()
    {
        if(lastGotten.equals(tree.getValue()))
        {
            //removing the root of tree
            BinaryTree<E> temp = tree.remove(lastGotten);
            tree.setValue(temp.getValue());
            tree.setLeft(temp.getLeft());
            tree.setRight(temp.getRight());
        }
        else
        {
            tree.remove(lastGotten);
        }
    }

    private void buildQ(BinaryTree<E> tree)
    {//recursive method
        //1 inorder traversal (left, root, right)  
        //2 preorder(root, left, right) 
        //3 postorder (left, right, root)

        // inorder used
        if(tree.getLeft()instanceof BinarySearchTree)
            buildQ(tree.getLeft());
        queue.add(tree.getValue());
        if(tree.getRight()instanceof BinarySearchTree)
            buildQ(tree.getRight());

        //postorder used
        //         if(tree.getLeft()instanceof BinarySearchTree)
        //             buildQ(tree.getLeft());
        //         if(tree.getRight()instanceof BinarySearchTree)
        //             buildQ(tree.getRight());
        //         queue.add(tree.getValue());
    }

    public E getLastGotten()
    {
        return lastGotten;
    }
}
