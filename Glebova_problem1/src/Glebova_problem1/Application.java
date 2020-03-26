package Glebova_problem1;

public class Application 
{

	public static void main(String[] args) 
	{
		String dataFile = "./problem1.txt";
		String uniqueWords = "./unique_words.txt";
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		//call remove with dataFile
		duplicateRemover.remove(dataFile);
		
		duplicateRemover.write(uniqueWords);
	}

}
