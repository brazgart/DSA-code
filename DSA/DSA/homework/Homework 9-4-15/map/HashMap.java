package map;
import hash.*;
import set.*;
import list.*;

/**
 * Write a description of class HashMap here.
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
public class HashMap<K,V>
implements Map<K,V>
{
    HashTable<HashEntry<K,V>> table = 
        new HashTable <HashEntry<K,V>>();

    /**
     * Constructor for objects of class HashMap
     */
    public HashMap()
    {

    }

    public HashMap(int size)
    {
        table = new HashTable <HashEntry<K,V>>(size);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean containsKey (K key)
    {
        return table.containsKey(new HashEntry <K,V>(key, null));
    }

    public V get (K key)
    {
        HashEntry<K,V> entry = new HashEntry <K,V> (key,null);
        entry = table.get(entry);
        if (entry==null)
            return null;
        return entry.value;
    }

    public V put (K key, V value)
    {
        HashEntry <K,V> newEntry = new HashEntry <K,V> (key, value);
        HashEntry<K,V> oldEntry = table.get (newEntry);
        if(oldEntry ==null)
        {
            table.put(newEntry);
            return null;
        }
        V oldValue = oldEntry.value;
        oldEntry.value = value;
        return oldValue;
    }

    public V remove (K key)
    {
        HashEntry<K,V> entry = new HashEntry<K,V> (key, null);
        entry = table.get(entry);
        if (entry==null) 
            return null;
        table.remove(entry);
        return entry.value;
    }

    public int size()
    {
        return this.table.size();
    }

    public void clear()
    {
        this.table.clear();
    }

    public boolean isEmpty()
    {
        return this.table.isEmpty();
    }

    public String toString()
    {
        return this.table.toString();
    }

    public Set <K> keySet()
    {
        Set result = new HashSet();
        Iterator <HashEntry<K,V>> itty = table.iterator();
        while(itty.hasNext())
        {
            result.add(itty.next().getKey());
        }
        return result;
    }

    /** @return A Set consisting of all keys which map to the given value */
    public Set<K> getKeys(V value)
    {
        Set result = new HashSet();
        Set Keys = this.keySet();
        Iterator <K> itty = Keys.iterator();
        while (itty.hasNext())
        {
            Object key = itty.next();
            if (this.get((K)key).equals(value))
                result.add(key);

        }
        return result;
    }
}
