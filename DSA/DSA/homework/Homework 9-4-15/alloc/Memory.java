package alloc;
import list.*;
import queue.*;

/**
 * Simulate teh allocation and freeing of blocks of memory.
 * 
 * @author (Dennis Klauder) 
 * @version (December 2015)
 */
public class Memory
{
    //Blocks which have been allocated 
    List <Block> allocated = new LinkedList<Block> ();
    //Blocks which are available for use.
    List <Block> free = new LinkedList<Block> ();
    static final int MAX = 4096;

    public Memory()
    {
        free.add(new Block (0,MAX));    //all memory is available
        //allocated list is empty
    }

    /**
     * allocate a block of the given size, if possible
     * @return its position in memory (address), or -1 if space is not available.
     * Use First-fit algorithm (Use the first available block which fits)
     */
    public int allocate (int size)
    {
        Block b, newBlock = null;
        QueueADT <Block> sortedFree = new PriorityQueue <Block>();
        Iterator <Block> freeItty = free.iterator();
        while (freeItty.hasNext())
        {
            sortedFree.add(freeItty.next());
        }
        while (!sortedFree.isEmpty())
        {
            b = sortedFree.remove();
            if (b.size >=size)
            {
                newBlock = new Block (b.start, size);
                allocated.add(newBlock);
                b.start = b.start+size;
                b.size=b.size - size;
                if (b.size==0)
                {
                    int bIndex = free.indexOf(b);
                    free.remove(bIndex);  //  freeItty.remove(); //remove from free list
                }
                return newBlock.start;
            }

        }
        return -1;
    }

    /**
     * Free, or deallocate, a block which is in use.
     * return it to the free storage list.
     * @param start The starting position of the block to be freed.
     * @throws IllegalArgumentException if there is no block at the given starting position.
     */
    public void free (int start)
    {
        Block b;
        //Search list of allocated blocks, for a block which has the given start position
        Iterator <Block> itty = allocated.iterator();
        while (itty.hasNext())
        {
            b = itty.next();
            if(b.start==start)
            {
                itty.remove();
                free.add(b);
                consolidate(b);
                return;
            }
        }
        throw new IllegalArgumentException ("No block with given start: " + start);
    }

    private void consolidate(Block a)
    {
        Block b;
        Iterator <Block> itty = free.iterator();
        while(itty.hasNext())
        {
            b = itty.next();
            if(a.start < b.start) // if b is after new added block
            {
                if ((a.start + a.size)==b.start)
                {
                    a.size+=b.size;
                    itty.remove();
                }
            }
            if(b.start < a.start) // if b is before new added block
            {
                if ((b.start + b.size)==a.start)
                {
                    a.size+=b.size;
                    a.start = b.start;
                    itty.remove();
                }
            }

        }

    }

    public String toString()
    {
        return "allocated: "+allocated +  " \nfree" + free;
    }
}	