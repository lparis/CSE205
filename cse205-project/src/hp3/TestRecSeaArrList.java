package hp3;

import java.util.ArrayList;

public class TestRecSeaArrList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Arizona");
		list.add("California");
		list.add("Hawaii");
		list.add("Idaho");
		list.add("Texas");
		
		H03_41 searchArrayList = new H03_41();
		System.out.println(searchArrayList.recLinearSearch(list, "California", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "Texas", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "Idaho", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "Hawaii", 0, list.size()-1));
		System.out.println(searchArrayList.recLinearSearch(list, "Arizona", 0, list.size()-1));
	}
}
