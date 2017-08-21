package listDriver;


/**
 * Write a description of class HomeTown here.
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
public class HomeTown
{
 private String city;
 private String state;
 private String zip;
    /**
     * Constructor for objects of class HomeTown
     */
    public HomeTown(String city, String state, String zip)
    {
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    /**
     * @return     true if zip codes match 
     */
    public boolean equals(Object other)
    {
        HomeTown test;
        if(!(other instanceof HomeTown))
        return false;
        test = (HomeTown) other;
        return(this.zip.equals(test.zip));
    }
    
    public String getZip()
    {
        return this.zip;
    }
}
