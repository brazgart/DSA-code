package tree;

/**
 * Write a description of class BalancedBinarySearchTree here.
 * 
 * @author (Dennis Klauder) 
 * @version (December 2015)
 */
public class BalancedBinarySearchTree
<E extends Comparable<E>>
extends BinarySearchTree<E>
implements BinaryTree<E>
{
    static final int MAX=1; //limits how unbalanced tree can get

    /**
     * Constructor for objects of class BalancedBinarySearchTree
     */
    public BalancedBinarySearchTree(E value)
    {
        super(value);
        super.left=new EmptyBalancedBinarySearchTree();
        super.right=new EmptyBalancedBinarySearchTree();

    }

    private BinaryTree<E> rotateWithLeftChild()
    {
        BinaryTree<E> temp = left; //is interface, has no fields
        left=temp.getRight();
        temp.setRight(this);
        return temp;
    }

    private BinaryTree<E> rotateWithRightChild()
    {
        BinaryTree<E> temp = right;
        right=temp.getLeft();
        temp.setLeft(this);
        return temp;
    }

    private BinaryTree<E> doubleWithLeftChild()
    {
        BalancedBinarySearchTree<E>temp=(BalancedBinarySearchTree) left;
        left = temp.rotateWithRightChild();
        return rotateWithLeftChild();
    }

    private BinaryTree<E> doubleWithRightChild()
    {
        BalancedBinarySearchTree<E> temp =(BalancedBinarySearchTree) right;
        right=temp.rotateWithLeftChild();
        return rotateWithRightChild();
    }

    public BinaryTree<E> add(E value)
    {
        int cmp =value.compareTo(this.value);
        if(cmp<0)
        left = left.add(value);
        if(cmp>0)
            right = right.add(value);
        return balance();
    }

    private BinaryTree<E> balance()
    {
        BinaryTree<E> result = this;
        if ((left.getHeight()-right.getHeight()) > MAX)  // limits to case1 or case3
            if (left.getLeft().getHeight()>=left.getRight().getHeight())
                result = rotateWithLeftChild();  //case 1
            else
                result = doubleWithLeftChild();  //case 3
        else
        if(right.getHeight()-left.getHeight()>MAX)  // limits to case2 or 4
            if (right.getRight().getHeight()>=right.getLeft().getHeight())
                result =rotateWithRightChild(); //case 2
            else
                result = doubleWithRightChild();//case 4
        return result;
    }
}
