import java.util.*;

/**
 * Data Structures and Algorithms
 * Lab 0
 * 
 * Problem 3
 * 
 * @author (sdb) 
 * @author (Dennis Klauder)
 * @version (Sep 2015)
 */
public class Driver3
{
    private List <String> words;
    private Map <String, Integer> map = new HashMap <String, Integer> ();

    /** Get a list of English words (with duplicates), and build a distribution
     * map for that list.
     */
    public Driver3()
    {    WordList wordList = new WordList();
        words = wordList.getWordList();
        distribution();                // generate the distribution map

    }

    /**
     * Prompt the user for words, one at a time.
     * Show the number of occurrences
     * of the word in our word list.
     * Pre: Distribution map has been created.
     */
    public void checkDistribution()
    {   String word;
        int count;
        Integer countRef;
        Scanner scan = new Scanner (System.in);    // read from keyboard
        System.out.println (getOccurrences("the") + " occurrence of 'the'");   // Should be 1
        System.out.println (getOccurrences("foobar") + " occurrences of 'foobar'");   // Should be 0
        System.out.println ("Enter a word");
        while (scan.hasNextLine())
        {   word = scan.nextLine();
            countRef = map.get(word);
            if (countRef == null)
                count = 0;
            else
                count = countRef;
            System.out.println (count + " occurrences");
            System.out.println ("Enter a word");
        }
    }

    /** Build a distribution map for the list of words
     */
    public void distribution()
    {   
        ////////////////   PUT YOUR SOLUTION HERE
        Iterator <String> wordIterator = words.iterator();
        while(wordIterator.hasNext()){
            String word = wordIterator.next();
            if(map.containsKey(word)){
                int wordCount=map.get(word);
                map.put(word,wordCount+1);
            }
            else{
                map.put(word, 1);
            }
        }
    }

    /** @return the number of duplicate words in the given list
     */
    public int getOccurrences (String word)
    {  
        //////////// PUT YOUR SOLUTION HERE
        int count = 0;
        if (map.get(word)==null){
            count = 0;
        }
        else{
            count = map.get(word);
        }
        return count;           // allow this to compile
    }

}
