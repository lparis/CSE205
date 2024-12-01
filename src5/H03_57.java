// CLASS: 	H03_57
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package hp3;

import java.util.ArrayList;
import java.util.Scanner;

public class H03_57 
{
    // Recursive search method
    public static int recTernarySearch(ArrayList<Integer> pList, Integer pKey, Integer pLow, Integer pHigh)
    {
    	// If low > high, not found
        if(pLow > pHigh)
        {
        	return -1;
        }
        
        int range = pHigh - pLow;
        int oneThird = (int)Math.round(pLow + range / 3.0);
        int twoThirds = (int)Math.round(pLow + range / 1.3333333333333333);
        if (pKey.equals(pList.get(oneThird))) 
        {
        	return oneThird;
        }
        else if (pKey.equals(pList.get(twoThirds))) 
        {
        	return twoThirds;
        }
        else if (pKey < (Integer)pList.get(oneThird)) 
        {
        	pHigh = oneThird - 1;
        	return recTernarySearch (pList, pKey, pLow, pHigh);
        }
        else if (pKey > (Integer)pList.get(twoThirds)) 
        {
        	pLow = twoThirds + 1;
            return recTernarySearch (pList, pKey, pLow, pHigh);
        }
        else 
        {
        	pLow = oneThird + 1;
            pHigh = twoThirds - 1;
            return recTernarySearch (pList, pKey, oneThird,twoThirds);
        }
    }
    
    // Main method to test the recursive search
    public static void main(String[] args)
    {
        Scanner in = new Scanner( System.in );
        // Get the size of the ArrayList
        System.out.println("Enter the size of the list: ");
        int num = in.nextInt();
        // Initialize ArrayList
        ArrayList<Integer> pList = new ArrayList<Integer>();
        
        // Get the integers for the ArrayList and populate it
        System.out.println("Enter " + num + " integers (numbers): ");
        for (int i = 0; i < num; i++)
            pList.add(in.nextInt());
        
        // Get the key to search for
        System.out.println("Enter the number to search for: ");
        Integer key = in.nextInt();
        
        // Call the recursive method and get result
        int res = recTernarySearch(pList, key, 0, pList.size() - 1);
        if (res == -1)
        {
        	System.out.println(" " + key + " number not found.");
        }
            
        else
        {
        	System.out.println("The number '" + key + "' is found at position '" + res + "' in the list.");
        } 
        in.close();
    }  
}