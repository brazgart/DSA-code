package listDriver;
import map.*;

/**
 * Test the TreeMap
 * 
 * @author (sdb) 
 * @version (Mar 2012)
 */
public class HwTreeMapDriver
{
    public static void main()
    {   Map <String, String> names = new TreeMap <String, String> ();

        if  (! names.isEmpty())
            System.err.println ("isEmpty incorrect");
        
        names.put ("sue", "609");
        names.put ("jim", "856");
        names.put ("sarah", "215");
        names.put ("will", "856");
        names.put ("stu", "609");
        names.put ("van", "856");
        names.put ("jim", "215");
        
        if ( names.isEmpty())
            System.err.println ("isEmpty incorrect");
        if (! names.containsKey ("van"))
            System.err.println ("containsKey incorrect");
        if (names.containsKey ("joe"))
            System.err.println ("containsKey incorrect");
        if (! (names.size() == 6))
            System.err.println ("Size is incorrect") ;
        if (! ( names.get ("jim").equals ("215")))
            System.err.println ("Incorrect value for jim") ;
        
        System.out.println ("sue's area code is " + names.remove ("sue"));
        if (! ( names.size() == 5))
            System.err.println ("Size is incorrect" );
        if (names.get ("sue") != null)
            System.err.println ("Incorrect value for sue") ;
        
        System.out.println (names);     // Hint: Entry needs a toString() method
}
  
}
