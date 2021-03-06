package listDriver;
import sort.*;
import list.*;
import java.util.Random;

/**
 * Test the QuickSort algorithm.
 * 
 * @author (sdb)  
 * @version (Sep 2015)
 */
public class DriverQuicksort
{   static final int MAX = 10;
    
    public static void main()
    {
        Random rand = new Random();         // random number generator
        List <Integer> numbers = new ArrayList <Integer> ();
        Sorter<Integer>  sorter;
        sorter = new QuickSort <Integer> ();
        
        // Test QuickSort with random input
        for (int i=0; i<MAX; i++)
            numbers.add (rand.nextInt(50));   // random int in [0..49]
        System.out.println ("Before sorting:");
        System.out.println (numbers);
        sorter.sort (numbers );
        System.out.println ("After sorting:");
        System.out.println (numbers);
        
        
         // Test QuickSort with ascending input
        numbers.clear();
        for (int i=0; i<MAX; i++)
            numbers.add (i * 10);           // initially in ascending order
        System.out.println ("Before sorting:");
        System.out.println (numbers);
        sorter.sort ( numbers);
        System.out.println ("After sorting:");
        System.out.println (numbers);
    }
}
