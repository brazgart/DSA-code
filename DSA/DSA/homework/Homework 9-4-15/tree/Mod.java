package tree;

/**
 * Write a description of class Mod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mod
extends Expr
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Mod
     */
    public Mod(Expr left, Expr right)
    {
        super(left, right);
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return (left.eval()%right.eval());
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Mod))
            return false;
        Mod other = (Mod) obj;
        return (left.equals(other.left)&&
            right.equals(other.right));
    }

    /**
     * @return a simplified version of this Expr
     */
    public Expr simplify()
    {
        left= left.simplify();
        right=right.simplify();
        if(right.equals(left))
            return new Constant(0); // x%x = 0
        if ((right instanceof Constant)&&
        right.eval()==1)
            return new Constant(0);
            if((right instanceof Constant)&&
        (left instanceof Constant))
            return new Constant(left.eval()%right.eval());
        return this;

    }

    /**
     * @return this Expr as a String
     */
    public String toString()
    {
        return ""+left+"%"+right;
    }

}
