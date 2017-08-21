package recursion;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static final int SIZE=30;

    public static void main()
    {
        long startTime = System.currentTimeMillis();
        Game game = new Game();
        System.out.println( game.placeQueen(0,new Board()));
        long endTime = System.currentTimeMillis();
        System.out.println("That took "+(endTime-startTime)+" milliseconds");
    }

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {

    }

    /**
     * attempt to place queens in colums col-SIZE-1 on board b, 
     * return resulting Board, or null if not possible
     */
    private Board placeQueen(int col, Board b)
    {
        Position p;
        Board result = null;
        for(int row=0;row<SIZE; row++)
        {
            p = new Position(row,col);
            result = new Board(b);
            result.addQueen(p);
            //System.out.println(result);   //will display each attempt to place a queen
            if(!result.check()) //placed success - try next column.
            {
                if(col==SIZE-1)// base case. end of board
                    return result;
                result=placeQueen(col+1, result);
                if(result!=null)
                    return result;
            }
        }   
        return null; //failed to place a queen in given col
    }
}
