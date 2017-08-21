package listDriver;

import map.*;
import set.*;
import list.*;
import java.io.*;

import sort.*;

public class CodeBreaker
{

    public static void main()
    {
        /**
         * enter contents of file into map
         */
        Map <String, String> codes = new TreeMap <String, String>();
        //Map <String, String> codes = new HashMap <String, String>(10000);
        List <String> words = getWords();
        Iterator <String> itty = words.iterator();
        
        while(itty.hasNext())
        {
            
            String wordGiven = itty.next();
            String anagram = sort(wordGiven);
            String doesExist=(codes.get(anagram));
            if (doesExist ==null)
                codes.put(anagram, wordGiven);
            else 
                codes.put(anagram, (doesExist +", " + wordGiven));
            }
        

        /**
         * search for words of code
         */
        //niaiuanmrisotzrtiiocm fo uealcisonlesm npesoaw tpso nialtrenosotiaertuc
        String w0 ="niaiuanmrisotzrtiiocm";
        String w1 = "fo";
        String w2 = "uealcisonlesm";
        String w3 = "npesoaw";
        String w4 = "tpso";
        String w5 = "nialtrenosotiaertuc";
String w6 = "cronee";

        String r0 = sort(w0);
        String r1 = sort(w1);
        String r2 = sort(w2);
        String r3 = sort(w3);
        String r4 = sort(w4);
        String r5 = sort(w5);
        String r6 = sort(w6);
        
        System.out.println(codes.get(r0));
        System.out.println(codes.get(r1));
        System.out.println(codes.get(r2));
        System.out.println(codes.get(r3));
        System.out.println(codes.get(r4));
        System.out.println(codes.get(r5));
System.out.println(codes.get(r6));
    }
    // get a list of English words from a text file
    private static List <String> getWords ()
    {
        List <String> strings = new ArrayList <String> (1000000);
        try
        {
            File wordFile = new File ("words.txt");
            java.util.Scanner scanner = new java.util.Scanner (wordFile);
            String word;
            while (scanner.hasNextLine())
                strings.add (scanner.nextLine());
        }
        catch (FileNotFoundException fnfe)
        {   System.out.println (fnfe);   }
        return strings;
    }

    /** @return the given string, with letters in alphabetic order
     *  If str is "pots" the result should be "opst"
     */
    private static String sort (String str)
    {   List <Character> chars = new ArrayList <Character> ();
        for (int i=0; i<str.length(); i++)
            chars.add (str.charAt(i));
        //////////
        ///////// Call a sorting algorithm, or sort the list of chars here.
        Sorter<Character> sorter;
        sorter = new QuickSort<Character> ();
        sorter.sort(chars);
        /////////
        String result = "";
        Iterator <Character> itty = chars.iterator();
        while (itty.hasNext())
            result += itty.next();
        return result;
    }

}
