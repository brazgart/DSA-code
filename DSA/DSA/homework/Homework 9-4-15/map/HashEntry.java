package map;

/**
 * Write a description of class Entry here.
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
class HashEntry<K,V>
{
    K key;
    V value;
    /**
     * Constructor for objects of class Entry
     */
    public HashEntry(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    /**
     * a way to compare if two entries are equal - if they have same key defined as equal
     * 
     * @param  y   another entry to compare keys
     * @return     boolean if determined to be equal
     */
    public boolean equals(Object obj)
    {
        if(!(obj instanceof HashEntry))
            return false;
        HashEntry <K, V> entry = (HashEntry) obj;
        return this.key.equals(entry.key);
        // do not compare values
    }

    //     public int compareTo(Entry<K,V> entry)
    //     {
    //         Comparable thisKey = (Comparable)key;
    //         Comparable otherKey = (Comparable)entry.key;
    //         return thisKey.compareTo(otherKey);
    //     }

    public int hashCode()
    {
        return key.hashCode();
    }
    
    public String toString()
    {
        String result = ""+this.key+"="+this.value;
        return result;
    }
    
    public K getKey()
    {
        return this.key;
    }
    
    public V getValue()
    {
        return this.value;
    }

}
