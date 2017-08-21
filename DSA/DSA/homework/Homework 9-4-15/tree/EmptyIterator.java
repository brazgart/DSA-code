package tree;
import list.Iterator;

/**
 * Write a description of class EmptyIterator here.
 * 
 * @author (Dennis Klauder) 
 * @version (10/20/2015)
 */
public class EmptyIterator<E>
implements Iterator<E>
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class EmptyIterator
     */
    public EmptyIterator()
    {

    }

    /**
     * An example of a method header - replace this comment with your own
     * 
     * @return      true only if there are more items.
     */
    public boolean hasNext()
    {
        return false;   
    }

    /**
     * @return the next value
     * pre: hasNext() is true.
     */
    public E next()
    {
        return null;
    }

    /**
     * remove the last value obtained.
     * pre: next() has been called
     */
    public void remove()
    {

    }
}
