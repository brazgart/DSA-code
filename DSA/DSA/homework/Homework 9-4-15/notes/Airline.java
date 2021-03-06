package notes;
import list.*;
import map.*;
import java.util.Scanner;
import java.io.*;
import queue.*;

/**
 * Write a description of class Airline here.
 * 
 * @author (Dennis Klauder) 
 * @version (December 2015)
 */
public class Airline
{
    List <Flight> flights = new LinkedList<Flight>();   // Direct flights
    Map <String, Airport> map = new HashMap <String, Airport>();    //Maps airport names to airports

    public static void main()
    {

        Airline airline = new Airline();

        airline.getFlights();   // Fill in lists of flights and set up the map

        System.out.println ("Flights: " + airline.flights);
        System.out.println ("Map: " + airline.map);

        // Find some paths
        System.out.println ("Path from CVG to Paris ");
        System.out.println (airline.path ("CVG", "Paris"));

        airline.clearAirports();
        
        // Find some paths

        airline.map.get("PHL").setHub(true);
        System.out.println ("Path from CVG to Paris with Priority");
        System.out.println (airline.path ("CVG", "Paris"));

    }
    private void getFlights()
    {
        File infile = new File ("flights.txt"); // should be in the project directory

        try{
            Scanner  scanner = new Scanner (infile);
            String flight, origin, dest;
            Airport o,d;

            while(scanner.hasNextLine())
            {
                flight = scanner.nextLine();
                origin = flight.split (" ")[0];
                dest   = flight.split (" ")[1];

                if (map.containsKey (origin))
                    o= map.get(origin);
                else
                {
                    o = new Airport (origin);
                    map.put (origin,o);
                }
                if(map.containsKey(dest))
                    d=map.get(dest);
                else
                {
                    d = new Airport (dest);
                    map.put (dest,d);
                }
                flights.add (new Flight (o,d));
            }
            scanner.close();    // innput file is now available to other processes
        }
        catch (IOException ioe)
        {System.err.println (ioe);}
    }

    /**
     * @return a path from origin to dest, ar an empty list if 
     * no such path exists
     */
    private List<Airport> path (String origin, String dest)
    {
        Airport o = map.get(origin);
        Airport d = map.get(dest);
        List <Airport> result = path(o,d);
        clearAirports();

        return result;
    }

    /**
     * @return a path from origin to dest, ar an empty list if 
     * no such path exists
     */ 
    private List <Airport> path (Airport origin, Airport dest)
    {
        List<Airport> result = new LinkedList<Airport> ();
        origin.visited = true;
        if (origin.equals(dest))    //base case
        {result.add(origin);
            return result;
        }
        Airport port;
        PriorityQueue<Airport> queue = getDirect (origin);
        while(queue.isEmpty()==false)
        {
            port = queue.remove();
            result = path(port,dest);
            if(result.size()>0)
            {
                result.add(0,origin);
                return result;
            }
        }
        return result;
    }

    /**
     * @return a list of all airports which can be reached directly from 
     * given origin and has not been visited.
     */
    private PriorityQueue<Airport> getDirect(Airport from)
    {
        PriorityQueue<Airport> result = new PriorityQueue<Airport> ();
        Flight flight;
        Iterator <Flight> itty = flights.iterator();

        while(itty.hasNext())
        {flight = itty.next();
            if (flight.origin.equals(from) && !flight.dest.visited)
                result.add(flight.dest);
        }
        return result;
    }

    private void clearAirports()
    {
        Flight flight;
 
        Iterator<Flight> itty = flights.iterator();
        while (itty.hasNext())
        {
            flight = itty.next();
            flight.origin.visited = false;
            flight.dest.visited = false;
        }
    }

}
