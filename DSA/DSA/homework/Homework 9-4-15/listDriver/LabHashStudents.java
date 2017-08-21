package listDriver;
import hash.*;

/**
 * Test the HashTable
 * 
 * @author (sdb) 
 * @version (Nov 2015)
 */
public class LabHashStudents
{
    public static void main()
    {   
        HashTable <Student> students = new HashTable <Student> (5);

        if (! students.isEmpty())
            System.out.println ("Not correct");
        students.put (new Student ("jim", "423",20,"New York","New York","07742"));
        students.clear();

        students.put (new Student ("jim", "423",20,"New York","New York","07742"));
        students.put (new Student ("mary", "433",72,"SanFrancisco","California","88516"));
        students.put (new Student ("joe", "422",12,"Bridgeton","New Jersey","08302"));
        students.put (new Student ("jim", "421",85,"Anytown","Ohio","01234"));
        students.put (new Student ("mary", "405",24,"Anchorage","Alaska","56894"));

        if (students.size() != 5)
            System.out.println ("Not correct");

        System.out.println (students.get (new Student("joe","433",12,"","","08302"))); // should be joe
        
        Student test0 = (new Student ("jim", "423",20,"New York","New York","07742"));
        Student test1 =(new Student ("mary", "433",72,"SanFrancisco","California","88516"));
        Student test2 =(new Student ("joe", "422",12,"Bridgeton","New Jersey","08302"));
        Student test3 =(new Student ("jim", "421",85,"Anytown","Ohio","01234"));
        Student test4 =(new Student ("mary", "405",24,"Anchorage","Alaska","56894"));
        
        System.out.println(test0+", "+test0.hashCode()+"\n"+
        test1+", "+test1.hashCode()+"\n"+
        test2+", "+test2.hashCode()+"\n"+
        test3+", "+test3.hashCode()+"\n"+
        test4+", "+test4.hashCode());
        
    }

}
