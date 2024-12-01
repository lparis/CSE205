// CLASS: 	H01_32
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu



import java.util.ArrayList;

public class H01_32 {
	
	public H01_32()
	{
		
	}
	
	public ArrayList<Integer> arrayListInit()
	{
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 5; i++)
		{
			list.add(i);
		}
		
		for (int j = 4; j >= 0; j--)
		{
			list.add(j);
		}
				
//		for (int i = 1; i < 10; ++i)
//		{
//			list.set(i, list.get(i) + list.get(i-1)); 
//		}
		
		return list;
	}
}