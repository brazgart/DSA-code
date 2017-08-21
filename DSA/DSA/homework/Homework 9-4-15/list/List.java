package list;

/**
 * Write a description of interface List here.
 * 
 * @author (Dennis Klauder) 
 * @version (9-4-15)
 */
public interface List <E>{
    /**
     * @return the value at the given ndx
     */

    E get(int ndx);

    /**
     * store the given value at given dnx in this List
     * @return the old value
     */

    E set(int ndx, E value);

    /**
     * clear this list
     * 
     */

    void clear();

    /**
     * Add the given value at the given ndx.(insert)
     */

    void add(int ndx, E value);

    /** 
     * Add the given value at end of the list
     */

    void add(E value);

    /**
     * Remove the value at the given ndx.
     */
    E remove(int ndx);

    /**
     * Return the number of elements in this List
     */
    int size ();

    /**
     * return boolean true if the list has size 0
     */
    boolean isEmpty();

    /**
     * @return the postion of the first occurrence of the given value in this List, or -1 if not found
     */
    int indexOf (Object value);

    /**
     * @return true only if the given value is contained in this List 
     */
    boolean contains (Object value);

    /** @return the elements of this List as a String,
     * with elements separated by commas, enclosed in square brackets:
     * [a,b,c]
     */
    String toString( );

    /** @return true only if this List is equal to the parameter, other */
    boolean  equals (Object other);

    /**
     * @return an iterator for the particular list
     */
    Iterator<E> iterator();

    /** Remove the first occurrence of the given object from this List, if possible.
    @return true only if the item was removed
     */
    public boolean remove (Object obj);
    
    ListIterator<E> listIterator();
    
    ListIterator<E> listIterator(int start);

}

    