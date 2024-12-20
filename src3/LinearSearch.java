// lparis
// Class that demonstrates a Linear Search

package module4;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list = createArrayListInt();
		System.out.println("-- Linear Search --");
		printArrayListInt(list);
		int key = getKey();
		int result = linearSearch(list, key);
		returnResult(result, key, list);
		in.close();
	}
	public static int linearSearch(ArrayList<Integer> pList, int pKey)
	{
		for (int i = 0; i < pList.size(); ++i)
		{
			if (pList.get(i) == pKey)
			{
				return i;
			}
		}
		return -1;
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
	
