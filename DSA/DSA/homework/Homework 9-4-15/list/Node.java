package list;

///package List;

/**
 * Write a description of class Node here.
 * 
 * @author (Dennis Klauder) 
 * @version (9/8/15)
 */
class Node<E>
{
    //initialization of fields
    E value;
    Node<E> prev;   //added to allow a doubly linked list - allows user to step backwards in list
    Node<E> next;

    Node(E value, Node<E> next,Node<E> prev){
        this.value=value;
        this.next=next;
        this.prev=prev;
    }
}
/**
 * access
 * 
 * public - can be accessed from any class
 * 
 * protected - access from subclasses OR from within the same package
 * 
 * private - can be accessed ONLY from within the same class
 * 
 * [default] - accessed from within the same package
 */

