package list;

/**
 * Write a description of class LinkedList here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */
public class LinkedList<E> 
implements List <E>
{
    // instance variables - replace the example below with your own
    int size=0;
    Node<E> head;
    Node<E> tail;
    private Node<E> ref;

    public LinkedList(){
        /**
         * Constructor for objects of class LinkedList
         */

        head=new Node<E> (null, null, null); // initialise instance variables //tail not available yet.
        tail=new Node<E> (null, null, head); // initialize tail node
        head.next=tail;
        //tail=head;                      //Dummy(placeholder)node created
        //commented out as we modified to doubly linked list - needed separate node.
    }

    public void add(E value){
        Node<E> temp=new Node<E>(value, tail, tail.prev);   //added new parameter.
        tail.prev = temp;
        temp.prev.next=temp;    //changing reference on prev node.
        size++;
    }

    public E get(int ndx){  //understood that ndx cannot be greater than size or negative
        setRef(ndx);
        return ref.value;
    }

    public E set(int ndx, E value)
    {
        setRef(ndx);    //calls new set reference method
        E result=ref.value;
        ref.value=value;
        return result;
    }

    public void add(int ndx, E value)
    {
        /** Node<E> ref=head;
         * for(int i=0;i<ndx;i++)
         * ref=ref.next;
         **/
        if(ndx==size) //added late based on professor's code
            add(value);
        else
        {

            setRef(ndx);

            Node<E> temp=new Node<E>(value,ref,ref.prev);
            ref.prev = temp;
            temp.prev.next= temp;
            size++;
            //if (ref==tail)tail = temp;
        }
    }

    public E remove (int ndx)
    {
        E result = get(ndx);
        ref.prev.next=ref.next; //set next ref of previous node
        ref.next.prev=ref.prev;//set prev ref of next node to omit removed node
        size--;
        return result;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        boolean result = false;
        if (size==0)
        {
            result = true;
        }
        return result;
    }

    public void clear()
    {
        size = 0;
        head.next = tail;
        tail.prev = head;
        ref=null;
    }

    /**
     * @return the position of the first occurrence of the given value in
     * this list or -1 if not found
     */
    public int indexOf (Object value)
    {
        //int counter = 0;
        ref = head;
        ref=ref.next;

        //while(ref!=tail)
        for(int i = 0; i < size;i++)
        {

            if (ref.value.equals(value))
                return i;
            //counter++;
            ref=ref.next;
        }
        return -1;
    }

    /**
     * @return true only if the given value is contained in this List
     */
    public boolean contains (Object value)
    {

        return (indexOf(value)!=-1);
    }

    /** @return the elements of this List as a String,
     * with elements separated by commas, enclosed in square brackets:
     * [a,b,c]
     */
    public String toString( ){
        ref=head;
        String result ="[";
        if(size==0){
            result+="]";
        }
        else
        {
            for(int i=0;i<size-1;i++)
            {
                ref=ref.next;
                result += ref.value+",";
            }
            ref = ref.next;
            result += ref.value+"]";
        }

        return result;    
    }

    /** @return true only if this List is equal to the parameter, other */
    public boolean  equals (Object other)
    {
        if(!(other instanceof List))
        {
            return false;
        }
        List test = (List)other;
        if(!(size==test.size()))
        {
            return false;
        }
        setRef(0);
        Iterator <E> testList = test.iterator();
        while(testList.hasNext())
        {
            if(!ref.value.equals(testList.next()))
            {
                return false;
            }
            ref=ref.next;
        }
        return true;
    }

    private void setRef(int ndx)
    {

        if(ndx<size/2)
        {
            ref = head.next;
            for(int i=0; i<ndx;i++)
                ref=ref.next;
        }
        else
        {
            ref=tail.prev;
            for(int i=size-1; i>ndx; i--)
                ref=ref.prev;
        }
    }

    /**  Arrange the values of this LinkedList in ascending order.  Performance should be O(n^2). */
    public void bubbleSort()
    {
        for (int i=0; i < size()-1; i++)
        {
            setRef(0);
            for(int j=0; j < size()-i-1; j++)
            {

                if(( (Comparable)ref.value).compareTo( ((Comparable)ref.next.value) )>0)
                {
                    Node<E> temp = new Node(ref.value,null, null);
                    ref.value = ref.next.value;
                    ref.next.value = temp.value;

                }
                ref=ref.next;
            }
        }
    }

    public Iterator<E> iterator()
    {
        return new RefIterator<E>(this);
    }

    public boolean remove (Object obj)
    {
        int itemndx=this.indexOf(obj);
        if(itemndx==-1)
            return false;
        else
        {
            this.remove(itemndx);
            return true;
        }

    }

    public ListIterator<E> listIterator()
    {
        return new RefListIterator<E>(this);
    }

    public ListIterator<E> listIterator(int start)
    {
        return new RefListIterator<E>(this, start);
    }
}
