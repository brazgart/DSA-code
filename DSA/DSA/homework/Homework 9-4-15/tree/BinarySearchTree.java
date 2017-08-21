package tree;
import list.*;
import list.Iterator;

/**
 * Write a description of class BinarySearchTree here.
 * 
 * @author (Dennis Klauder) 
 * @version (10/16/15)
 */
public class BinarySearchTree
<E extends Comparable <E>>
implements BinaryTree<E>

{
    // instance variables - replace the example below with your own
    E value;
    BinaryTree<E> left = new EmptyBinarySearchTree();

    BinaryTree<E> right = new EmptyBinarySearchTree();
    /**
     * Constructor for objects of class BinarySearchTree
     */
    public BinarySearchTree(E value)
    {
        this.value = value;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     boolean if value is contained in this object
     *              or its children
     */
    public boolean containsKey(E value)
    {
        int cmp = value.compareTo(this.value);
        if(cmp == 0) return true;
        if(cmp < 0) return left.containsKey(value);
        return right.containsKey(value);
    }

    public BinaryTree<E> add(E value)
    {
        int cmp=value.compareTo(this.value);
        if (cmp<0) left = left.add(value);
        if (cmp>0) right = right.add(value);
        return this;
    }

    public E getValue()
    {
        return this.value;
    }

    public E get(E value)
    {
        int cmp=value.compareTo(this.value);
        if (cmp==0) return this.value;
        if (cmp<0) return left.get(value);
        return right.get(value);
    }

    public BinaryTree<E> remove(Object obj)
    {
        E value;
        try
        {
            value = (E) obj;
            int cmp = value.compareTo(this.value);
            if (cmp ==0) //found it
            {List <BinaryTree<E>> kids = children();
                if (kids.size()==0)
                    return new EmptyBinarySearchTree<E>();
                if(kids.size()==1)
                    return kids.get(0);
                //two children
                BinaryTree<E> successor=
                    ((BinarySearchTree<E>)right).smallest();
                BinaryTree<E> result = 
                    remove(successor.getValue());
                result.setValue(successor.getValue());
                return result;
            }
            if (cmp<0) left = left.remove(value);
            if (cmp>0) right = right.remove(value);
        }        
        catch(ClassCastException cce){}
        return this;
    }

    public boolean isEmpty()
    {
        return false;
    }

    /** @return the smallest BinaryTree in the family of this     
     * BinaryTree.  This will be the smallest value in the family     
     * of the left child, if it has a left child, or this BinaryTree.     
     */ 
    private BinaryTree<E> smallest()    
    {   if (left instanceof EmptyBinarySearchTree) 
            return this;      
        return ((BinarySearchTree <E>)left).smallest ();    // left is a BinaryTree, which is an interface
    }

    /** 
     * Change the value of this BinaryTree to the given value 
     */
    public void setValue (E value)
    {
        this.value = value;   
    } 

    /**
     * Set the left child of this BinaryTree to the given BinaryTree 
     */
    public void setLeft (BinaryTree <E> left)
    {
        this.left = left;   
    }

    /**
     * Set the right child of this BinaryTree to the given BinaryTree 
     */
    public void setRight (BinaryTree <E> right)
    {
        this.right = right;
    }

    public BinaryTree<E> getLeft()
    {
        return this.left;
    }

    public BinaryTree<E> getRight()
    {
        return this.right;
    }

    /** @return a List of all of this BinaryTree's children.     
     *  It will contain 0, 1, or 2 elements.     
     */    
    private List <BinaryTree <E>> children ()    
    {   List<BinaryTree <E>> kids = new ArrayList <BinaryTree<E>> ();    
        if (left instanceof BinarySearchTree)           kids.add (left);         
        if (right instanceof BinarySearchTree)          kids.add (right);  
        return kids;    
    }

    public String toString()
    {
        String returnString = "[";
        Iterator <E> itty = this.iterator();
        if (itty.hasNext());
        {
            returnString+=itty.next();
            while(itty.hasNext())
                returnString+=","+itty.next();
        }
        returnString +="]";
        return returnString;
    }

    public Iterator<E> iterator()
    {
        return new TreeIterator<E>(this);
    }

    public boolean equals (Object obj)
    {
        BinarySearchTree<E> testObj;

        if (obj instanceof BinarySearchTree)
        {
            testObj = (BinarySearchTree) obj;
            if (
            this.left.equals(testObj.getLeft())&&
            this.right.equals(testObj.getRight())&&
            this.value.equals(testObj.getValue()))
                return true;
            else
                return false;
        }
        return false;
    }

    /**
     * @return the number of values in the 
     * family of this Binary Tree 
     */
    public int size()
    {
        return (right.size() + left.size() + 1);
    }

    public int getHeight()
    {
        int leftHeight = left.getHeight();
        int rightHeight = right.getHeight();
        return greaterInt(leftHeight,rightHeight)+1;

    }

    private static int greaterInt(int valueA, int valueB)
    {
        if (valueA >= valueB)
            return valueA;
        else
            return valueB;
    }

    /** @return the smallest value in the family of this BinaryTree, or null
    if this BinaryTree is empty
     */
    public E getSmallest()
    {
        if(left instanceof EmptyBinarySearchTree)
            return value;
        else
            return left.getSmallest();

    }
}
