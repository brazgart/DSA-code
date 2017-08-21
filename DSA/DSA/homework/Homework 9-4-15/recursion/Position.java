package recursion;

/**
 * Write a description of class Point here.
 * 
 * @author (Dennis Klauder) 
 * @version (11/24/15)
 */
public class Position
implements Comparable <Position> // for priority queues
{
    // instance variables - replace the example below with your own
    int row, col;

    /**
     * Constructor for objects of class Point
     */
    public Position( int r, int c)
    {
        row = r;
        col = c;
    }

    /**
     * @return true if this pos is attacking other 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean isAttacking(Position other)
    {
        return (row==other.row)||(col == other.col)||
        majorDiagonal(other)|| minorDiagonal(other);
    }

    private boolean majorDiagonal(Position other)
    {
        return row+col==other.row+other.col;
    }

    private boolean minorDiagonal(Position other)
    {
        return row-col == other.row-other.col;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Position)) 
            return false;
        Position other = (Position) obj;
        return row==other.row&&col==other.col;
    }

    public String toString()
    {
        String result ="";
        result += "("+row+","+col+")";
        return result;
    }

    public int compareTo(Position other)
    {
        if (row > other.row)
            return -1;
        if (row==other.row&&col>other.col)
            return -1;  
        if (row==other.row&&col<other.col)
            return 1;   
        return 0;

    }
    //comparable
}
