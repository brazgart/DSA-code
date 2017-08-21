package listDriver;
import list.*;

/**
 * Lab 1
 * Test methods added to the List interface
 * 
 * @author (Dennis Klauder) 
 * @version (Sep 2015)
 */
public class Quiz01
{
    /**
     *  This main method tests the List classes
     *  for lab 1, Data Structures and Algorithms
     */
    public static void main ( )
    {   List<String> friends = new ArrayList <String> ();

        friends.add ("joe");
        friends.add ("mary");
        friends.add ("jim");
        friends.add ("joe");                            // Lists may contain duplicate elements
        friends.add (2, "sally");                       // Insert at position 2
        friends.remove (0);                             // Remove joe at position 0 
        friends.add("harry");
        friends.add ("dennis");
        friends.remove("harry");
        String s1 = "sal";
        String s2 = "ly";       // s1 + s2 is "sally"
        System.out.println ("sally is at position " + friends.indexOf(s1 + s2));  // should be 1
        if  (friends.contains ("harry"))
            System.err.println ("Not correct"); 
        System.out.println(friends);
    }
}

