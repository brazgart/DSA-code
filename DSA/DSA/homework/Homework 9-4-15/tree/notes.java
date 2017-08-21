package tree;

/**
 * Write a description of class notes here.
 * 
 * @author (Dennis Klauder) 
 * @version (10/16/15)
 */
public class notes
{

    /**
     * Constructor for objects of class notes
     */
    public notes()
    {

    }

}

/**
 * Binary Search Tree
 * 
 * is a Binary Tree in which the family of the left child are all smaller 
 * than its value and the famil of its right child are all larger than its value
 * 
 * The values are all unique(no duplicates)
 */

/**
 * Expression Trees
 * 
 * recursive operation
 * (a + b) * 3  infix notation
 * a b + 3 * postfix notation
 * (* + a b 3) prefix notation
 * all the same equation
 */

/**
 * Heap Sort
 * 
 * A heap is a LIST in which each value is greater than (or equal to)
 * its "children". (decreases) Easier to see in tree form.
 * 
 * The left child of position i is at position 2*i+1
 * The right child of position i is at position 2*i+2
 */

/**
 * HeapSort Algorithm
 * 
 * 1. Heapify the list
 * 2. Swap the root with "last"
 * 3. Decrement "last"
 * 4. Percolate down the root.
 * 5. Repeat from step 2 until last is 0.
 * 
 * 
 * definitions
 * HEAPIFY
 * 1. If no children, done.
 * 2. Heapify left child
 * 3. Heapify right child
 * 4. Percolate down the root.
 * 
 * PERCOLATE DOWN
 * 1. Swap root with bigger child.
 * 2. Repeat step 1 until "root" is bigger 
 *    than both children or there are no children
 *    
 * example shown in tree format 
 * begining list is 10, 20, 40, 60, 80, 100
 * (HEAPIFY)
 *    
 *       10     =>        40
 *    20    40         20    10
 * 
 * and
 * 
 *          10            =>       100      =>         100
 *      80     100              80     10           80     40
 *    60  20  40              60  20  40          60 20  10
 * 
 * Now move the root to the end(of the list) Then repeat process to find next largest number.
 * 
 *           10         =>          80         =>        80         =>      20
 *       80     40             10       40           60       40        60       40
 *     60  20  (100)          60 20  (100)          10 20  (100)      10 (80) (100)
 *     
 *     
 *     final product is:
 *     
 *           (10)
 *      (20)      (40)
 *    (60) (80)(100)
 *        
 * () means it is removed from sorting function - it is in the correct place.
 * 
 */

/**
 * improving efficiency
 * 
 * evaluating balance in trees
 * 
 * if values resemble
 *           (K2)
 *     (K1)       (Z)
 * (X)   (Y)                with (X) being HUGE
 * 
 * "rotate" k2 with left child
 * 
 * resolve with 

 *           (K1)
 *     (X)       (K2)
 *            (Y)       (Z)   Assuming (X) is HUGE
 * 
 * "rotate" k2 with left child* 
 * 
 * 
 * 
 * 
 * if values resemble
 *           (K2)
 *     (K1)       (Z)
 * (X)   (Y)
 * 
 * "rotate" k2 with left child
 */
