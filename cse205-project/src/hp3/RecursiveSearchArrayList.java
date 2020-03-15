package hp3;

import java.util.ArrayList;

public class RecursiveSearchArrayList 
{
	int recLinearSearch(ArrayList pList, String pKey, int pBeginIdx, int pEndIdx)
	{
		if(pBeginIdx > pEndIdx)
		{
			return -1;
		}
		else if(pList.get(pBeginIdx).equals(pKey))
		{
			return pBeginIdx;
		}
		else
		{
			return recLinearSearch(pList, pKey, pBeginIdx+1, pEndIdx);
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you");
		
		RecursiveSearchArrayList searchArrayList = new RecursiveSearchArrayList();
		System.out.println(searchArrayList.recLinearSearch(list, "how", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "are", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "you", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "blah", 0, list.size()-1));
	}
}