package tree;

/**
 * Write a description of class Variable here.
 * 
 * @author (Dennis Klauder) 
 * @version (10/29/2015)
 */
public class Variable
extends Expr
{

    char name;
    int value;
    boolean assigned=false;

    /**
     * Constructor for objects of class Variable
     */
    public Variable(char name)
    {
        super();
        this.name = name;   
    
    }

    public Variable(char name, Constant value)
    {
        super();
        this.name = name;
    }

    /**
     * @return  the value of this Expr
     */
    public int eval()
    {
        if(!assigned)
            throw new IllegalArgumentException();
            return value;
       
    }

    /**
     * @return true only if this Expr is same as obj
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof Variable))
            return false;
        Variable other = (Variable) obj;
        return ((Character)(this.name)).equals((Character)other.name);
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
        return ""+this.name;
    }
    
    public void set(int value)
    {
      this.value = value;
      assigned = true;
    }
}
