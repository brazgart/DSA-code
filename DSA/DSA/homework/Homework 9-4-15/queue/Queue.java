package queue;
import list.*;

/**
 * Write a description of class Queue here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public class Queue<E>
implements QueueADT<E>
{
    // instance variables - replace the example below with your own
    List<E> values = new LinkedList<E>();

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        // initialise instance variables
    }
    //first position in the List is Front
    //last position in the list is Back

    /** 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void add (E value)
    {
        values.add(value);
    }

    public E remove()
    {
        return values.remove(0);
    }

    public E peek()
    {
        if(!(values.size()<=0))
            return values.get(0);
        else
            return null;
    }

    public int size()
    {
        return values.size();
    }

    public String toString()
    {
        return values.toString();
    }

    /** 
     * Clear this QueueADT 
     */
    public void removeAll()
    {
        values.clear();
    }
    
    public boolean isEmpty()
    {
        if (values.size()>0)
        return false;
        return true;
    }

}
