package listDriver;
import queue.*;
/**
 * A Printer has a speed, in blocks of printing per step, and a queue of Docs to be printed
 * 
 * @author (sdb, Dennis Klauder) 
 */
public class Printer
{
    private int speed;      // speed of this printer, blocks per step
    private QueueADT <Doc> docs;    // Queue of documents waiting to be printed
    private String id;      // name of this Printer

    private int blksRemain=0;
    private Doc currentJob = null;
    /**
     * Constructor for objects of class Printer
     */
    public Printer(int speed, String id)
    {
        this.speed = speed;
        docs = new Queue <Doc> ();            
        this.id = id;
    }

    /** Add a document to this printer's queue */
    public void add (Doc doc)
    {    
        docs.add(doc);
        System.out.println("          "+doc + " added to "+ this.id
            +" , speed: "+this.speed+", docs in queue: "+ docs.size());

    }

    /** Print several blocks, if necessary, determined by this printer's speed
     *  
     */
    public void print()
    {  
        //System.out.println(docs);
        //System.out.println(docs.size()+" Size");
        //System.out.println(docs.peek()+ "next doc");
        if (currentJob == null &&  docs.peek()!=null)
        {
            //System.out.println("job empty "+blksRemain + " " + this.id+ " " + currentJob);
            // System.out.println(docs.size());
            currentJob = docs.peek(); //remove();
            blksRemain = currentJob.size();
            // System.out.println(blksRemain + " " + this.id+ " " + currentJob);
        }
        if (currentJob != null &&  blksRemain >0 )
        {
            blksRemain -= this.speed;
            //  System.out.println("in progress" +blksRemain + " " + this.id+ " " + currentJob);
        }
        if (currentJob != null && blksRemain <=0 )
        {
            //follow up here, print job for 1 block doc
            System.out.println("          Print task completed on " +this.id+" for: "
                +currentJob);
            docs.remove();
            currentJob = null;
        }
    }

    /** @return the number of documents in this Printer's queue */
    public int size()
    {   return docs.size();  }

    public String toString()
    {   return id + ", speed: " + speed + ", docs in queue: " + size();  }

}
