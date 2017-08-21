package recursion;

/**
 * @return n!
 * Pre: n>=0
 * 
 * @author (Dennis Klauder) 
 * @version (9-29-15)
 */
public class Recursion
{
    // instance variables - replace the example below with your own
    private int n;

    /**
     * Constructor for objects of class Recursion
     */
    public Recursion()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     n! 
     */
    public static int fact(int n)

    {
        // put your code here
        if (n<2)
            return 1;
        return n*fact(n-1);
    }

    /**
     * @return nth number in fibonaci sequence
     */
    public static int fib(int n)
    {
        //base case
        if (n<2)
            return 1;
        //recursive case
        return fib(n-1)+fib(n-2);
    }

    /**
     * multiply numbers without using *
     */
    public static int mult(int a, int b)
    {    // base case
        if (a==1)
            return b;
        return mult(a-1,b)+b;
    }  

    /**
     * @return true only if given string is a palindrome
     */
    public static boolean pal(String s)
    {
        if(s.length()<2)
            return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        return pal(s.substring(1,s.length()-1));
    }

    /** @return the remainder when a is divided by b.
    Pre:  a is not negative and b is positive
     */
    public static int mod (int a, int b)
    {
        if (a<b)
        return a;
        return mod((a-b),b);
    }

    /**
     * [a,b,c]
     * head = [a]
     * tail [b,c]
     * 
     * head in each position beginning, middles, end
     * base case list size 1 or 0
     * 
     * add results to a set (no dupes allowed, so dupes will overwrite)
     * make sure to add a new list (not a reference to a list)
     */
}
