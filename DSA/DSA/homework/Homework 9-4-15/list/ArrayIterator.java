package list;

/**
 * Write a description of class ArrayIterator here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
class ArrayIterator<E>
implements Iterator<E>
{
    List<E> theList;
    int ndx =-1; //position of last value obtained

    /**
     * Constructor for objects of class ArrayIterator
     */
    ArrayIterator(List<E>theList)
    {
        this.theList=theList;
    }

    /**
     * @return     true if has next value 
     */
    public boolean hasNext()
    {
        return ndx<theList.size()-1;       
    }

    public E next()
    {
        ndx++;
        return theList.get(ndx);
    }

    public void remove()
    {
        theList.remove(ndx);
        ndx--;
    }

    /** 
     * @return true if there are at least two more values in this List 
     */
    public boolean hasTwoMore()
    {
        return ndx<theList.size()-2;
    }

}
