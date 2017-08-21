package sort;
import list.*;

/**
 * A Sorter can sort a list
 * 
 * @author (Dennis Klauder) 
 * @version (October 6, 2015)
 */
public interface Sorter <E extends Comparable>
{
    /**
     * Method to sort a comparable list of items.
     * 
     * @param  List list
     * @return        the result produced by sampleMethod 
     */
    void sort (List<E> list);
}
