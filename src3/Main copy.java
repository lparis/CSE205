// CLASS: 	Main
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project3;

import java.io.FileNotFoundException;
import javax.swing.JFrame;

// The Main class containing the main() and run() methods.
public class Main 
{	
    // The number of exams given in the course.
	public static final int NUM_EXAMS = 2;
    // The number of homework assignments in the course.
	public static final int NUM_HOMEWORKS = 4;
    // Roster of students that is read from the DB file "gradebook.dat".
	private static Roster mRoster;
    // A reference to the View object.
	private static View mView;

    // Instantiate a Main object and then call run().
	public static void main(String[] pArgs) 
	{
		new Main().run();
	}
	
	// Method exit() exits the program when the exit button is clicked
	public static void exit() 
	{
		try 
		{
			GradebookWriter gradeBookWriter = new GradebookWriter("gradebook.dat");
			gradeBookWriter.writeGradebook(getRoster());
			System.exit(0);
			gradeBookWriter.close();
		} catch (FileNotFoundException pException) 
		{
			getView().messageBox("Could not open gradebook.dat for writing. Exiting without saving.");
			System.exit(-1);
		}
	}

    // Returns the number of exams in the class by returning the constant NUM_EXAMS.
    public static final int getNumExams() 
    {
        return NUM_EXAMS;
    }

    // Returns the number of homework assignments in the class by returning the constant NUM_HOMEWORKS.
    public static final int getNumHomeworks() 
    {
        return NUM_HOMEWORKS;
    }
    
    // Accessor method for mRoster.
    public static Roster getRoster() 
    {
        return mRoster;
    }
    
    // Mutator method for mRoster.
    private void setRoster(Roster pRoster) 
    {
        mRoster = pRoster;
    }

    // Accessor method for mView.
    public static View getView() 
    {
        return mView;
    }
    
    // Mutator method for mView.
    private void setView(View pView) 
    {
        mView = pView;
    }


    // Method run() is the main routine and is called from main().
    private void run() 
    {
    	JFrame.setDefaultLookAndFeelDecorated(false);
        setView(new View(this));
        try 
        {
            GradebookReader pGradeBook = new GradebookReader("gradebook.dat");
            setRoster(pGradeBook.readGradebook());
            mRoster = getRoster();
        } 
        catch (FileNotFoundException pException) 
        {
            getView().messageBox("GradebookReader: Could not open gradebook.dat for reading. Exiting.");
            System.exit(-1);
        }
    }

    // Method search() is called when the Search button is clicked in the View. 
    // The input parameter is the last name of the Student to search the roster for. 
    public static Student search(String pLastName)
    {
    	return getRoster().getStudent(pLastName);
    }
}
