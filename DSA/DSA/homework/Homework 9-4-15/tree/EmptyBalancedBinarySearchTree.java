package tree;

/**
 * Write a description of class EmptyBalancedBinarySearchTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyBalancedBinarySearchTree
<E extends Comparable<E>>
extends EmptyBinarySearchTree<E>
{
    public BinaryTree<E> add(E value)
    {
        return new BalancedBinarySearchTree<E>(value);
    }
}
