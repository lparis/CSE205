package lbparis_p02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main 
{
	public static ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static void main(String[] args) throws IOException 
	{
		String inputFile = "/Users/lparis/downloads/cse205-p02/test/input/p02-students.txt";
		String outputFile = "/Users/lparis/downloads/cse205-p02/test/output/p02-tuition2.txt";

		readFile(inputFile);
		writeFile(outputFile);
	}
	
	// readFile() method
	public static void readFile(String filename) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String str;
		
		while ((str = in.readLine()) != null) 
		{
			String []words=str.split(" ");
			
			// Parse the On Campus Student
			if(words[0].toLowerCase().equalsIgnoreCase("c"))
			{
				OnCampusStudent objOnCampus=new OnCampusStudent(words[1],words[3],words[2]);
				if(words[4].equalsIgnoreCase("R"))
					objOnCampus.setResidency(1);
				else
			        objOnCampus.setResidency(2);
			        objOnCampus.setFirstname(words[3]);
			        objOnCampus.setLastname(words[2]);
			        objOnCampus.setProgramFee(Double.parseDouble(words[5]));
			        objOnCampus.setCredits(Integer.parseInt(words[6]));
			        objOnCampus.calcTuition();
			        studentList.add(objOnCampus);
			}
	    
			// Parse the Online Student
			if(words[0].equalsIgnoreCase("o"))
			{
				OnlineStudent objOnline=new OnlineStudent(words[1],words[3],words[2]);
				if(words[4].equalsIgnoreCase("T"))
					objOnline.setTechFee(true);
				else
					objOnline.setTechFee(false);
					objOnline.setFirstname(words[3]);
					objOnline.setLastname(words[2]);
					objOnline.setCredits(Integer.parseInt(words[5]));
					objOnline.calcTuition();
					studentList.add(objOnline);
			}
		}
		in.close();
	}

	// writeFile() method
	public static void writeFile(String filename) throws IOException
	{
		try
		{
    	   File fout = new File(filename);
    	   FileOutputStream fos = new FileOutputStream(fout);
     
    	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
    	   
    	   for(int i=0;i<studentList.size();i++)
    	   {
    		   bw.write(studentList.get(i).getId()+" ");
    		   bw.write(studentList.get(i).getLastname()+" ");
    		   bw.write(studentList.get(i).getFirstname()+" ");
    		   bw.write(Double.toString(studentList.get(i).getTution()));
    		   bw.newLine();
    	   }
    	   bw.close();
       }
       catch(FileNotFoundException ex)
       {
           System.out.println(" Sorry could not open file for writing");
       }
   }

}

