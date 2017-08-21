package set;
import list.*;

/**
 * A Set is a collection with no duplicates order need not be maintained.
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
public interface Set<E>
{
    /**
     * add a given value 
     * @param         the item to be added
     * @return        true if item is added
     */
    boolean add(E value);

    /**
     * @return  true if this Set conains obj
     */
    boolean contains (Object obj);

    /**
     * removes the item if it is possible
     * 
     * @param   item to be removed
     * @return  true if item is removed
     */
    boolean remove (Object obj);

    /**
     * returns an iterator for this set
     */
    Iterator<E> iterator();

    /**
     * returns the size of the set
     */
    int size();

    /** @return true only if this Set is equal to obj */
    boolean equals (Object obj);

    /** @return this Set as a String */
    String toString();

    /** @return true only if this Set is a subset of the otherSet */
    boolean subsetOf (Set<E> otherSet);

    /** @return the intersection of this Set with the other Set */
    Set <E> intersection (Set<E> other);

}
