package listDriver;
import tree.*;

/**
 * Test the balanced binary search tree class.
 * 
 * @author (sdb) 
 * @version (Nov 2015)
 */
public class BalancedDriver
{
    public static void main()
    {   BinaryTree<Integer> tree = new BalancedBinarySearchTree<Integer>(0);
        
        for (int i=1; i<1000; i++)
            tree = tree.add (i);
        System.out.println ("The height of the tree is " + tree.getHeight());
        }
}
