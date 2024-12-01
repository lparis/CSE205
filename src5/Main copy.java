//*********************************************** 
// CLASS: Main (Main.java)
// DESCRIPTION
// This program reads the integers in a file, performs
// some runs on the numbers, and writes the results to
// an output file.
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2020
// Project Number: project-number
//
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu
// ************************************************


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	// For my testing purposes
	String inputFilePath = "/Users/lparis/Documents/workspace/eclipse/CSE205/cse205-project/src/";
	static String inputFileName = "p01-in.txt";
	String outputFilePath = "/Users/lparis/Documents/workspace/eclipse/CSE205/cse205-project/src/";
	static String outputFileName = "p01-runs.txt";

	// Method main() that throws FileNotFoundException 
    public static void main(String[] args) throws FileNotFoundException 
    {
    	// Instantiate new Main() object named mainObject
        Main mainObject = new Main();
        // Call the run() method of mainObject
        mainObject.run();
    }

    // Method run() with FNF exception
    private void run() throws FileNotFoundException 
    {
        final String RUNSUP = "RunsUp";
        final String RUNSDOWN = "RunsDown";

        ArrayList<Integer> list = inFileToList(inputFilePath + inputFileName);
        
        // ArrayList for runs up
        ArrayList<Integer> listRunsUpCount = new ArrayList<>();
        // ArrayList for runs down
        ArrayList<Integer> listRunsDownCount = new ArrayList<>();
        // ArrayList for merged runs list
        ArrayList<Integer> listRunsCount = new ArrayList<>();

        listRunsUpCount = findRuns(list, RUNSUP);
        listRunsDownCount = findRuns(list, RUNSDOWN);
        listRunsCount = merge(listRunsUpCount, listRunsDownCount);
        output(outputFilePath + outputFileName, listRunsCount);
    }

    // Method arrayListCreate() creates and returns an ArrayList object named list.
    public static ArrayList<Integer> arrayListCreate(int pSize, int pInitValue) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < pSize; i++) 
        {
            list.add(pInitValue);
        }
        return list;
    }
    
    public static ArrayList<Integer> inFileToList(String fileToParse) throws FileNotFoundException 
    {
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
    	try
    	{
            File fileInput = new File(fileToParse);
            Scanner scan = new Scanner(fileInput);
            while (scan.hasNextInt()) {
                listOfIntegers.add(scan.nextInt());
            }
            scan.close();
    	} catch (FileNotFoundException pExcept) 
    	{
    		System.out.println("Error: \t\tFile Not Found");
    		System.out.println("Message: \tOops, could not open " + inputFileName + " for reading. The program is ending.");
    		System.exit(-100);
    	}
        return listOfIntegers;
    }    
    
    // The method findRuns() counts the runs up and down.
    public static ArrayList<Integer> findRuns(ArrayList<Integer> pList, String pDir) 
    {
        ArrayList<Integer> listRunsCount = arrayListCreate(pList.size(), 0);
        int numIndexK;
        int i = 0;
        int k = 0;
        while (i < pList.size() - 1) {
            if (pDir.equals("RunsUp") && pList.get(i) <= pList.get(i + 1)) 
            {
                k++;
            } else if (pDir.equals("RunsDown") && pList.get(i) >= pList.get(i + 1)) 
            {
                k++;
            } else 
            {
                if (k != 0) 
                {
                    numIndexK = listRunsCount.get(k);
                    listRunsCount.set(k, numIndexK + 1);
                    k = 0;
                }
            }
            i++;
        }
        if (k != 0) {
            numIndexK = listRunsCount.get(k);
            listRunsCount.set(k, numIndexK + 1);
            k = 0;
        }
        return listRunsCount;
    }

    // Method merge() merges the arrays from the runs up and down.
    public static ArrayList<Integer> merge(ArrayList<Integer> pListRunsUpCount, ArrayList<Integer> pListRunsDnCount) 
    {
        ArrayList<Integer> upDownMerge = arrayListCreate(pListRunsUpCount.size(), 0);
        for (int i = 0; i < pListRunsUpCount.size() - 1; i++) {
            int sum = pListRunsUpCount.get(i) + pListRunsDnCount.get(i);
            upDownMerge.set(i, sum);
        }
        return upDownMerge;
    }

    // Method output() creates an output file with the runs data.
    public static void output(String pFileName, ArrayList<Integer> pListRuns) 
    {

        try {

            File outputFile = new File(pFileName);
            PrintWriter output = new PrintWriter(outputFile);
            int sumPListRuns = 0;
            for (int i = 0; i < pListRuns.size(); i++) 
            {
                sumPListRuns += pListRuns.get(i);
            }
            output.println("runs_total, " + sumPListRuns + "\n");
            for (int k = 1; k < pListRuns.size(); k++) 
            {
                output.println("runs_" + k + ", " + pListRuns.get(k));
            }
            output.close();
            
        } catch (FileNotFoundException s) 
        {
    		System.out.println("Error: \t\tFile Not Found");
    		System.out.println("Message: \tOops, could not open " + outputFileName + " for writing. The program is ending.");
    		System.exit(-100);
        }

    }
}