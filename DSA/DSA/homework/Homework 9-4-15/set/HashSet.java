package set;
import hash.*;
import list.*;
import java.lang.Throwable.*;

/**
 * Implements a set using a hash table
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashSet<E>
implements Set<E>
{
    HashTable<E> table = new HashTable<E>();
    /**
     * Constructor for objects of class HashSet
     */
    public HashSet()
    {
    }

    /** Construct a HashSet from the given collection. 
     * @param collection Should be a Set or a List
     * @throws IllegalArgumentException if collection is neither a Set nor a List.
     */
    public HashSet (Object collection)
    {
        List <E> listCollection;
        Set <E> setCollection;
        

        try{
            if (!(collection instanceof List || collection instanceof Set))
                throw new IllegalArgumentException();
            if (collection instanceof List)
            {
                listCollection = (List)collection;
                Iterator <E> itty = listCollection.iterator();
                while (itty.hasNext())
                {
                    this.add(itty.next());
                }
               
            }
            if (collection instanceof Set)
            {
                setCollection = (Set) collection;
                Iterator <E> itty = setCollection.iterator();
                while (itty.hasNext())
                {
                    this.add(itty.next());
                }
           
            }

        }
        catch(IllegalArgumentException iae){}
    }

    /**
     * Add an element to the hash table
     * 
     * @param  value to be added
     * @return     true if added
     */
    public boolean add(E value)
    {
        if(table.containsKey(value))
            return false;
        table.put(value);
        return true;
    }

    public boolean contains (Object obj)
    {
        return table.containsKey (obj);
    }

    public boolean remove (Object obj)
    {
        return table.remove(obj);
    }

    public Iterator<E> iterator()
    {
        return table.iterator();
    }

    /**
     * toString
     */
    public String toString()
    {
        Iterator <E>itty= this.iterator();
        String result = "[";
        if(!(itty.hasNext()))
            return result + "]";
        result += itty.next();
        while(itty.hasNext())
            result+=","+ itty.next();
        result += "]";
        return result;
    }

    /**
     * equals method will check to make sure 
     * each element is contained within the compared set
     */
    public boolean equals (Object other)
    {
        if(!(other instanceof Set))
            return false; 
        Set<E> test = (Set) other;
        if(table.size()!=test.size())
            return false;
        Iterator <E> itty = this.iterator();
        while(itty.hasNext())
            if (!(test.contains(itty.next())))
                return false;

        return true;
    }

    public int size()
    {
        return table.size();
    }

    public boolean subsetOf (Set<E> otherSet)
    {
        Iterator <E> itty = table.iterator();
        while (itty.hasNext())
            if(!otherSet.contains(itty.next()))
                return false;
        return true;
    }

    public Set <E> intersection (Set<E> other)
    {
        Set result = new HashSet<E>();
        Iterator <E> itty = table.iterator();
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
