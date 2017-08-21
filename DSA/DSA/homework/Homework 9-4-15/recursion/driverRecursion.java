package recursion;

/**
 * Test the recursive Class
 * 
 * @author (Dennis Klauder) 
 * @version (09-29-15)
 */
public class driverRecursion
{
    public static void main()
    {   
        System.out.println(Recursion.fact(5));  //should be 120
        System.out.println(Recursion.fib(10));
        System.out.println(Recursion.mult (10,5)); //should be 50
        System.out.println(Recursion.pal("racecar"));  //should be true
        System.out.println(Recursion.pal("dennis"));    //should be false
        System.out.println("8 % 3  ="+Recursion.mod(8,3));    //should be 2
        System.out.println("5 % 8  ="+Recursion.mod(5,8));    //should be 5
        System.out.println("25 % 3  ="+Recursion.mod(25,3));    //should be 1
    }

}   