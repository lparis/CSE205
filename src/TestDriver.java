

import java.util.ArrayList;
import java.util.Arrays;

public class TestDriver {

	public static void main(String[] args) {
		
//		// Tester for H01_31 ArrayList		
//		H01_31 alist = new H01_31();
//		System.out.print(alist.arrayListInit());
		
//		// Tester for H01_32 ArrayList		
//		H01_32 blist = new H01_32();
//		System.out.print(blist.arrayListInit());

//		// Tester for H01_33 ArrayList		
//		H01_33 clist = new H01_33();
//		System.out.print(clist.arrayListInit());
		
//		// Tester for H01_34 ArrayList		
//		H01_34 dlist = new H01_34();
//		ArrayList<Integer> myList = new ArrayList<>();
//		for (int i = 0; i < 100; i++)
//		{
//			myList.add(i);
//		}		
//		System.out.println(dlist.arrayListCreate(myList));
		
//		// Tester for H01_35 ArrayList		
//		H01_35 plist = new H01_35();
//		//plist.arrayListCreate(4, 10);
//		System.out.println(plist.arrayListCreate(4, 1000));
		
//		// Tester for H01_36 ArrayList		
//		H01_36 nameList = new H01_36();
//		ArrayList<String> names = new ArrayList<>();
//		names.add("Amber");
//		names.add("Beauregard");
//		names.add("Curtis");
//		names.add("David");
//		names.add("Elron");
//		
//		nameList.insertName(names, "Dupree");
//		
//		for (int i = 0; i < names.size(); i++)
//		{
//			String name = names.get(i);
//			System.out.println("[" + i + "]" + name);
//		}
//	}
		
		// Tester for H01_37 ArrayList
		H01_37 list = new H01_37();
		ArrayList aList = new ArrayList(Arrays.asList(10,20,30,10));
		list.arrayListRemove(aList, 10);
	}
}
