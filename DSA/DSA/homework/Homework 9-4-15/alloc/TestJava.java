package alloc;
import list.*;

/**
 * Test the limitations of memory, in Java.
 * 
 * @author (Dennis Klauder) 
 * @version (December 2015)
 */
public class TestJava
{
    static final int MAX = (int) 1e5; //100,000
    static List<char[]> list;

    public static void main()
    {
        char [] buffer;
        int size =2;
        for(int i=0; i<100; i++)
        {
            System.out.println ("i=" + i + ", size=" + size);
            buffer= new char[size];
            size = size *2;
        }
    }

    public static void testMemory()
    {
        list = new ArrayList <char []>();
        for (int i=0; i<1000; i++)
        {
            System.out.println (i);
            list.add (new char [MAX]);
        }
        char [] buffer= new char[MAX*5000];
    }

    //Fragmentation of the heap - chunks of memory are being freed up to be used again
    public static void testFrag()
    {
        testMemory();
        for (int i=0; i<list.size();i++)
            if(i%10 !=0)
                list.set (i,null);
                char [] buffer = new char [MAX*6000];
    }
}
