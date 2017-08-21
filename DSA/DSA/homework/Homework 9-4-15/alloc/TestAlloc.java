package alloc;

/**
 *Test the memory allocator.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAlloc
{

    public static void main()
    {
        int v1, v2, v3, v4,v5;
        Memory mem = new Memory();
        v1 = mem.allocate (100);
        v2 = mem.allocate (200);
        v3 = mem.allocate (300);
        v4 = mem.allocate (400);
        v5 = mem.allocate (500);
        System.out.println (mem);
        mem.free (v2);
        mem.free(v4);
        System.out.println (mem);
        
        v2 = mem.allocate(250);
        v4 = mem.allocate(200);
        System.out.println(mem);
    }
}
