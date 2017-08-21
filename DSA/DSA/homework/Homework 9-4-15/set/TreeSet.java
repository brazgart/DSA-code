package set;
import tree.*;
import list.*;

/**
 * Write a description of class TreeSet here.
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
public class TreeSet
<E extends Comparable <E>>
implements Set<E>
{
    BinaryTree<E> tree= new EmptyBinarySearchTree<E>();
    int size = 0;

    /**
     * Constructor for objects of class TreeSet
     */
    public TreeSet()
    {

    }

    public boolean add(E value)
    {
        if(tree.containsKey(value))
            return false;
        tree = tree.add(value);
        size ++;
        return true;
    }

    public boolean contains (Object obj)
    {
        E value;
        try
        {
            value = (E)obj;
            return tree.containsKey(value);
        }
        catch(ClassCastException cce)
        {
            return false;
        }
    }

    public boolean remove(Object obj)
    {
        if(!contains(obj))
            return false;
        tree = tree.remove(obj);
        size--;
        return true;
    }

    public Iterator<E> iterator()
    {
        if (size ==0)
            return new EmptyIterator<E>();
        return tree.iterator();
    }

    public String toString()
    {
        Iterator <E>itty= this.iterator();
        String result = "[";
        if(!(itty.hasNext()))
            return result + "]";
        result += itty.next();
        while(itty.hasNext())
            result+=","+ itty.next();
        result+="]";
        return result;
    }

    public int size()
    {
        return size;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Set))
            return false; 
        Set<E> test = (Set) obj;
        if(tree.size()!=test.size())
            return false;
        Iterator <E> itty = this.iterator();
        while(itty.hasNext())
            if (!(test.contains(itty.next())))
                return false;

        return true; 
    }

    public boolean subsetOf(Set<E> otherSet)
    {
        Iterator <E> itty = tree.iterator();
        while (itty.hasNext())
            if(!otherSet.contains(itty.next()))
                return false;
        return true;
    }

    public Set <E> intersection (Set<E> other)
    {
        Set result = new TreeSet<E>();
        Iterator <E> itty = tree.iterator();
        Object testValue;
        while (itty.hasNext())
        { 
            testValue = itty.next();
        if(other.contains(testValue))
            result.add(testValue);
        }
        return result;
    }
}
