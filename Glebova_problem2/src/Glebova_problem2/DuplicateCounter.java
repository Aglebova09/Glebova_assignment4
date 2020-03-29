package Glebova_problem2;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter 
{
	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	
	public void count(String dataFile)
	{
		Scanner input;
		
		try {
			input = new Scanner(new File(dataFile));

			while (input.hasNext())
			{
				String next = input.next().toLowerCase();
				
				if(wordCounter.containsKey(next)) //checks if the map already has the word if not creates one
				{
					wordCounter.put(next, wordCounter.get(next)+1);
				}
				else
				{
					wordCounter.put(next, 1);
				}
			}

			input.close();

		} 
		catch (Exception e) 
		{
			System.out.println("An exception has occured!");
		}
	}
	
	public void write(String outputFile)
	{
		File outFile = new File(outputFile);
		
		try {
			if(!outFile.createNewFile()) //checks if the file exists
			{
				//overwrite the existing file
				PrintStream outFilePrint = new PrintStream(outputFile);
				outFilePrint.println(wordCounter);
				
				outFilePrint.close();
			}
			else
			{
				//create new file
				PrintStream outFilePrint = new PrintStream(outputFile);
				outFilePrint.println(wordCounter);
				
				outFilePrint.close();
			}
		} 
		catch (Exception e) 
		{
			System.out.println("An exception occured!");
		} 
	}
}
