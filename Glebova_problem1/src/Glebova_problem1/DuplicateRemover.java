package Glebova_problem1;

import java.io.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class DuplicateRemover 
{
	Set<String> uniqueWords = new HashSet<>();
	
	public void remove(String dataFile)
	{
		try {
			Scanner input = new Scanner(new File(dataFile));
			
			while (input.hasNext()) //checks if there are more words in the file
			{
				String next = input.next();
				uniqueWords.add(next); //adds to the set
			}
			
			input.close();
			
		} 
		catch (Exception e) 
		{
			System.out.println("An exception occured!");
		}
	}
	
	public void write(String outputFile) 
	{
		File outFile = new File(outputFile);
		
		try {
			if(!outFile.createNewFile())
			{
				//overwrite the existing file
				PrintStream outFilePrint = new PrintStream(outputFile);
				outFilePrint.println(uniqueWords);
				
				outFilePrint.close();
			}
			else
			{
				//create new file
				PrintStream outFilePrint = new PrintStream(outputFile);
				outFilePrint.println(uniqueWords);
				
				outFilePrint.close();
			}
		} 
		catch (Exception e) 
		{
			System.out.println("An exception occured!");
		} 
		
	}
}
