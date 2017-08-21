package map;
import set.*;

/**
 * An ADT for entries, each of which is a key/value pari.
 * Access is efficient using a key
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
public interface Map<K,V>
//K is the type of keys
//V is the type of values
{
    /**
     * return true if there is an entry with the given key
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    boolean containsKey(K key);

    /**
     * return teh value of the entry with 
     * the given key, or null if not found
     */
    V get(K key);

    /**
     * Put an entry into this map with the given key
     * and value
     * @returns the previous value from the map.  
     * either the prior value or null if none existed
     */
    V put (K key, V value);

    /**
     * remove the entry with the given key if it is possible
     * @return the value, or null if not found
     */
    V remove (K key);

    /**
     * returns the size of the map
     */
    int size();

    /**
     * empties the map and resets the size to zero
     */
    void clear();

    /**
     * returns true if the map is empty
     */
    boolean isEmpty();

    /**
     * returns the object as a string
     */
    String toString();

    /** @return a Set of all the keys in this Map */
    Set <K> keySet ();

    /** @return A Set consisting of all keys which map to the given value */

    Set<K> getKeys(V value);
}
