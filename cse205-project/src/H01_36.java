// CLASS: 	H01_31
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu



// Import the ArrayList class
import java.util.ArrayList;
import java.util.Collections;

// Define the H01_31 class 
public class H01_36 {
	
	// Default constructor for the class
	public H01_36()
	{
		
	}
	
	/**
	 * Public instance method named insertName() that takes
	 * two inputs. Method uses binary search to insert new names 
	 * in the list alphabetically. Driver needs to supply the 
	 * ArrayList<String> object and a pre-sorted list of names.
	 * @param ArrayList<String> aList
	 * @param String aName
	 */
	public void insertName(ArrayList<String> pList, String pName)
	{
		int insertNewName = Collections.binarySearch(pList, pName);
		
		if (insertNewName < 0)
		{
			insertNewName = (insertNewName * -1) -1;
		}
		
		pList.add(insertNewName, pName);
	}
}