package listDriver;
import hash.*;
import list.*;

/**
 * Test the HashTable
 * 
 * @author (sdb) 
 * @version (Mar 2015)
 */
public class HashTableRehash
{
    public static void main()
    {   
        HashTable <Integer> nums = new HashTable <Integer> ();

        for (int i=0; i<1000; i++)
            nums.put(i);

        System.out.println ("Size of the hash table is " + nums.size());

        System.out.println (nums);
//         if (nums.isEmpty())
//             System.err.println ("Not correct 1");
// 
//         System.out.println (nums.get(16));      // should be 16
//         System.out.println (nums.get(15));      // should be null
// 
//         if (!nums.remove(16))
//             System.err.println ("Not correct 2");
//    
//         if (nums.remove(16))
//             System.err.println ("Not correct 3");
// 
//         System.out.println ("Size of the hash table is " + nums.size());
//         nums.clear();
//         if (! nums.isEmpty())
//             System.err.println ("Not correct 4");
// 
//         nums.put (0);
//         if (nums.get(18) != null)
//             System.err.println ("Not correct 5");

    }

}
