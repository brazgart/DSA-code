package recursion;
import java.util.*;

/**
 * Write a description of class Permutations here.
 * 
 * @author (Dennis Klauder) 
 * @version (Oct 2015)
 */
public class Permutations
{

    /**
     * Constructor for objects of class Permutations
     */
    public Permutations()
    {

    }

    /**
     *  @return The set of all permutations of the given list.
     */
    public static Set <List <Character>>  generatePerms (List <Character> list)
    {
        HashSet <List<Character>> returnSet = new HashSet <List<Character>>();
        char head;
        int listSize = list.size();
        if(listSize <=0)
            returnSet.add(list);
        else
        {
            head = list.get(0);
            list.remove(0);
            //loop to move element throughout
            //add "NEW" list to set
            // remove head from its place
            //end loop

            //recursively call generatePerms(list)
            
            
        }   
        
            return returnSet;

    }

    /**
     * 
     * 
     * private Set <List <Character>> generatePerms (List <Character> list)
     * {
     *     HashSet <List<Character>> workingSet = new HashSet <List<Character>>();
     *   }
     **/
}
