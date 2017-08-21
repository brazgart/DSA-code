package listDriver;
import hash.*;

/**
 * Test the rehashing HashTable class
 * 
 * @author (sdb) 
 * @version (Dec 2015)
 */
public class LabRehashDriver
{

    public static void main()
    {   HashTable <String> people = new HashTable <String> ();
        HashTable <UnderConstruction> stuff = new HashTable <UnderConstruction> ();

        for (int i=0; i<2000; i++)
        {
            people.put ("person" + i);

            if(i==1999)
            {
                System.out.println("ArrayList size = " +people.size());
                System.out.println();
                //                 System.out.println("Size of biggest LinkedList = " +people.maxList);

            }
        }
        // Uncomment the following when ready for part (b)
        for (int i=0; i<2000; i++)
        {   stuff.put (new UnderConstruction (i));

            if(i==1999)
            {
                System.out.println("ArrayList size = " +people.size());
                System.out.println();
                //                 System.out.println("Size of biggest LinkedList = " +people.maxList);

            }
        }
        System.out.println ("Testing complete");
    }
}
