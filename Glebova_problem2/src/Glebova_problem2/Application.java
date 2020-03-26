package Glebova_problem2;

public class Application {

	public static void main(String[] args) 
	{
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		String dataFile = "./problem2.txt";
		String uniqueWordCounts = "./unique_word_counts.txt";
		
		duplicateCounter.count(dataFile);
		duplicateCounter.write(uniqueWordCounts);
	}

}
