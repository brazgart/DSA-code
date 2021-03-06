package queue;
import list.*;

/**
 * Write a description of class ArrayQueue here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public class ArrayQueue<E>
implements QueueADT<E>
{
    // instance variables - replace the example below with your own
    List <E> values= new ArrayList<E>();
    int front=0, back = 0, qSize=0;

    /**
     * Constructor for objects of class ArrayQueue
     */
    public ArrayQueue()
    {
        // initialise instance variables
    }

    /**
     *  
     * @param Element to be added to queue
     * @return     void
     */
    public void add(E value)
    {
        if (qSize<values.size())
        {
            values.set(back,value);
        }
        else
        {
            values.add(back,value);
            front=(front+1)%values.size();
        }
        back=(back+1)%values.size();
        qSize++;
    }

    public E remove()
    {
        E result= values.get(front);
        front=(front+1)%values.size();
        qSize--;
        return result;
    }

    public E peek()
    {
        if(qSize==0)
            return null;
        else
            return values.get(front);
    }

    public int size()
    {
        return values.size();
    }

    /** Clear this QueueADT */
    public void removeAll()
    {
        values.clear();
    }

    /** Return the elements of this QueueADT as a String, separated by commas and enclosed in brackets. The front of the QueueADT should be the first element.
    [front,middle,back]
     */
    public String toString()
    {
        return values.toString(); //underconstruction
    }
    
    public boolean isEmpty()
    {
        return false; //under contruction
    }
}
