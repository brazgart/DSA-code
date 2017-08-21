package tree;

/**
 * Write a description of class Difference here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difference
extends Expr
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Difference
     */
    public Difference(Expr left, Expr right)
    {
        super(left, right);
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return left.eval() - right.eval();   
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Difference))
            return false;
        Difference other = (Difference) obj;
        return (left.equals(other.left)&&
            right.equals(other.right));
    }

    /**
     * @return a simplified version of this Expr
     */
    public Expr simplify()
    {
        left=left.simplify();
        right=right.simplify();
        if((right instanceof Constant)&&
        (left instanceof Constant))
            return new Constant(left.eval()-right.eval());
        if((right instanceof Constant)&&
        right.eval()==0) //x-0=x
            return left;
        if(right.equals(left))
            return new Constant(0);
        return this;
    }

    /**
     * @return this Expr as a String
     */
    public String toString()//adding parentasis to ensure order
    {
        return "("+left.toString()+"-"+right.toString()+")";
    }

}
