package set;
import tree.*; 
/** Iterate over a TreeSet
 * Remove method needs to update size of the treeset 
 * Subclass of TreeIterator.
 * @author (sdb)
 * @version (Nov 2012)
 */
class TreeSetIterator<E extends Comparable <E>>        
extends TreeIterator <E> 
{    private TreeSet<E> set;
    TreeSetIterator (TreeSet<E> set) 
    {  
        super (set.tree);    // call constructor in super class   
        this.set = set; 
    }

    public void remove()   
    {       
        set.tree = set.tree.remove (super.getLastGotten());   // Accessor method in TreeIterator
        set.size--;
    }    
}