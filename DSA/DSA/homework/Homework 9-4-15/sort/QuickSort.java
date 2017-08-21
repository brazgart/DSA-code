package sort;
import list.*;

/**
 * Using the quicksort algorithm sort an ARRAYLIST
 * efficiency will become O(n*log(n)) if ideal (pivot becomes middle)
 * efficiency will become O(n^2) worst case senario
 * 
 * @author (Dennis Klauder) 
 * @version (10-9-15)
 */
public class QuickSort
<E extends Comparable>
implements Sorter <E>
{
    List <E> list;

    /**
     * Constructor for objects of class Quicksort
     */
    public QuickSort()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sort(List<E> list)
    {
        this.list = list;
        qSort(0, list.size()-1);
    }

    /**
     * Sort positions, start through end
     */
    private void qSort(int start, int end)
    {
        if (end <=start) return;
        int p=partition(start,end);
        qSort(start,p-1);
        qSort(p+1,end);
    }

    /**
     * @return position of pivot value using first value
     */
    private int partitionOld(int start, int end)
    {
        int p = start;
        E pivotValue = list.get(p);
        for(int i=start+1; i<=end; i++)
            if (list.get(i).compareTo(pivotValue)<0)
            {
                list.set(p, list.get(i));
                p++;
                list.set(i, list.get(p));
            }
        list.set(p, pivotValue);
        return p;
    }
    
    /**
     * @return position of pivot value using value at the middle list
     */
    private int partition(int start, int end)
    {
        int p = (start+end)/2;
        E pivotValue = list.get(p);
        list.set(p, list.get(start));
        p = start;
        for(int i=start+1; i<=end; i++)
            if (list.get(i).compareTo(pivotValue)<0)
            {
                list.set(p, list.get(i));
                p++;
                list.set(i, list.get(p));
            }
        list.set(p, pivotValue);
        return p;
    }
}
