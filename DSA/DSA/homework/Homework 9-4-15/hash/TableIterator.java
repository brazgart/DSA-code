package hash;
import list.*;

/**
 * Write a description of class TableIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableIterator<E>
implements Iterator<E>
{
    HashTable<E> table;
    int ndx; //which linkedList
    Iterator<E>itty; //linkedList Iterator

    /**
     * Constructor for objects of class TableIterator
     */
    public TableIterator(HashTable<E> table)
    {
        this.table=table;
        setItty(ndx);
    }

    /**
     * sets
     */
    private void setItty(int ndx)  //reference for ArrayList
    {
        itty = table.lists.get(ndx).iterator();
    }

    public boolean hasNext()
    {
        if(itty.hasNext())
            return true;
        for(ndx++;ndx<table.lists.size();ndx++)
        {
            if (!table.lists.get(ndx).isEmpty())
            {
                setItty(ndx);
                return true;            
            }
        }
        return false;
    }

    public E next()
    {
        hasNext(); //hasNext will advance the iterator if at the end of current list.
        return itty.next();
    }
    
    public void remove()
    {
        itty.remove();
        table.keyCount--;
    }
}
