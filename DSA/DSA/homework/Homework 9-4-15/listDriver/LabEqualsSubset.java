package listDriver;
import set.*;
import list.*;

/**
 * Test the implementations of the Set interface.
 * 
 * @author (sdb) 
 * @version (Apr 2015)
 */
public class LabEqualsSubset
{
    public static void main()
    {   System.out.println();
        problem1 ();
        System.out.println();
        problem2 ();
        System.out.println();
        problem3 ();
    }

    private static void problem1()
    {
        Set <String> friends, pals;
        friends = new TreeSet <String> ();
        pals = new HashSet <String> ();
        System.out.println ("Testing equals (Object)");

        if (! friends.equals (pals))
            System.err.println ("Error in equals");
        if (! pals.equals (friends))
            System.err.println ("Error in equals");

        friends.add ("joe");
        friends.add ("jim");
        if (friends.equals (pals))
            System.err.println ("Error in equals");
        if (pals.equals (friends))
            System.err.println ("Error in equals");

        friends.add ("joe");
        friends.add ("su" + "sie");
        pals.add ("jim");
        pals.add ("susie");
        pals.add ("jim");
        if (friends.equals (pals))
            System.err.println ("Error in equals");
        if (pals.equals (friends))
            System.err.println ("Error in equals");
        pals.add ("joe");
        pals.add ("jimmy");
        friends.add ("jimmy");
        if (friends.equals ("foo"))
            System.err.println ("Error in equals");
        if (pals.equals ("foo"))
            System.err.println ("Error in equals");

        if (! friends.equals (pals))
            System.err.println ("Error in equals");
        if (! pals.equals (friends))
            System.err.println ("Error in equals");

        System.out.println ("friends are: " + friends);
        System.out.println ("pals are: " + pals);

    }

    private static void problem2()
    {    
        //Uncomment the following when ready for problem 2
        Set <String> friends, pals;
        friends = new TreeSet <String> ();
        pals = new HashSet <String> ();
        System.out.println ("Testing subsetOf (Set)");
        friends.add ("joe");
        friends.add ("jim");
        if (friends.subsetOf (pals))
            System.err.println ("Error in subset1");
        if (! pals.subsetOf (friends))
            System.err.println ("Error in subset2");

        friends.add ("joe");
        friends.add ("su" + "sie");
        pals.add ("jim");
        pals.add ("susie");
        if (friends.subsetOf (pals))
            System.err.println ("Error in subset3");
        if (! pals.subsetOf (friends))
            System.err.println ("Error in subset4");
        pals.add ("jim");
        pals.add ("joe");

        if (! friends.subsetOf (pals))
            System.err.println ("Error in subset5");
        if (! pals.subsetOf (friends))
            System.err.println ("Error in subset6");

        pals.add ("jimmy");
        if (! friends.subsetOf (pals))
            System.err.println ("Error in subset7");
        if (pals.subsetOf (friends))
            System.err.println ("Error in subset8");

        System.out.println ("friends are: " + friends);
        System.out.println ("pals are: " + pals);
    }

    private static void problem3()
    {
        //testing intersection

        Set <String> friends, pals;
        friends = new TreeSet <String> ();
        pals = new HashSet <String> ();
        System.out.println ("Testing intersection (Set)");
        friends.add ("joe");
        friends.add ("jim");
        friends.add ("joe");
        friends.add ("su" + "sie");

        pals.add ("jim");
        pals.add ("susie");
        pals.add ("jim");
        pals.add ("joe");
        pals.add ("jimmy");

        System.out.println ("friends are: " + friends);
        System.out.println ("pals are: " + pals);

        System.out.println (friends.intersection(pals));
    }
}

