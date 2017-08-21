package sort;

/**
 * Write a description of class notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class notes
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class notes
     */
    public notes()
    {
    }
    /**
     * Quick sort Algorithm
     * 
     * 1. If the size of the list is less than 2, sorting is done.
     * 
     * 2. Partition the list so that all the values to the left of a selected "pivot value" 
     * are less than the pivot value, and all the values to the right are greater than or 
     * equal to the pivot value
     * 
     * 3. Use quick sort algorithm to sort the left part.
     * 
     * 4. use quick sort algorithm to sort the right part.
     * 
     * ex - list 40 20 50 40 30 60 20
     * choosing 40 as pivot value - results in 
     *  20 30 20 *40* 60 50 40
     *  
     *  Partition Algorithm
     *  
     *  1. Choose the first value as the pivot value. Copy it. Set "position" as p
     *  
     *  2. for position, i, initially start +1
     *  
     *  3. compare with pivot value
     *      If position i value is smaller than pivot value;  (if value at list[i] < pivot value)
     *      
     *      a. Copy position i to position p.
     *      b. i becomes the new position p.   (p = p+1);
     *      c. copy position p to i.
     *      
     *  4. repeat step 2 until i reaches end.
     *  5. copy pivot value to position p
     *    
     *    
     *    
     *    Search a list for a given value (target)
     *    
     *    public int indexOf(Object obj)
     *    O(n)
     *    Sequential Search
     *    Linear Search.
     *    
     *    Algorithm to search a SORTED list for a target.
     *    
     *    BINARY SEARCH
     *    
     *    1. if the list is empty, return -1
     *    2. find midpoint.
     *    3. if value at the midpoint == target, midpoint is the result.
     *    [1-3 is base case of recursive method]
     *    
     *    4. compare value at midpoint with target:
     *      a. If target smaller {search left half}
     *      b. If target smaller {search right half}
     *      
     *  
     *  ADT. Binary Tree
     *      A. Binary Tree has:
     *          1. A value
     *          2. A left child
     *              which is a Binary Tree
     *          3. A right child
     *              which is a Binary Tree
     *              
     *  eventually the children will terminate(null is possiblility)
     *  the complete tree (from the Tree through all Decendents 
     *  is called family)
     *  
     */
}
