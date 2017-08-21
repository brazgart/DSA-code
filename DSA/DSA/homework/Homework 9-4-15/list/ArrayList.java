package list;

/**
 * Write a description of class ArrayList here.
 * 
 * @author (Dennis Klauder) 
 * @version (Sept 2015)
 */

public class ArrayList<E> implements List <E>
{
    int size=0;
    E[] values;

    public ArrayList()
    {
        //values = new E[10]; //array cannot be created with unspecified type.
        values = (E[]) new Object[10]; //use casting instead to satisfy compiler.
    }

    public ArrayList(int size)
    {
        values = (E[]) new Object[size]; //use casting instead to satisfy compiler.
    }

    public E get (int ndx){
        return values [ndx];
    }

    public E set (int ndx, E value)
    {
        E result = values[ndx];//getting old value
        values[ndx]=value;//replace item
        return result;
    }

    public void clear()
    {size=0;}

    public void add(int ndx, E value)
    {
        if( size==values.length)
            alloc();

        for (int i=size;i>ndx;i--)
            values[i]=values[i-1];

        values[ndx]= value;
        size++;
    }

    private void alloc(){
        E[] temp = (E[])new Object[2*values.length];
        for(int i=0; i<size;i++)
            temp[i]=values[i]; //copy data to new array
        values=temp;//set new array as assigned reference
    }

    public void add(E value){
        add(size, value);
    }

    public E remove(int ndx){
        E result = values[ndx];
        for(int i=ndx;i<size-1;i++)
            values[i]=values[i+1];
        size--;
        return result;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty()
    {
        boolean result = false;
        if (size==0)
        {
            result=true;
        }
        return result;
    }

    /**
     * @return the position of the first occurrence of the given value in
     * this list or -1 if not found
     */
    public int indexOf (Object value)
    {
        //       int result = -1;
        //
        //        for (int i=0;i<size;i++)
        //        {
        //            if(value.equals(values[i]))
        //            {
        //                return i;
        //            }
        //        }
        //        return result;
        return indexOf(0,value);

    }

    private int indexOf(int start, Object obj)
    {
        if (start==size)
            return -1;
        if(values[start].equals(obj))
            return start;
        return indexOf(start+1,obj);
    }

    /**
     * @return true only if the given value is contained in this List
     */
    public boolean contains (Object value)
    {
        /**
         *boolean result = false;
         *if( indexOf(value)==-1){
         *    result = false;
         *  }
         *  else{result = true;}
         */
        return indexOf(value)!=-1;
    }

    /** @return the elements of this List as a String,
     * with elements separated by commas, enclosed in square brackets:
     * [a,b,c]
     */
    public String toString( )
    {
        String result = "[";
        if(size==0){
            result+="]";
        }
        else
        {
            for (int i=0;i<size-1;i++)
            {
                result += values[i]+",";
            }
            result+=values[size-1]+"]";
        }
        return result;
    }

    /** @return true only if this List is equal to the 
     * parameter, other 
     */
    public boolean equals (Object other)
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
        for (int i=0;i<size;i++)
        {
            if(!values[i].equals(test.get(i)))
            {
                return false;
            }
        }
        return true;
    }

    public Iterator<E> iterator()
    {
        return new ArrayIterator<E> (this);
    }

    public boolean remove (Object obj)
    {
        int itemndx= this.indexOf(obj);
        if (itemndx==-1){
            return false;
        }
        else{
            this.remove(itemndx);
            return true;
        }
    }

    public ListIterator<E> listIterator()
    {
        return new ArrayListIterator<E>(this);
    }

    public ListIterator<E> listIterator(int start)
    {
        return new ArrayListIterator<E>(this, start);
    }
}

