package tree;
import list.Iterator;

/**
 * An ADT for BinaryTrees
 * 
 * @author (Dennis Klauder) 
 * @version (10/13/15)
 */
public interface BinaryTree<E>
{
    /**
     * @return        right child
     */
    BinaryTree<E> getRight();

    /**
     * @return        left child
     */
    BinaryTree<E> getLeft();

    /**
     * @return  the value of this BinaryTree
     */
    E getValue();

    /**
     * add a Binary Tree with given value somewhere in teh family of this Binary Tree
     * 
     * @return the resulting BinaryTree
     */
    BinaryTree<E> add(E value);

    /**
     * @returns true if the family of this BinaryTree
     * contains the fiven value
     */
    boolean containsKey(E value);

    /**
     * @return  given value, if found in the family, or null if not found
     */
    E get(E value);

    /**
     * remove the given object from the family of this BinaryTree (if it is present)
     * @return the resulting BinaryTree(always)
     */
    BinaryTree<E> remove(Object obj);

    /**
     * Checks to see if the tree is empty
     * @return boolean
     */
    boolean isEmpty();

    /** 
     * Change the value of this BinaryTree to the given value 
     */
    void setValue (E value); 

    /**
     * Set the left child of this BinaryTree to the given BinaryTree 
     */
    void setLeft (BinaryTree <E> left);

    /** 
     * Set the right child of this BinaryTree to the given BinaryTree 
     */
    void setRight (BinaryTree <E> right);

    String toString();

    Iterator<E> iterator();

    /** 
     * @return true if the family of this BinaryTree 
     * is equal to the family of the parameter, obj 
     */
    boolean equals (Object obj);

    /** @return the number of values in the family of this Binary Tree */
    int size();

    /**
     * @return the Height of the number of levels in the family
     */
    int getHeight();

    /** @return the smallest value in the family of this BinaryTree, or null
    if this BinaryTree is empty
     */
    E getSmallest();    

}
