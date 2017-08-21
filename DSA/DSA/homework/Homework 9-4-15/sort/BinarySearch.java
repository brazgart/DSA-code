package sort;
import list.*;

/**
 * Search a given list for a target assuming it is sorted from largest to smallest.
 * 
 * @author (Dennis Klauder) 
 * @version (10/13/15)
 */
public class BinarySearch <E extends Comparable>
{
    //prerequisite: List should be ArrayList
    List <E> list;
    /**
     * Constructor for objects of class BinarySearch
     */
    public BinarySearch(List <E> list)
    {
        this.list=list;
    }

    /**
     * return position of the target in the given list, or -1 if not found
     */
    public int search(E target)
    {
        return binSrch(0, list.size()-1, target);
    }

    private int binSrch(int start, int end, E target)
    {
        if(start>end)return -1; // target not found
        int mid = (start + end)/2;
        int cmp = target.compareTo(list.get(mid));
        if (cmp==0) return mid;
        if (cmp < 0) return binSrch( mid+1, end, target);
        return binSrch(start, mid-1, target);
    }
}
