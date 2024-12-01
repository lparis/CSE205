// CLASS: Student
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project3;

import java.util.ArrayList;
import java.lang.Comparable;

// The Student class stores the gradebook information for one Student.

public class Student implements Comparable<Student> 
{
	// mCurrStudent is a reference to the Student object which is currently displayed in the View. 
    private Student mCurrStudent;

    // mExamList is an ArrayList of Integers storing the student's exam scores.
    private ArrayList<Integer> mExamList;
    
    // The student's first name.
    private String pFirstName;

    // mHomework List is an ArrayList of Integers storing the student's homework scores.
    private ArrayList<Integer> mHomeworkList;

    // The student's last name.
    private String pLastName;

    // Method Student(pFirstName : String, pLastName : String)
    public Student(String pFirstName, String pLastName)
    {

        this.pFirstName =pFirstName;
        this.pLastName = pLastName;
        this.mExamList = new ArrayList<Integer>();
        this.mHomeworkList = new ArrayList<Integer>();
    }

    // Method addExam()
    public void addExam(int pScore)
    {
        this.getExamList().add(pScore);
    }

    // Method addHomework() adds a homework score pScore to the homework list
    public void addHomework(int pScore)
    {
        this.getHomeworkList().add(pScore);
    }

    // Method compareTo() compares the last name of 'this' Student to the last name of pStudent to
    // determine if the last name of 'this' Student is <, =, or > the last name of pStudent.
    // It is called during the quick sort routine in Sorter.partition().
    public int compareTo(Student pStudent) 
    {
        return this.pLastName.compareTo(pStudent.getLastName());
    }
    
    // Accessor method for mCurrStudent.
//    public static Student getCurrStudent() 
//    {
//        return mCurrStudent;
//    }

    // Method getExam() is an accessor method to retrieve an exam score from the list of exams.
    public int getExam(int pNum) 
    {
        return getExamList().get(pNum);
    }

    // Method getExamList() is an accessor method for mExamList.
    ArrayList<Integer> getExamList() {
        return mExamList;
    }

    // Method getFirstName() is an accessor method for mFirstName.
    public String getFirstName() 
    {
        //return mFirstName;
    	return this.pFirstName;
    }

   // Method getFullName() is an accessor method that returns 
   // the student's full name in the format: "lastname, firstname".
   public String getFullName()
   {
	   return this.pFirstName + ", " + this.pLastName;
   }
    
    // Method getHomework() is an ccessor method to retrieve a homework score from the list of homeworks.
    public int getHomework(int pNum) 
    {
        return getHomeworkList().get(pNum);
    }

    // Method getHomeworkList() is an accessor method for mHomeworkList
    ArrayList<Integer> getHomeworkList() 
    {
        return mHomeworkList;
    }

    // Method getLastname() is an accessor method for mLastName.
    public String getLastName() 
    {
        return this.pLastName;
    }

    /**
     * Mutator method for mCurrStudent.
     */ 
    public static void setCurrStudent(Student pCurrStudent) {
        // mCurrStudent = pCurrStudent;
    }

    // Method setExam() is a mutator method to store an exam score into the list of exam scores.
    public void setExam(int pNum, int pScore) 
    {
        getExamList().set(pNum, pScore);
    }

    // Method setFirstName() is a mutator method for mFirstName.
    public void setFirstName(String pFirstName) 
    {
        // mFirstName = pFirstName;
        this.pFirstName = pFirstName;
    }

    // Method setHomework() is a mutator method to store a homework score into the list of homework scores.
    public void setHomework(int pNum, int pScore) 
    {
        getHomeworkList().set(pNum, pScore);
    }

    // Method setLastname() is a mutator method for mLastName.
    public void setLastName(String pLastName) 
    {
        // mLastName = pLastName;
    	this.pLastName = pLastName;
    }

    // Methed toString() returns a String representation of this Student. 
	// lastname firstname exam1 exam2 exam2 hw1 hw2 hw3 hw4 hw5
    @Override
    public String toString() 
    {
        String result = getLastName() + " " + getFirstName() + " ";
        for (Integer exam : getExamList()) 
        {
            result += exam + " ";
        }
        for (Integer hw : getHomeworkList()) 
        {
            result += hw + " ";
        }
        return result.trim();
    }

	public Student getmCurrStudent() {
		return mCurrStudent;
	}

	public void setmCurrStudent(Student mCurrStudent) {
		this.mCurrStudent = mCurrStudent;
	}
}
