// CLASS: 	H01_43.java
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class H01_43 
{
	
	public static void main(String[] args) throws FileNotFoundException {

		// Prompt for input file name
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		
		// Create File object and open file
		File inputFile = new File(inputFileName + ".java");
		Scanner in = new Scanner(inputFile);
     
		// Create output file
		String outputFileName = inputFileName + ".txt";
		PrintWriter out = new PrintWriter(outputFileName);
		int lineNumber = 001;
		
		// Read each line from the file
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			// Format the output
            out.printf("[" + "%03d" + "]", lineNumber);
            out.println(" " + line);
			lineNumber++;
		}
		
		in.close();
		out.close();
	}
}
		
		