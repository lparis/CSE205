// lparis
// Class that demonstrates a Recursive Binary Search

package module4;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveBinarySearch 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list = createArrayListInt();
		System.out.println("-- Recursive Binary Search --");
		printArrayListInt(list);
		int key = getKey();
		int result = recursiveBinarySearch(list, key, 0, list.size() - 1);
		returnResult(result, key, list);
		in.close();
	}
	public static int recursiveBinarySearch(ArrayList<Integer> pList, int pKey, int pLow, int pHigh)
	{
		// Base case. When pLow is greater than pHigh, we have an empty list.
		// pKey cannot be in an empty list, so we return -1 (not found).
		if (pLow > pHigh)
		{
			return -1;
		}
		// Split the list in half
		int middle = (pLow + pHigh) / 2;
		// If pKey equals middle, return middle
		if (pKey == pList.get(middle))
		{
			// Found pKey. Return the index which is the value of middle.
			return middle;
		}
		// If pKey is less than middle, run the recursion method with middle as high
		// pKey is in the bottom half of the list. Move high down.
		// high = middle -1;
		else if (pKey < pList.get(middle))
		{
			return recursiveBinarySearch(pList, pKey, pLow, middle - 1);
		}
		else
		{
			// pKey is in the top half of the list. Move low up.
			// Run recursion with middle as low
			// low = middle + 1
			return recursiveBinarySearch(pList, pKey, middle + 1, pHigh);
		}
	}
	// Method to create and return an Integer ArrayList
	public static ArrayList<Integer> createArrayListInt()
	{
		ArrayList<Integer> arrayListInt = new ArrayList<>();
		arrayListInt.add(3);
		arrayListInt.add(7);
		arrayListInt.add(9);
		arrayListInt.add(11);
		arrayListInt.add(13);
		arrayListInt.add(17);
		arrayListInt.add(19);
		arrayListInt.add(23);
		arrayListInt.add(29);
		arrayListInt.add(31);
		arrayListInt.add(37);
		return arrayListInt;
	}
	// Method to print the array list
	public static void printArrayListInt(ArrayList<Integer> aList)
	{
		System.out.println("Integer ArrayList: \t" + aList);
	}
	// Method to get the key from the user
	public static int getKey()
	{
		System.out.print("Enter the key to find: \t");
		int aKey = in.nextInt();
		return aKey;
	}
	// Method to display the result of the RBS for the key
	public static void returnResult(int pResult, int key, ArrayList<Integer> list)
	{
		if (pResult == -1)
		{
			System.out.println("Key " + key + " not found (" + pResult + ")");
		}
		else
		{
			System.out.println("Key " + key + " found at index \t" + list.indexOf(key));
		}
	}
}
	
