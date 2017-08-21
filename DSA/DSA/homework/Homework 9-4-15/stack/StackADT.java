package stack;

/**
 * Write a description of interface StackADT here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public interface StackADT<E>
{
    /**
     * Add a value to the top of this stack
     * 
     * @return        the value pushed
     */
    E push(E value);

    /** 
     * remove the top value of the stack
     * @return the value removed
     */
    E pop();

    /**
     * @return the top value
     */
    E peek();

    /** 
     * @return true only if this Stack is empty 
     */
    boolean isEmpty();

    /** 
     * Remove all items from this Stack 
     */
    void clear();

    /** 
     * @return true only if this Stack is equal to the parameter, other 
     */
    boolean equals(Object other);
}
