package tree;

/**
 * Write a description of class Assign here.
 * 
 * @author (Dennis Klauder) 
 * @version (10/29/15)
 */
public class Assign
extends Expr
{

    /**
     * Constructor for objects of class Assign
     */
    public Assign(Expr name, Expr value)
    {
        super(name, value);
        if (!(name instanceof Variable))
            throw new IllegalArgumentException();
        ((Variable)name).set(value.eval());

        //         this.right = value;

    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return right.eval();
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Assign))
            return false;
        Assign other= (Assign) obj;
        return (left.equals(other.left)&&
            right.equals(other.right));
    }

    /**
     * @return a simplified version of this Expr
     */
    public Expr simplify()
    {
        return right;
    }

    /**
     * @return this Expr as a String
     */
    public String toString()
    {
        return "(" + this.left + "=" + this.right.eval()+")";
    }
}
