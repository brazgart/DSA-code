package listDriver;
import sort.*;

/**
 * Student has a name, ssn, and gpa
 * 
 * @author (sdb) 
 * @version (Oct 2014)
 */
public class Student
implements Comparable <Student>

{
    private String name;
    private String ssn;
    private double gpa;
    private int creditsComplete;
    private HomeTown homeTown;

    public Student (String n, String ssn,int creditsComplete,
    String city, String state, String zip)
    {
        name = n;
        this.ssn = ssn;
        this.creditsComplete = creditsComplete;
        this.homeTown = new HomeTown(city,state,zip);
    }

    public String toString()
    {   return name + "(" + ssn +", "+ creditsComplete+", " + 
        homeTown.getZip()+")";  }

    public int compareTo(Student other)
    {
        if(this.name.equals(other.name))
            return this.ssn.compareTo(other.ssn);
        return this.name.compareTo(other.name);
    }

    public boolean equals(Object other)
    {
        Student test;
        if(!(other instanceof Student))
            return false;
        test = (Student)other;
        return(this.name.equals(test.name)&&
        this.creditsComplete==(test.creditsComplete)&&
        this.homeTown.equals(test.homeTown));
    }

    public int hashCode()
    {
        int result = 17;
        result = result *37 + creditsComplete;
        result = result * 37 + this.name.hashCode();
        result = result * 37 + this.homeTown.getZip().hashCode();
        return result;
    }

}
