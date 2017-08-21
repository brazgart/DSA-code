package recursion;
import list.*;

/**
 * Represent a chess board for N Queens.
 * 
 * @author (Dennis Klauder) 
 * @version (11/24/15)
 */
public class Board
{
    List<Position> queens = new ArrayList <Position>(Game.SIZE*Game.SIZE);

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {

    }

    public Board (Board b)
    {
        // queens = new LinkedList <Position> (b.queens);

        Iterator<Position> itty = b.queens.iterator();
        while(itty.hasNext())
            queens.add(itty.next());    
    }

    public void addQueen(Position p)
    {
        queens.add(p);
    }

    /**
     * return true if some queen is attacking some other queen
     */
    public boolean check()
    {
        Iterator <Position> itty1 = queens.iterator(), itty2;
        Position p, other;
        while(itty1.hasNext())
        {
            p=itty1.next();
            itty2=queens.iterator();
            while( itty2.hasNext())
            {
                other = itty2.next();
                if(p.isAttacking(other)&&!(p.equals(other)))
                    return true;
            }
        }
        return false;
    }

    // toString()
    public String toString()
    {
        Position queenPos;
        String result="";
        Iterator <Position> itty = queens.iterator();
        result += "{";
        while (itty.hasNext())
        {
            result+=itty.next();
        }
        result += "}"; //needed for empty list
        if (queens.size()==0)
            return result;
        result += "\n\n";
        //board printout
        for(int row=0;row<Game.SIZE;row++)
        {

            for (int col=0;col<Game.SIZE;col++)
            {
                if (queens.contains(new Position(row,col)))
                result += " Q ";
                else
                result += " - ";
            }
            result += "\n";
        }
        return result;
    }
    
}

