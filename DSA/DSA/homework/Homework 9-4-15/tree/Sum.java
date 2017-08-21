package tree;

/**
 * Write a description of class Sum here.
 * 
 * @author (Dennis Klauder) 
 * @version (Oct 2015)
 */
public class Sum
extends Expr
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Sum
     */
    public Sum(Expr left, Expr right)
    {
        super(left, right);
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return left.eval() + right.eval();
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Sum))
            return false;
        Sum other = (Sum) obj;
        return (left.equals(other.left)&&
            right.equals(other.right))||
        (left.equals(other.right)&&
            right.equals(other.left));
    }

    /**
     * @return a simplified version of this Expr
     */
    public Expr simplify()
    {
        left=left.simplify();
        right = right.simplify();
        if((right instanceof Constant) &&
        right.eval()==0) // x+0=x
            return left;
        if((left instanceof Constant) &&
        left.eval()==0) // 0+x=x
            return right;
        if (left.equals(right))
            return (new Product(new Constant(2),left));
        if((right instanceof Constant)&&
        (left instanceof Constant))
            return new Constant(left.eval()+right.eval());
        return this;
    }

    /**
     * @return this Expr as a String
     */
    public String toString()//adding Parenthesis to ensure clarify order of operations.
    {
        return  "("+left.toString()+ "+" + right.toString()+")"; //fix this.
    }

}
