package tree;

/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product
extends Expr

{

    /**
     * Constructor for objects of class Product
     */
    public Product(Expr left, Expr right)
    {
        super(left,right);
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        return (left.eval() * right.eval());
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Product))
            return false;
        Product other = (Product) obj;
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
        left = left.simplify();
        right = right.simplify();
        if((right instanceof Constant)&&
        (left instanceof Constant))
            return new Constant(left.eval()*right.eval());
        if(right instanceof Constant)
        {
            if(right.eval()==0) // x*0=0
                return new Constant(0);

            if(right.eval()==1) // x*1=x
                return left;
        }
        if(left instanceof Constant)
        {
            if( left.eval()==0) // 0*x=0
                return new Constant(0);
            if( left.eval()==1) // 1*x=x
                return right;
        }
        return this;
    }

    /**
     * @return this Expr as a String
     */
    public String toString()
    {
        return "("+left+"*"+right+")";
    }

}
