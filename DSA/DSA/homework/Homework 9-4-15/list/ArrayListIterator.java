package list;

/**
 * Write a description of class ArrayListIterator here.
 * 
 * @author (Dennis Klauder) 
 * @version (a version number or a date)
 */
class ArrayListIterator<E>
extends ArrayIterator<E>
implements ListIterator<E>
{// ndx is inheirited from superclass - becomes our implicit cursor

    boolean forward=true; //marker to determine which way the iterator last progressed

            /**
             * Constructor for objects of class ArrayListIterator
             */
    ArrayListIterator(List<E>theList)
    {
        this(theList,0);
    }

    ArrayListIterator(List<E>theList, int ndx)//careful of ndx provided if out of bounds
    {
        super(theList);
        super.ndx=ndx;
    }

      public boolean hasNext()
    {
        return ndx<theList.size();
    }

    public E next()
    {
        ndx++;
        forward=true;
        return theList.get(ndx-1);
    }

    public boolean hasPrevious()
    {
        return ndx>0;
    }

    public E previous()
    {
        ndx--;
        forward=false;
        return theList.get(ndx);
    }

    public void remove()
    {
        if(forward)
        {
            ndx--;
        }
        theList.remove(ndx);
    }
    
    public void add (E value)
    {
        theList.add(ndx, value);
        ndx++;
    }
}
