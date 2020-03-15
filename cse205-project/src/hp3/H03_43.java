package hp3;

import java.util.ArrayList;
import java.util.Arrays;

public class H03_43 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600));
		int index = recursiveBinarySearch(list, 150, 0, list.size()-1);

		if(index==-1)
		{
			System.out.println("Element not found");
		}

		else
		{
			System.out.println("Element found at index "+index);
		}
	}

	public static int recursiveBinarySearch(ArrayList<Integer> arr, int x, int l, int r) 
	{

		if (r >= l) 
		{
			int mid = l + (r - l) / 2;
			if (arr.get(mid) == x)
				return mid;

			if (arr.get(mid) > x)
				return recursiveBinarySearch(arr, x, l, mid - 1);

			return recursiveBinarySearch(arr, x, mid + 1, r);
		}
		return -1;
	}
}
