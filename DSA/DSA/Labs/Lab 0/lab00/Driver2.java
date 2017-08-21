import java.util.*;

/**
 * Data Structures and Algorithms
 * Lab 0
 * 
 * Problem 2
 * 
 * @author (Dennis Klauder) 
 * @version (Sep 2015)
 */
public class Driver2
{
    public static void main()
    {    WordList wordList = new WordList();
        System.out.println (duplicates(wordList.getWordList()));   // should be 4
    }

    /** @return the number of duplicate words in the given list
     */
    public static int duplicates (List <String> words)
    {   
        Set <String> wordSet = new HashSet<String> (words);
        int difference= (words.size()-wordSet.size());

        return difference;            // allows this class to compile
    }
}
