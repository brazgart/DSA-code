package sort;
import list.*;

/**
 * Will sort a comparable list. currently from largest to smalest.
 * 
 * @author (Dennis Klauder) 
 * @version (Oct 8 2015)
 */
public class SelectionSort <E extends Comparable>
implements Sorter<E>
{
    // instance variables - replace the example below with your own
    List<E> list;

    /**
     * Constructor for objects of class SelectionSort
     */
    public SelectionSort()
    {
        // initialise instance variables
    }

    /**
     * 
     * efficiency (O(n^2)) due to posSmallest()
     */
    public void sort(List<E> list)
    {this.list = list;
        for (int i=0; i<list.size()-1;i++)
            swap(i,posLargest(i)); //determines order here. 
            //use appropriate method.
    }

    /**
     * return position of smallest value, starting at beginning.
     */
    private int posSmallest(int start)
    {
        int result = start;
        for (int i = start + 1; i<list.size();i++)
            if(list.get(i).compareTo(list.get(result))<0)
                result = i;
        return result;
    }

    /**
     * return position of largest value, starting at beginning.
     */
    private int posLargest(int start)
    {
        int result = start;
        for (int i = start + 1; i<list.size();i++)
            if(list.get(i).compareTo(list.get(result))>0)
                result = i;
        return result;
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
