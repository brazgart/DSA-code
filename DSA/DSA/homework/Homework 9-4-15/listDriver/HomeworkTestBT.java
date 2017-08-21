package listDriver;

import tree.*;
import list.*;

/**
 * Test the binary search tree implementation.
 * 
 * @author (sdb) 
 * @version (Mar 2015)
 */
public class HomeworkTestBT
{

    public static void main( )
    {
        BinaryTree <String> kids = new EmptyBinarySearchTree <String> ();

        if (!kids.isEmpty ())
            System.out.println ("Not correct 1");

        kids = kids.add ("kimmy");
        kids = kids.add ("jimmy");
        kids = kids.add ("susie");
        kids = kids.add ("joe");
        kids = kids.add ("jo");  //
        kids = kids.add ("sue");
        kids = kids.add ("al");
        // With an inorder traversal, names should appear in alphabetic order
        System.out.println (kids);

        kids.remove ("kimmy");
        System.out.println (kids);
        kids.add ("kimmy");
        System.out.println (kids);
        kids.remove ("susie");
        System.out.println (kids);

        if (! kids.get("sue").equals ("s" + "u" + "e"))
            System.err.println ("Not correct 2");

        // Iterator should also provide an inorder traversal
        Iterator <String> itty = kids.iterator();
        while (itty.hasNext())
            System.out.println (itty.next());

        System.out.println("The smallest value is "+kids.getSmallest()); // final

        // remove all strings which are longer than 3 chars
        itty = kids.iterator();
        while (itty.hasNext())
            if (itty.next().length() > 3)
                itty.remove();

        System.out.println (kids);      // Should be  [al,jo,joe,sue]
    }
}
