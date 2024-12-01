// CLASS: View
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// The View class implements the user interface. 
// It is a subclass of JFrame and implements the ActionListener
// interface so that we can respond to user-initiated GUI events.

public class View extends JFrame implements ActionListener 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// The width of the View frame.
	public static final int FRAME_WIDTH = 500;
	// The height of the View frame.
	public static final int FRAME_HEIGHT = 250;

	// Instance variables for the buttons and text fields.
	private JButton mClearButton, mExitButton, mSaveButton, mSearchButton;
	private JTextField[] mExamText, mHomeworkText;
	private JTextField mSearchText;
	private Main mMain;
	private Student mStudent;
    
    // The View() constructor creates the GUI interface and makes the frame visible at the end.
    public View(Main pMain) 
    {
        // Save a reference to the Main object pMain in mMain.
        setMain(pMain);
        // Create a JPanel named panelSearch which uses the FlowLayout.
        JPanel panelSearch = new JPanel(new FlowLayout());
        // Add a JLabel "Student Name: " to panelSearch
        panelSearch.add(new JLabel("Student Name: "));
        // Create mSearchText and make the field 25 cols wide        
        mSearchText = new JTextField(25);
        // Add mSearchText to the panel
        panelSearch.add(mSearchText);
        // Create mSearchButton
        mSearchButton = new JButton("Search");
        // Make this View the action listener for the button
        mSearchButton.addActionListener(this);
        // Add the button to the panel
        panelSearch.add(mSearchButton);
        
        // Create a JPanel named panelHomework which uses the FlowLayout
        JPanel panelHomework = new JPanel(new FlowLayout());
        // Add a JLabel "Homework: " to the panel
        panelHomework.add(new JLabel("Homework: "));
        // Create mHomeworkText which is an array of JTextFields, one for each homework assignment
        mHomeworkText = new JTextField[Main.NUM_HOMEWORKS];
        // Iterate using a for loop
        for (int i = 0; i < Main.NUM_HOMEWORKS; i++) 
        {
        	// Create a textfield mHomeworkText[i] displaying 5 cols
            mHomeworkText[i] = new JTextField(5);
            // Add mHomeworkText[i] to the panel
            panelHomework.add(mHomeworkText[i]);
        }
        
        // Create the exam panel which contains the "Exam: " label and the two exam text fields.
        JPanel panelExam = new JPanel(new FlowLayout());
        panelExam.add(new JLabel("Exam: "));
        mExamText = new JTextField[2];
        //Iterate using a for loop
        for (int j = 0; j < 2; j++) 
        {
            mExamText[j] = new JTextField(5);
            panelExam.add(mExamText[j]);
        }
        
        // Create a JPanel named panelButtons using FlowLayout
        JPanel panelButtons = new JPanel(new FlowLayout());
        // Create the Clear button mClearButton labeled "Clear"
        mClearButton = new JButton("Clear");
        // Make this View the action listener for mClearButton
        mClearButton.addActionListener(this);
        // Add the  Clear button to the panel
        panelButtons.add(mClearButton);
        // Repeat for the Save button
        mSaveButton = new JButton("Save");
        mSaveButton.addActionListener(this);
        panelButtons.add(mSaveButton);
        // Repeat for the Exit button
        mExitButton = new JButton("Exit");
        mExitButton.addActionListener(this);
        panelButtons.add(mExitButton);

        // Create a JPanel named panelMain using a vertical BoxLayout
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        // Add panelSearch to panelMain.
        panelMain.add(panelSearch);
        // Add panelHomework to panelMain
        panelMain.add(panelSearch);
        // Add panelExam to panelMain
        panelMain.add(panelExam);
        // Add panelButtons to panelMain
        panelMain.add(panelButtons);
                
        // Set the title of the View to whatever you want by calling setTitle()
        setTitle("Gradebook.com");
        // Set the size of the View to FRAME_WIDTH x FRAME_HEIGHT
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        // Make the View non-resizable
        setResizable(false);
        // Set the default close operation to JFrame.DO_NOTHING_ON_CLOSE.
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // Add panelMain to the View.
        add(panelMain);
        // Display the View by calling setVisible().
        setVisible(true);
        // If Mac, call the pack() method
        pack();
    }

    // Method actionPerformed() is called when one of the JButtons is clicked. 
    // Use @Override annotation to prevent accidental overloading because we are
    @Override
    public void actionPerformed(ActionEvent epEvent) 
    {
        if (epEvent.getActionCommand().equalsIgnoreCase("Exit")) 
        {
            Main.exit();
        } 
        else if (epEvent.getActionCommand().equalsIgnoreCase("Search"))
        {
            mStudent = Main.search(mSearchText.getText());

            if (mStudent == null) 
            {
                for (int i = 0; i < mHomeworkText.length; i++) 
                {
                    mHomeworkText[i].setText("");
                }
                int i = 0;
                while(i < mExamText.length)
                {
                   mExamText[i].setText("");
                   i++;
                }
                JOptionPane.showMessageDialog(this, "No Record found", "Search Result", JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {
                ArrayList<Integer> homeWorkList = mStudent.getHomeworkList();
                if (homeWorkList != null && homeWorkList.size() == 4) 
                {
                    for (int i = 0; i < homeWorkList.size(); i++) 
                    {
                        mHomeworkText[i].setText(String.valueOf(homeWorkList.get(i)));
                    }
                }

                ArrayList<Integer> examList = mStudent.getExamList();

                if (examList != null && examList.size() == 2) 
                {
                    for (int i = 0; i < examList.size(); i++) 
                    {
                        mExamText[i].setText(String.valueOf(examList.get(i)));
                    }
                }
            }

        } else if (epEvent.getActionCommand().equalsIgnoreCase("Save")) 
        {
        	if (mStudent == null) 
        	{
                JOptionPane.showMessageDialog(this, "No Record to save", "Save Result", JOptionPane.WARNING_MESSAGE);
            } else 
            {
                for (int k = 0; k < mHomeworkText.length; k++) 
                {
                	if (mHomeworkText[k].getText() != null) 
                	{
                        mStudent.getHomeworkList().set(k, Integer.parseInt(mHomeworkText[k].getText()));
                    }
                }

                for (int j = 0; j < mExamText.length; j++) 
                {
                	if (mExamText[j].getText() != null) 
                	{
                        mStudent.getExamList().set(j, Integer.parseInt(mExamText[j].getText()));
                    }
                }

                JOptionPane.showMessageDialog(this, "Record saved successfully", "Save Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } 
        else if (epEvent.getActionCommand().equalsIgnoreCase("Clear")) 
        {
            mSearchText.setText("");
            for (int k = 0; k < mHomeworkText.length; k++) 
            {
                mHomeworkText[k].setText("");
            }

            int i =0;
            while(i < mExamText.length)
            {
                mExamText[i].setText("");
                i++;
            }
        }
    }

    // Method clear() is called when the Clear button is clicked. 
    // Clears all of the text fields by setting the contents of each to the empty string.
    public void clear()
    {
    	// Set the mStudentName text field to ""
    	mSearchText.setText("");
    	// Clear the numbers in the homework and exam fields by calling clearNumbers()
    	clearNumbers();
    	// Set the current Student object in the Student class to null        
    	mStudent = null;
    }
    
    // Clear numbers
    public void clearNumbers()
    {
    	for (int i = 0; i < Main.NUM_HOMEWORKS; ++i)
        {
            mHomeworkText[i].setText("");
        }
        for (int j = 0; j < Main.NUM_EXAMS; ++j)
        {
            mExamText[j].setText("");
        }
    }
    
    // Method displayStudent() displays the homework and exam scores for a student in the mHomeworkText and mExamText text fields.
    // @param pStudent is the Student who's scores we are going to use to populate the text fields.
    public void displayStudent(Student pStudent)
    {
    	for (int i = 0; i <= Main.getNumHomeworks() - 1; ++i)
    	{
    		Integer hw = pStudent.getHomework(i);
    		String hwstr = hw.toString();
    		mHomeworkText[i].setText(hwstr);
    	}
    }

    // Accessor method for mMain.
    @SuppressWarnings("unused")
	private Main getMain() 
    {
        return mMain;
    }    

    // Method messageBox() displays a message box containing some text. 
    public void messageBox(String pMessage) 
    {
        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
    }

    // Method saveStudent() retrieves the homework and exam scores for pStudent from the text fields and writes the
    // results to the Student record in the Roster.
    public void savesStudent(Student pStudent)
    {
    	for (int i = 0; i <= Main.getNumHomeworks() -1; ++i)
    	{
    		String hwstr = mHomeworkText[i].getText();
    		Integer hw = Integer.parseInt(hwstr);
    		pStudent.setHomework(i, hw);
    	}
    	for (int j = 0; j <= Main.getNumExams() -1; ++j)
    	{
    		String examStr = mExamText[j].getText();
    		Integer examInt = Integer.parseInt(examStr);
    		pStudent.setExam(j, examInt);
    	}
    	
    	int studentIdx = Searcher.search(Main.getRoster().getStudentList(), pStudent.getLastName());
    	Main.getRoster().getStudentList().set(studentIdx, pStudent);
    }
    
    // Mutator method for mMain.
    private void setMain(Main pMain) 
    {
        mMain = pMain;
    }    
}
