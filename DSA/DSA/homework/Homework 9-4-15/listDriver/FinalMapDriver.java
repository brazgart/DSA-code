package listDriver;
import map.*;
/**  Test the HashMap * 
* @author (sdb)  
* @version (Dec 2015) 
*/
public class FinalMapDriver
{    public static void main()    
{   Map <String, String> names = new HashMap <String, String> ();

   System.out.println ("Keys are: " + names.getKeys("856")); 
        names.put ("sue", "609");  
        names.put ("jim", "856"); 
        names.put ("sarah", "215");  
   System.out.println ("Keys are: " + names.getKeys("856")); 
        names.put ("will", "856"); 
        names.put ("stu", "609");  
        names.put ("van", "856"); 
        names.put ("jon", "215"); 
   System.out.println ("Keys are: " + names.getKeys("856"));  
         }  }