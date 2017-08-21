package notes;

/**
 * Write a description of class Flight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flight
{
    Airport origin, dest;

    public Flight(Airport o, Airport d)
    {
        origin = o;
        dest = d;
    }

    public String toString()
    {
        return "(" + origin + "->" + dest + ")";
    }
}
