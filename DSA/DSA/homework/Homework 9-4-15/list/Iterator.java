package list;

/**
 * An Iterator can be used to visit every element of a colletion
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public interface Iterator<E>
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @return      true only if there are more items.
     */
    boolean hasNext();

    /**
     * @return the next value
     * pre: hasNext() is true.
     */
    E next();

    /**
     * remove the last value obtained.
     * pre: next() has been called
     */
    void remove();

    /** 
     * @return true if there are at least two more values in this List 
     */
    //boolean hasTwoMore();
}
