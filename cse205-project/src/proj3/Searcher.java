// CLASS: 	Searcher
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package proj3;

import java.util.ArrayList;

//Searcher class
public class Searcher 
{
     // Method search() to find the student by last name
     public static int search(ArrayList<Student> mStudentList, String pLastName) 
     {
          //Iterate the loop
          for (int i = 0; i < mStudentList.size(); i++) 
          {
              if (mStudentList.get(i).getLastName().equals(pLastName)) 
              {
                   return i;
              }
          }
          return -1;
     }
}

