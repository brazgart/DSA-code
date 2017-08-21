package listDriver;
import list.*;

/**
 * Test methods added to the List interface
 * 
 * @author (sdb) 
 * @version (Sep 2015)
 */
public class DriverLab02AM
{
    /**
     *  This main method tests the List classes and Iterators
     *  Data Structures and Algorithms
     */
    public static void main ( )
    {   List<String> friends = new LinkedList <String> ();

        System.out.println (" Testing problem 1");
        friends.add ("joe");
        friends.add ("mary");
        friends.add ("jim");
        friends.add ("joe");                            // Lists may contain duplicate elements
        friends.add (2, "sally");                       // Insert at position 2
        System.out.println (friends.get(3));            // Should be jim
        friends.remove (0);
        System.out.println (friends.indexOf ("joe"));   // Should be 3
        String sal = new String ("sa" + "lly");         
        if (! friends.contains(sal))                    // "sally"
            System.err.println ("Not correct");

        System.out.println ("friends are " + friends);                   // [mary, sally, jim joe]
        List <String> enemies = null;
        System.out.println (enemies);
        enemies = new ArrayList<String> ();
        System.out.println (enemies);

        ////////////// Uncomment the following when ready for problem 2
        System.out.println ("\n\n Testing problem 2");
        enemies.add ("mary");
        enemies.add (sal);               // "sally"
        enemies.add ("jim");
        if (enemies.equals (friends))
            System.err.println ("error in equals 1");
        if (friends.equals (enemies))
            System.err.println ("error in equals 2");
        enemies.add ("joe");
        System.out.println ("enemies are " + enemies);
        if (! enemies.equals (friends))
            System.err.println ("error in equals 3");
        if (! friends.equals (enemies))
            System.err.println ("error in equals 4");

        WordList wordList = new WordList();
        List <String> words = wordList.getWordList();
        System.out.println (words.indexOf ("jack"));        // Should be 51595
        if (!words.contains ("zoo"))
            System.err.println ("Error in contains");
        if (words.contains ("foobar"))
            System.err.println ("Error in contains");

        wordList = new WordList();
        List <String> moreWords = wordList.getWordList();
        if (!words.equals (moreWords))
            System.err.println ("Error in equals");
        if (!moreWords.equals (words))
            System.err.println ("Error in equals");
        moreWords.add (0, "foobar");
        if (words.equals (moreWords))
            System.err.println ("Error in equals");
        if (moreWords.equals (words))
            System.err.println ("Error in equals");
        moreWords.remove(0);
        moreWords.add ("foobar");
        if (words.equals (moreWords))
            System.err.println ("Error in equals");
        if (moreWords.equals (words))
            System.err.println ("Error in equals");
        String foobar = new String ("foo" + "bar");
        words.add (foobar);                          // "foobar"
        if (!words.equals (moreWords))
            System.err.println ("Error in equals");
        if (!moreWords.equals (words))
            System.err.println ("Error in equals");
        System.out.println ("Testing complete");
    }
}

