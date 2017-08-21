package map;
import tree.*;
import set.*;
import list.*;

/**
 * An implementation of map, using a binary Tree
 * 
 * @author (Dennis Klauder) 
 * @version (November 2015)
 */
public class TreeMap<K extends Comparable,V>
implements Map<K,V>
{
    BinaryTree<Entry<K,V>> tree = new EmptyBinarySearchTree();

    /**
     * Constructor for objects of class TreeMap
     */
    public TreeMap()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean containsKey (K key)
    {
        return tree.containsKey (new Entry<K,V>(key,null));
    }

    public V get (K key)
    {
        Entry<K,V> entry = new Entry<K,V>(key,null);
        entry = tree.get(entry);
        if (entry==null)
            return null;
        return entry.value;
    }

    public V put (K key, V value)
    {
        Entry <K,V> newEntry = new Entry <K,V> (key, value);
        Entry<K,V> oldEntry = tree.get (newEntry);
        if(oldEntry ==null)
        {
            tree=tree.add(newEntry);
            return null;
        }
        V oldValue = oldEntry.value;
        oldEntry.value = value;
        return oldValue;
    }

    public V remove (K key)
    {
        Entry<K,V> entry = new Entry<K,V> (key, null);
        entry = tree.get(entry);
        if (entry==null) 
            return null;
        tree=tree.remove(entry);
        return entry.value;
    }

    public int size()
    {
        return this.tree.size();
    }

    public void clear()
    {
        tree = new EmptyBinarySearchTree();
    }

    public boolean isEmpty()
    {
        return this.tree.isEmpty();
    }

    public String toString()
    {
        return this.tree.toString();
    }

    public Set <K> keySet ()
    {
        Set result = new TreeSet();
        Iterator <Entry<K,V>> itty = tree.iterator();
        while (itty.hasNext())
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
