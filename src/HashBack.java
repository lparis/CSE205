package hashishy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class HashBack extends JFrame implements ActionListener 
{
    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 200;
    
    public HashBack() 
    {
    	super("Hash Back");
    	setSize(FRAME_WIDTH, FRAME_HEIGHT);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	JLabel hashHeading = new JLabel("Enter some text, get Hash Back");
    	hashHeading.setFont(new Font("Arial", Font.BOLD, 12));
    	
    	JLabel stringPrompt = new JLabel("Enter some text:");
    	JTextArea stringField = new JTextArea();
//    	JTextPane stringField = new JTextPane();
//    	JTextField stringField = new JTextField(1000);
    	JButton hashButton = new JButton("-- Get Hash Back --");
    	
    	setLayout(new FlowLayout());
    	add(hashHeading);
    	add(stringPrompt);
    	add(stringField);
    	add(hashButton);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}
	
