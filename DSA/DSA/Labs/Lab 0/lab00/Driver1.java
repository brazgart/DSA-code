import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Data Structures and Algorithms
 * Lab 00
 * 
 * Test your solution to problem 1
 * 
 * @author (sdb) 
 * @author ( Dennis Klauder )
 * @version (Sep 2015)
 */
public class Driver1
{
    
    public static void main()
    {   
        WordList wordList = new WordList();
        List <String> words = wordList.getWordList();
        
        longWords (words, 17);
        System.out.println (words.size());      // should be 204
        
        
/////////////////////////////////////////
// UNCOMMENT THE FOLLOWING LINES WHEN READY TO TEST PART (b)
       
//         words = new List <String> ();
//         words.add (" 0");
//         words.add (" 1");
//         insertions (words);
//         System.out.println (words.size());      // should be a million

         words = new LinkedList <String> ();
         words.add (" 0");
         words.add (" 1");
         insertions (words);
         System.out.println (words.size());      // should be a million
    }
    
    /** Remove all words whose length is less than the 
     *  given min.
     */
    private static void longWords (List <String> words, int min)
    {  Iterator <String> wordIterator = words.iterator();
        while(wordIterator.hasNext()){
            String word = wordIterator.next();
            if (word.length()<min){
                wordIterator.remove();
            }	
        }
        

        
         
    }
       
    /** Insert some new strings at position 2 into the given list.
     *  (Do not change this method)
     * 
     */
    private static void insertions (List <String> words)
    {   for (int i=2; i<1000000; i++)
            words.add (2, " " + i);
        }
}
