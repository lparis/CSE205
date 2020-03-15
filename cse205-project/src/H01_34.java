// CLASS: 	H01_34
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

//Import the ArrayList class
import java.util.ArrayList;

//Define the H01_34 class 
public class H01_34
{
	// Default constructor for the class
	public H01_34()
	{
		// empty constructor
	}

	/**
	 * Public instance method named Integer arrayListCreate(ArrayList <Integer> pList) 
	 * which takes as input an ArrayList ArrayList<Integer> object 
	 * and returns the sum of the elements in the ArrayList.
	 * An enhanced for loop is used to compute the sum of the elements.
	 * Note that the driver/test class must submit an ArrayList populated with integers.
	 * @param ArrayList <Integer> pList
	 * @return sum
	 */
	public Integer arrayListCreate(ArrayList <Integer> pList)
	{	
		int sum = 0;		
		for (Integer element : pList)
		{
			sum = sum + element;
		}
		// System.out.println(pList);
		return sum;	
	}
}