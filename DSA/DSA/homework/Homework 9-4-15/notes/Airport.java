package notes;

/**
 * Write a description of class Airport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airport
implements Comparable <Airport>
{
    String name;
    boolean visited = false; // records if this has been used by airline
    boolean isHub = false;

    public Airport (String name)
    {
        this.name = name;
    }

    public boolean equals (Object obj)
    {
        if (!(obj instanceof Airport))
            return false;
        Airport port = (Airport)obj;
        return name.equals (port.name);
    }

    public String toString()
    {
        return name;
    }

    public int compareTo (Airport other)
    {
        if (this.isHub==true && !other.isHub)
            return 1;
        if (!this.isHub&& other.isHub)
            return -1;
        return 0;
    }
    
    public void setHub(Boolean hubGiven)
    {
        this.isHub=hubGiven;
    }
    
    

}
