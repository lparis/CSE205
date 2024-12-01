// CLASS: 	H01_31
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

// Import the ArrayList class
import java.util.ArrayList;

// Define the H01_31 class 
public class H01_31 {
	
	// Default constructor for the class
	public H01_31()
	{
		
	}
	
	/**
	 * Public instance method named arrayListInit() that creates
	 * an ArrayList<Integer> object named "list" and fills it with
	 * the following ten numbers: 0 1 2 3 4 0 1 2 3 4
	 * @return list
	 */
	public ArrayList<Integer> arrayListInit()
	{
		// Constructs an empty array list that can hold Integers.
		ArrayList<Integer> list = new ArrayList<>();

		// For loop #1 to populate indices 0 - 4 in the array
		for (int i = 0; i < 5; i++)
		{
			list.add(i);
		}
		
		// For loop #2 to populate indices 5 - 9 in the array
		for (int j = 0; j < 5; j++)
		{
			list.add(j);
		}
		
		// Return the list ArrayList
		return list;
	}
}