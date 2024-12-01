package lbparis_p02;

import java.util.ArrayList;

public class Sorter {

   private int SortingType;//Ascending 0 or Descending 1
  
   public void insertionSort(ArrayList<Student> Students,int sortType)
   {
       SortingType=sortType;
       int n = Students.size();
for (int i=1; i<n; ++i)
{
int j = i-1;
/* Move elements of arr[0..i-1], that are
greater than key, to one position ahead
of their current position */
Student firstObj=Students.get(j);
Student secondObj=Students.get(i);
if(sortType==0)//ascending
{   
   while (j>=0 && firstObj.compareTo(secondObj) > 0)
   {
       Students.set(j+1, firstObj);
       j = j-1;
   }
   Students.set(j+1, secondObj);
}
else
{
   while (j>=0 && firstObj.compareTo(secondObj) < 0)
   {
       Students.set(j+1, firstObj);
       j = j-1;
   }
   Students.set(j+1, secondObj);
}
}
   }
}

