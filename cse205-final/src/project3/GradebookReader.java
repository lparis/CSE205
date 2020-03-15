// CLASS: GradebookReader
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * GradebookReader() reads the gradebook info from the file whose name is passed to the ctor.
 * Once the input file has been read, it will return a Roster object containing the list of
 * Students in the course.
 */
public class GradebookReader  
{
    private Scanner mIn;

    public GradebookReader(String pFname) throws FileNotFoundException 
    {
        mIn = new Scanner(new File(pFname));
    }
    
    // Method readExam reads the exam scores for a Student.
    private void readExam(Student pStudent) 
    {
        for (int i = 0; i < Main.getNumExams(); ++i) 
        {
            pStudent.addExam(mIn.nextInt());
        }
    }

    // Method readGradebook() is called to read the gradebook information. 
    // It calls readRoster() to read the student records and then sorts the roster by last name.
    public Roster readGradebook() 
    {
        Roster roster = readRoster();
        roster.sortRoster();
        return roster;
    }

    /// Method readHomework() reads the homework scores for a Student.
    private void readHomework(Student pStudent) 
    {
        for (int i = 0; i < Main.getNumHomeworks(); ++i) 
        {
            pStudent.addHomework(mIn.nextInt());
        }
    }

    // Method readRoster() reads the student information for each student in the input file, 
    // adding each student to the roster.
    // @return the roster of students that was read from the input file.
    private Roster readRoster() 
    {
        Roster roster = new Roster();
        while (mIn.hasNext()) 
        {
            String lastName = mIn.next();
            String firstName = mIn.next();
            Student student = new Student(firstName, lastName);
            readExam(student);
            readHomework(student);
            roster.addStudent(student);
        }
        return roster;
    }
}