// CLASS: 	H01_31
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu



// Import the ArrayList class
import java.util.ArrayList;

// Define the H01_31 class 
public class H01_37 
{
	
	// Default constructor for the class
	public H01_37()
	{
		
	}

	public void arrayListRemove(ArrayList<Integer> pList, int pValue)
	{
		System.out.println("This is the ArrayList: ");
		for (int i = 0; i < pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
		
		System.out.println("This is the value to be removed: " + pValue);
		
		// Remove the matching element from the list
		for (int i = 0; i < pList.size(); i++)
		{
			if ((Integer)pList.get(i) == pValue)
			{
				pList.remove((Integer)pValue);
			}
		}

		System.out.println("The resulting ArrayList is: ");
		for (int i = 0; i < pList.size(); i++)
		{
			System.out.println(pList.get(i));
		}
	}
}