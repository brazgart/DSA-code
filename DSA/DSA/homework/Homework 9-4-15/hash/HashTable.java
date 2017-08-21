package hash;
import list.*;

/**
 * HashTable - this collection may include duplicates
 * 
 * @author (Dennis Klauder) 
 * @version (October 2015)
 */
public class HashTable <K>
{
    List <List <K>> lists;
    int keyCount = 0;
    static final int MAX=5;
    int maxList = 0;
    boolean noRehash = false;
    /**
     * Constructor for objects of class HashTable
     */
    public HashTable(int size)
    {
        lists = new ArrayList<List<K>>();
        for (int i=0; i<size;i++)
            lists.add(new LinkedList<K>());
    }

    public HashTable()
    {
        this(10);
    }

    /**
     * put the given key into this HashTable
     * @param  
     * @return None
     */
    public void put(K key)
    {
        int code = getCode(key);
        List<K>list = lists.get(code);
        list.add(key);
        keyCount ++;
        if (list.size()>maxList)
            maxList=list.size();
        if (!noRehash)
            rehash();
    }

    /**
     * rebuild the hashTable twice as big
     */
    private void rehash()
    {
        if(maxList>MAX)
        {
            int oldMaxList = maxList;
            maxList=0;
            List <List<K>> newTable = new ArrayList<List<K>>(2*lists.size());
            for(int i=0; i<2*lists.size();i++)
                newTable.add(new LinkedList<K>());
            Iterator <K> itty = this.iterator();
            while (itty.hasNext())
            {
                K key = itty.next();
                int code = (Math.abs(key.hashCode()))%newTable.size();
                newTable.get(code).add(key);
                if(newTable.get(code).size()>maxList)
                    maxList=newTable.get(code).size();
            }
            this.lists=newTable;
            if (maxList==oldMaxList)
            noRehash = true;
        }
    }

    /**
     * @return  true if given object is in this hashTable
     */
    public boolean containsKey(Object obj)
    {
        K key;
        try {
            key = (K) obj;
            int code = getCode(key);
            List<K>list=lists.get(code);
            return list.indexOf(key)>=0;
        }
        catch(ClassCastException cce)
        {
            return false;
        }

    }

    /**
     * @return  the given key from the HashTable, 
     * or null if not found
     */
    public K get (K key)
    {
        int code = getCode(key);
        List<K> list = lists.get(code);
        int ndx = list.indexOf(key);
        if (ndx<0)
            return null;
        return list.get(ndx);
    }

    /**
     * remove given object from this HashTable.
     * @return  true if it was removed
     */
    public boolean remove(Object obj)
    {
        if(!containsKey(obj))
            return false;
        K key=(K)obj;
        List<K>list=lists.get(getCode(key));
        list.remove(key);
        keyCount--;
        return true;
    }

    /**
     * @return the Arraylist
     * position for the given key
     */
    private int getCode(K key)
    {
        return Math.abs(key.hashCode())%lists.size();
    }

    public Iterator<K> iterator()
    {
        return new TableIterator<K>(this);
    }

    /** @return the number of values stored in this HashTable */
    public int size()
    {
        return keyCount;
    }

    /** @return true only if this HashTable is empty */
    public boolean isEmpty()
    {
        return (keyCount==0);
    }

    /** Clear this HashTable, so that it is empty */
    public void clear()
    {   

        for (int i=0; i<lists.size();i++)
            lists.get(i).clear();

        keyCount=0;
    }

    public String toString()
    {
        Iterator <K> itty = this.iterator();
        String result = "[";
        while(itty.hasNext())
        {
            result += itty.next();
            if(itty.hasNext())
                result += ",";
        }
        result += "]";
        return result;

    }
}
