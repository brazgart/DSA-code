package list;

/**
 * Write a description of class RefIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class RefIterator<E>
implements Iterator<E>
{
    LinkedList<E> theList;  //changed to LinkedList to be able to get Nodes
    Node<E> cursor; //last value obtained by next()
    /**
     * Constructor for objects of class RefIterator
     */
    public RefIterator(LinkedList<E>theList)
    {
        // initialise instance variables
        this.theList=theList;
        cursor=theList.head;
    }

    /**
     * @return     true if 
     */
    public boolean hasNext()
    {
        return cursor.next != theList.tail;
    }

    public E next()
    {
        cursor = cursor.next;
        return cursor.value;
    }

    /**
     * removes the references of current Node from prev and next
     * Pre: have run next at least once
     */
    public void remove ()
    {
        cursor.prev.next=cursor.next;
        cursor.next.prev=cursor.prev;
        cursor=cursor.prev;
        theList.size--;
    }

    /** 
     * @return true if there are at least two more values in this List 
     */
    public boolean hasTwoMore()
    {
        if( cursor.next != theList.tail)
        {
            return cursor.next.next != theList.tail;
        }
        else
            return false;
    }

}
