package listDriver;
import java.util.Random;
import list.*;

/**
 * 
 * Test the BubbleSort on Linked Lists
 * 
 * @author (sdb) 
 * @version (Sep 2014)
 */
public class  BubbleSortLinkedTest
{
   static LinkedList <Integer> grades = new LinkedList <Integer> ();
    static Random rand = new Random();
    
    public static void main ()
    {
        init();
        System.out.println ("Test Bubble Sort on linked list:");
        System.out.println ("Before sorting: \n" + grades);
        grades.bubbleSort ();
        System.out.println ("After sorting: \n" + grades);
    }
    
    private static void init()
    {   grades.clear(); 
        for (int i=0; i<20; i++)
             grades.add (rand.nextInt(150));

    }

}
