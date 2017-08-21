package list;

/**
 * An iterator which permits traversal in either direction
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public interface ListIterator<E>
extends Iterator<E>

{
    /**
     * Will return true if there is an 
     * element to the left of the "cursor"
     * 
     * @return boolean true if there is value to left of cursor
     */
    boolean hasPrevious();

    /**
     * Pre: hasPrevious() is true
     * @return        the previous value to the 
     * left of the implicit cursor
     */
    E previous();

    /**
     * Remove the last value obtained by a call to next() or previous()
     */
    void remove();

    /**
     * Insert the given value at the implicit cursor position 
     */
    public void add (E value);
}
