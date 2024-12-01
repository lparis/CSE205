// CLASS: 	Sorter
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package proj3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sorter 
{
	// Method sort()
    public static ArrayList<Student> sort(ArrayList<Student> mStudentList) 
    {
    	Collections.sort(mStudentList, new Comparator<Student>() 
    	{
    		@Override
    		public int compare(Student o1, Student o2) 
    		{
    			return o1.getLastName().compareTo(o2.getLastName());
    		}
    	});
     return mStudentList;
     }
}