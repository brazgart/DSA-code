package tree;

/**
 * Write a description of class Quotient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quotient
extends Expr
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Quotient
     */
    public Quotient(Expr left, Expr right)
    {
        super(left, right);
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return (left.eval()/right.eval());
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Quotient))
            return false;
        Quotient other = (Quotient) obj;
        return (left.equals(other.left)&&
            right.equals(other.right));
    }

    /**
     * @return a simplified version of this Expr
     */
    public Expr simplify()
    {
        left=left.simplify();
        right = right.simplify();
        if((right instanceof Constant)&&
        (left instanceof Constant)&&(left.eval()!=0))
            return new Constant(left.eval()/right.eval());
        if((right instanceof Constant)&&
        right.eval()==1) //x/1=x
        return left;
        if(right.equals(left)) // x/x=1
        return new Constant(1);
        if((left instanceof Constant)&&
        left.eval()==0) //0/x=0
        return new Constant(0);
        return this;
    }

    /**
     * @return this Expr as a String
     */
    public String toString()
    {
        return ""+left+"/"+right;
    }
}
