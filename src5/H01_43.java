// CLASS: 	H01_43.java
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package lbparis_h01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class H01_43 
{
	
	public static void main(String[] args) throws FileNotFoundException {

		// Prompt user for input file name
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
     
		// Create output file
		String outputFileName = "HelloWorld.txt";
		//PrintWriter out = new PrintWriter(new File(outputFileName));
		PrintWriter out = new PrintWriter(outputFileName);
		int lineNumber = 001;
		
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			out.println("/ " + lineNumber + " */ " + line);
			lineNumber++;
		}
		
		in.close();
		out.close();
	}
}
		
		