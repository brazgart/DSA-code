package list;

/**
 * A ListIterator for LinkedLists
 * 
 * cursor refers to the last node obtained 
 * by a call to next or previous
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
class RefListIterator<E>
extends RefIterator<E>
implements ListIterator<E>
{
    boolean forward=true;

    /**
     * Constructor for objects of class RefListIterator
     */
    RefListIterator(LinkedList<E>theList)
    {
        this(theList,0);
    }

    RefListIterator(LinkedList<E>theList, int start)
    {
        super(theList);
        for(int i=0; i<start; i++)
            cursor=cursor.next;
    }

    /** 
     * @return     boolean if there is a value to right of cursor
     */
    public boolean hasNext()
    {
        if(theList.isEmpty())
            return false;
        if(forward)
            return cursor.next!=theList.tail;
        return true;
    }

    public E next()
    {
        if(forward)
        {
            cursor=cursor.next;
        }
        else
        {
            forward=true;
        }
        return cursor.value;
    }

    public boolean hasPrevious()
    {
        if(theList.isEmpty())
            return false;
        if(!forward)
            return cursor.prev!=theList.head;
        return cursor!=theList.head;  //testing to see if false positve when iterator 
        //created
    }

    public E previous()
    {
        if(!forward)
            cursor=cursor.prev;
        else
            forward=false;
        return cursor.value;
    }

    public void remove()
    {
        super.remove();
        if(!forward)
            cursor=cursor.next;
    }

    public void add (E value)
    {
        if(forward)
        {
            cursor=cursor.next;
        }

        Node<E> temp=new Node<E>(value,cursor,cursor.prev);
        cursor.prev = temp;
        temp.prev.next= temp;
        theList.size++;
        cursor=temp;
        forward=true;
    }
}
