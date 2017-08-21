package tree;
import list.Iterator;

/**
 * Write a description of class EmptyBinarySearchTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyBinarySearchTree
<E extends Comparable <E>>
implements BinaryTree<E>
{
    // instance variables - needs no values as it is empty.

    /**
     * Constructor for objects of class EmptyBinarySearchTree
     */
    public EmptyBinarySearchTree()
    {

    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public E getValue()
    {
        return null;
    }

    public boolean equals(Object obj)
    {
        return obj instanceof EmptyBinarySearchTree;
    }

    public void setValue(E value)
    {
        //most likely will never be called.
    }

    public void setLeft(BinaryTree <E> left)
    {
        //most likely will never be called.
    }

    public void setRight(BinaryTree <E> right)
    {
        //most likely will never be called.
    }

    public boolean containsKey(E value)
    {
        return false;
    }

    public BinaryTree <E> add(E value)
    {
        return new BinarySearchTree <E> (value);
    }

    public BinaryTree<E> remove (Object obj)
    {
        return this;
    }

    public E get(E value)
    {
        return null;   
    }

    /**
     * @return        right child
     */
    public BinaryTree<E> getRight()
    {
        return null;
    }

    /**
     * @return        left child
     */
    public BinaryTree<E> getLeft()
    {
        return null;        
    }

    public boolean isEmpty()
    {
        return true; 
    }

    public String toString()
    {
        return "";
    }

    public String toStr()
    {
        return "";
    }

    public Iterator<E> iterator()
    {
        return new EmptyIterator<E>();
    }

    /** 
     * @return the number of values in the 
     * family of this Binary Tree 
     */
    public int size()
    {
        return 0;  //this portion is empty and has no size/value
    }

    public int getHeight()
    {
        return 0;
    }

    /** @return the smallest value in the family of this BinaryTree, or null
    if this BinaryTree is empty
     */
    public E getSmallest()
    {
        return null;
    }

}
