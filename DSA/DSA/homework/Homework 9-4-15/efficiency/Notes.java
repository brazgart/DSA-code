package efficiency;

/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Notes
     */
    public Notes()
    {

    }

    /**
     * void methA(int n)
     * {for (int i=0; i<n;i++0)
     *      print(i*n);
     * }
     * 
     * What is the run time?  (depending on maching speed?)
     * How many times does the print statement execute? n times
     * gets larger as n increases.
     * O(n) - Run time will not exceed k*n for some constant, k.
     * n= size(value here)of input.
     * 
     * 
     * void methB(int n)
     * {for (int i=0; i<1000000;i++0)
     *      print(i*n);
     * }
     * O(1000000)=O(1) (different k value) = demonstrates constant run time.
     * 
     * 
     * void methC(int n)
     * {for (int i=0; i<n;i++0)
     *      for (j=0; j<n; j++)
     *      print(i*n);
     * }
     * 
     * O(n2) [n squared]  increases exponentially
     * 
     * 
     * void methD(int n)
     * {for (int i=0; i<n;i++0)
     *      methA(n);
     * }
     * 
     * O(n2) - also exponentially. method call another loop.
     * 
     * void methE(int n)
     * {for (int i=0; i<n;i++0)
     *     for(int; j=i; j<n;j++)
     *      print(i *j);
     * }
     * 
     * O((n*(n+1))/2)=O(n(n+1))=O(n2+n)
     * reduces to pretty much O(n2) n add negligible addition.
     * 
     * void methF(int n)
     * {for (int i=0; i<n;i++0)
     *     for(int j=0, j<n; j++)
     *        for(int k=0;k<n;k++)
     *      print(i*j*k);
     * }
     * O(n3)
     * 
     * void methG(int n)
     * {for (int i=0; i<n;i++0)
     *      print(i*n);
     *  for (int j=0; j<n;j++);
     *      print(j*n);
     * }
     * O(n+n)=O(2n)=O(n)
     * 
     * 
     * void methH(List<String> list)
     * {
     *     for (int i=0; i<list.size();i++)
     *      print(list.get(i));
     *  }
     *  n represents size of the list.
     *  ArrayList:  O(n)
     *  LinkedList: O(n2) - due to hidden loop in get()
     *  
     *  
     *  int methI(int n)
     *  { if (n<=1)
     *      return 1;
     *  return methI(n-1)*methI(n-1)
     *  }
     *  calls to methI
     *  O(2^n)  -  computationally Hard - just massive amounts of computations
     *  
     *  
     *  void methJ(int n)
     *  {while n>0
     *      {print (n);
     *          n=n/2;
     *      }
     *  O(log(n)) -- searching balancedTree
     *  
     *  O(n*log(n)) -- TreeSearch inside a loop.
     *  
     *  ordering from quickest to slowest
     *  O(1) < O(log(n)) < O(n*log(n))<O(n^2)<O(n^3)<O(n^4).....O(n^e)....O(2^n)<O(n^n)
     *  
     *  10/6/15
     *  
     *  Sorting algorithms
     *  
     *  The sorting problem
     *  Given a list of items which can be compared for ordering
     *  arrange the list in ascending or descending order
     *  
     *  A sorting algorithm in one which solves the sorting problem
     *  
     *  Selection Sort
     *  1   Scan the list starting at position i=0 and swap postion i with the 
     *  smallest value from position i to the end. (duplicate values are allowed)
     *  2   repeat step 1, for i=1,2,.... n-2) where n is the size.
     * 
     * x.compareTo(y)
     * if x<y   -  returns negative
     * if x>y   -  returns positive
     * if x==y  -  returns zero
     * 
     * 
     * Bubble sort
     * 1.   swap each position with its neighbor if necessary, stopping at position n-1
     * initially i is 0.
     * 2.   repeat step 1 for increasing values of i
     * 3.   each loop requires that last element not needed to be checked.
     * 4.   first element does not need to have loop of its own.
     * 
     * 
     * 
     */

}
