// CLASS: 	GradebookWriter
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package proj3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GradebookWriter extends PrintWriter 
{
	private Roster pRoster;
	
	// Constructor method call the superclass
	public GradebookWriter(String pFname) throws FileNotFoundException  
	{
		// Opens the file for writing
		super(pFname);
	}

	// Writes the grade book info to the file.
	public void writeGradebook(Roster roster)
	{
		for(Student student : pRoster.getStudentList())
		{
			System.out.println(student);
			super.println(student.toString());
			super.flush();
		}
	}
}
