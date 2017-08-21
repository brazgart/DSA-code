package queue;

/**
 * An ADT which is a first-in first-out list.
 * Values are added at the "back" and removed from the
 * "front"
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public interface QueueADT<E>
{
    /**
     * Add the given value at the back of this queue
     * 
     * @param       the object to be added to the back of the list
     * @return        void
     */
    void add(E value);

    /**
     * Remove the value at the front of the Queue
     * 
     * @return that value
     * Pre: This queue is not empty
     */
    E remove();

    /**
     * @return the value at the front of this Queue, or null if empty
     */
    E peek();

    /**
     * @return the size of the queue
     */
    int size();

    /** 
     * Clear this QueueADT 
     */
    void removeAll();

    /** Return the elements of this QueueADT as a String, 
     * separated by commas and enclosed in brackets. The front of the 
     * QueueADT should be the first element.
     * [front,middle,back]
     */
    String toString();
    
    boolean isEmpty();
}
