package tree;

/**
 * Abstract class Expr - write a description of the class here
 * 
 * @author (Dennis Klauder)
 * @version (October 2015)
 */
public abstract class Expr
{
    Expr left, right; //operands

    /**
     * Constructor
     */
    public Expr(Expr left, Expr right)
    {
        this.left = left;
        this.right = right;
    }
    
    /**
     * default constructor
     */
    public Expr()
    {
        
    }

    /**
     * @return  the value of this Expr
     */
    public abstract int eval();

    /**
     * @return true only if this Expr is same as obj
     */
    public abstract boolean equals(Object obj);
    
    /**
     * @return a simplified version of this Expr
     */
    public abstract Expr simplify();
    
    /**
     * @return this Expr as a String
     */
    public abstract String toString();
    
    
}
