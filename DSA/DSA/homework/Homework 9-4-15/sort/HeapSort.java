package sort;
import list.*;

/**
 * Write a description of class HeapSort here.
 * 
 * @author (Dennis Klauder) 
 * @version (October 2015)
 */
public class HeapSort
<E extends Comparable>
implements Sorter<E>
{
    List<E> list;

    /**
     * Constructor for objects of class HeapSort
     */
    public HeapSort()
    {

    }

    /**
     * activates the sorting algorithm of this class
     *    
     * @param  List<E> list 
     */
    public void sort(List<E> list)
    {
        // O(n) with heapify & percDown so cumualtive O(n log n)
        //arraylist recommended because of the amount of getting/setting
        this.list=list;
        heapify(0);
        int last = list.size()-1;
        while(last>0)
        {
            swap(0, last);
            last --;
            percDown(0, last); // is this correct
        }
    }

    private void heapify (int root)
    { 
        //O(n) = ultimately O(n log n) with percDown function
        int max = list.size()-1;
        // has a left child?
        if (2*root+1>max)
            return;
        heapify(2*root+1);
        heapify(2*root+2);
        percDown(root,max);//O(log n)
    }

    private void percDown(int root, int max)
    {
        //pre-condition: root has at least one child
        // O(log n)
        int bc = biggerChild(root,max);
        while(2*root+1<=max&&greater(bc,root))
        {
            swap(root, bc);
            root=bc;
            bc = biggerChild(root,max);
        }
    }

    private int biggerChild(int root, int max)
    {
        int left = 2*root+1;
        int right = 2*root+2;
        if (right >max)
            return left;
        if(greater (left,right))
            return left;
        return right;
    }

    private boolean greater (int p1, int p2)
    {
        return list.get(p1).compareTo(list.get(p2))>0;
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

