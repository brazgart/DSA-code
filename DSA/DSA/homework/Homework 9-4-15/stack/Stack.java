package stack;
import list.*;

/**
 * Write a description of class Stack here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public class Stack<E>
implements StackADT<E>
{
    public List<E> values;
    //End of list is top of stack.
    /**
     * Constructor for objects of class Stack
     */
    public Stack(boolean arrayBased)
    {

        if(arrayBased)
        {
            values=new ArrayList<E>();
        }
        else
        {
            values=new LinkedList<E>();
        }
    }

    public Stack()
    {
        this(true);
    }

    /**
     * Methods
     */
    public E push(E value)
    {
        values.add(value);
        return value;
    }

    public E pop()
    {
        return values.remove(values.size()-1);
    }

    public E peek()
    {
        return values.get(values.size()-1);
    }

    public boolean isEmpty()
    {
        return values.isEmpty();
    }

    public String toString()
    {
        return values.toString();
    }

    public void clear()
    {
        values.clear();
    }

    public boolean equals(Object other)
    {
        // System.out.println(other);

        //if (!(other instanceof StackADT))
        //{
        //    return false;
        //}
        return (other.equals(values));  //works: not sure why
        //return false; // (this.values.equals((List)other.values));
    }

    /**
     * Applications
     * 
     * undo feature
     * 
     * post fix expressions
     *      read expressions left to right
     *          number: push onto stack
     *      operator:
     *      {
     *          pop()
     *          pop()
     *          apply the operator to popped numbers
     *          push result back to stack
     * 
     * Run Time Stack
     *  remembers return addresses
     *  values of local variables
     *  
     *  when method is called
     *      push returns address
     *      local vars, parameters
     *      
     *  when a mothod terminates
     *      pop the stack 
     *      return to the calling method.
     * 
     */
}
