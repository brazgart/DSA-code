package listDriver;
import set.*;
import list.*;
 
/**  Final Exam 
* Test the constructor in HashSet   
* @author (sdb) 
 * @version (Dec 2015)
 */
public class FinalSetDriver
{   public static void main()   
 {    Set <String> friends = new TreeSet <String> ();  
      initialize (friends);  
      Set <String> pals = new HashSet<String> (friends);  
     System.out.println (pals);     
      friends = new HashSet <String> ();   
      initialize (friends);    
      pals = new HashSet<String> (friends);    
    System.out.println (pals);     
      List <String> amigos = new LinkedList<String>();  
      amigos.add ("jim");   
      amigos.add ("joe");   
      amigos.add ("jim");    
      pals = new HashSet<String> (amigos);  
    System.out.println (pals);   
      try {   pals = new HashSet<String> ("jimmy");            }   
     catch (IllegalArgumentException iae)    
        {   System.out.println ("Testing complete");  }  
  }           
    
 private  static void initialize(Set<String> set)  
  {   set.add ("sue");  
      set.add ("jim");  
      set.add ("sue"); 
      set.add ("harry");   
      set.add ("sue");   
      set.add ("mary");     
       }}