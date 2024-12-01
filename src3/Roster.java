// CLASS: 	Roster
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project3;

import java.util.ArrayList;

// The Roster class encapsulates an ArrayList<Student> 
// which stores the info for each student in gradebook
public class Roster 
{
	// Declare mStudentList as type Student
	private ArrayList<Student> mStudentList;
	
    // Default constructor
    public Roster()
    {
    	mStudentList = new ArrayList<Student>();
    	setStudentList(mStudentList);
    }

    // Method addStudent adds the student to the list
    public void addStudent(Student pStudent)
    {
    	mStudentList.add(pStudent);
    }

    // Method getStudent gets a student by calling searcher
    public Student getStudent(String pLastName)
    {
    	int index = Searcher.search(getStudentList(), pLastName);
    	if(index == -1)
    	{
    		return null;
    	}
    	else 
    	{
    		return mStudentList.get(index);
    	}
    }
    
    // Accessor method for mStudentList
    public ArrayList<Student> getStudentList() 
    {
        return mStudentList;
    }
    
    // Mutator method for mStudentList
    public void setStudentList(ArrayList<Student> pStudentList) 
    {
        mStudentList = pStudentList;
    }
    
    // Method sortRoster()
    public void sortRoster()
    {
    	Sorter.sort(mStudentList);
    }

    @Override
    public String toString() 
    {
        String result = "";
        for (Student student : getStudentList()) 
        {
            result += student + "\n";
        }
        return result;
    }
}
