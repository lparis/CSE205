// CLASS: 	H01_35
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

//Import the ArrayList class
import java.util.ArrayList;

//Define the H01_35 class 
public class H01_35
{
	// Default constructor for the class
	public H01_35()
	{
		// empty constructor
	}

	/**
	 * Public instance method ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) 
	 * takes as input an integer for the length of the ArrayList and an integer
	 * for the initial value of each of the ArrayList elements.
	 * @param int pLen
	 * @param int pInitValue
	 * @return ArrayList<Integer>
	 */
	public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue)
	{	
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <= pLen; i++)
		{
			list.add(i, pInitValue);
		}
		
		return list;	
	}
}