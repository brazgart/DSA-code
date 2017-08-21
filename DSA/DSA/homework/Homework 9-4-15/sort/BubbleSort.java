package sort;
import list.*;

/**
 * Sort each position with neighbor if necessary stopping at n-1.
 * 
 * @author (Dennis Klauder) 
 * @version (10-6-15)
 */
public class BubbleSort <E extends Comparable>
implements Sorter<E>
{

    List <E> list;

    /**
     * Constructor for objects of class BubbleSort
     */
    public BubbleSort()
    {
        // initialise instance variables
    }

    /**
     * sorting items in a list - doesn't swap every comparison
     */
    public void sort(List<E> list)
    {
        this.list = list;
        for (int i=0; i < list.size()-1; i++)
            for(int j=0; j < list.size()-i-1; j++)
                if(list.get(j).compareTo(list.get(j+1))>0)
                    swap(j, j+1);
    }

    /**
     * swap the values at positions i and j
     */
    private void swap(int i, int j)
    {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
