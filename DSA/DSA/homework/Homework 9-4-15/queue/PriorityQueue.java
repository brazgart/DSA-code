package queue;
import list.*;

/**
 * A QueueADT in which each value has a priority.  Remove the value
 * with highest priority.
 * 
 * @author (Dennis Klauder)
 * @version (November 2015)
 */
public class PriorityQueue<E extends Comparable>
implements QueueADT<E>
{
    List <E> values = new ArrayList<E>();
    int size = 0; //allows us not to "remove" the last item, so not 
    //to have to keep adding/removing from list
    /**
     * 
     */
    public E remove()
    {
        if(size==0)
            return null;
        E result = values.get(0);
        int avail = 0;
        int bc = biggerChild(avail);
        size--;
        while(2*avail+1<size&&greater(bc,size))
        {
            values.set(avail, values.get(bc));
            avail = bc;
            bc = biggerChild(avail);//keep an eye out. 
            //if list is "empty" may cause problems.

        }
        values.set(avail,values.get(size));
        return result;
    }

    /**
     * @ return the position of bigger child
     */
    private int biggerChild(int root)
    {
        int left = 2*root+1;
        int right = 2*root +2;
        if (right >= size)
            return left;
        if(greater(left,right))
            return left;
        return right;
    }

    /**
     * strictly greater
     */
    private boolean greater(int x, int y)
    {
        return values.get(x).compareTo(values.get(y))>0;
    }

    /**
     * adds new item at end then swap with lesser parent
     * till we have heap.
     */
    public void add(E value)
    {
        if (size==values.size())
            values.add(value);
        else
            values.set(size,value);
        int added, parent;
        added = size;
        parent = (added-1)/2;
        size++;
        while(added>0 && greater(added,parent))
        {
            swap(added, parent);
            added = parent;
            parent = (added-1)/2;
        }
    }

    public boolean isEmpty()
    {
        return (size==0);
    }

    public void removeAll()
    {
        size =0;
    }

    public int size()
    {
        return size;  
    } 

    public E peek()
    {
        if(size==0)
            return null;
        return values.get(0);
    }

    private void swap(int i, int j)
    {
        E temp = values.get(i);
        values.set(i, values.get(j));
        values.set(j, temp);
    }

    public String toString()
    {
        Iterator itty = values.iterator();
        String result = "[";
        for(int i = 0; i<=size-1;i++)
        {
            if(i==size-1)
                result += values.get(i);
            else
                result += values.get(i)+",";
        }
        result += "]";
        return result;
    }

    //    copy methods needed from heapsort class
}

