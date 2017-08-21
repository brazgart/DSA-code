package tree;

/**
 * Write a description of class Constant here.
 * 
 * @author (Dennis Klauder) 
 * @version (Oct 2015)
 */
public class Constant
extends Expr
{

    int value;

    /**
     * Constructor for objects of class Constant
     */
    public Constant(int value)
    {
        super();
        this.value = value;
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return this.value;   
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Constant))
            return false;
        Constant other = (Constant) obj;
        return this.value == other.value;
    }

    /**
     * @return a simplified version of this Expr
     */
    public Expr simplify()
    {
        return this;
    }

    /**
     * @return this Expr as a String
     */
    public String toString()
    {
        return "" + this.value;
    }

}
