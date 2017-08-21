package alloc;

/**
 * A Block is a unit of memory.
 * A Block has a start position, and a size.
 * 
 * @author (Dennis Klauder) 
 * @version (December 2015)
 */
class Block
implements Comparable <Block>
{
    int start;   // starting position of this Block
    int size;    // size (in bytes?) of this Block

    Block (int start, int size)
    {
        this.start = start;
        this.size = size;
    }

    //display start and ending positions
    public String toString()
    {
        return "(" + start + "->"+ (start+size-1) + ")";
    }

    public int compareTo(Block block)
    {
        if (size < block.size)
            return 1;
        if (size > block.size)
            return -1;
        return 0;
    }

}
