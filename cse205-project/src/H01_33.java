// CLASS: 	H01_33
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu



import java.util.ArrayList;

public class H01_33 
{
	public H01_33()
	{
		
	}
	
	public ArrayList<Integer> arrayListInit()
	{
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++)
		{
			list.add(i);
		}
		
		for (int j = 0; j < 5; j++)
		{
			list.add(j - 4);
		}
		
		int sum = 0;		
		for (Integer element : list)
		{
			if (element < 0)
			{
				sum++;
			}
		}
		System.out.println(sum);
		
		return list;
	}
}