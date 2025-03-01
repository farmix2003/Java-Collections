import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class WordCounter{
	
	Map<String, Integer> counterMap;
	
	public WordCounter() {
		counterMap = new HashMap<>();
	}
	
	
	public void countWords(String filename) {
		try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String lineString;
			while((lineString = reader.readLine()) != null) {
				String[] words = lineString.toLowerCase().replaceAll("[^a-zA-A]", "").split("\\s+");
				for(String word: words) {
					counterMap.put(word, counterMap.getOrDefault(word, 0)+1);
				}
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error while uploading file"+e);
		}
	}
	
	
	public void displayWordFrequencies() {
		System.out.println("Word Freduencies:");
		for(Map.Entry<String, Integer>entry : counterMap.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
	
	public void displayMostAndLeastFrequent() {
		String mostFrequent = null, leastFrequent = null;
		int maxCount = 0, minCount = Integer.MAX_VALUE;
		
		for(Map.Entry<String, Integer> entry : counterMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostFrequent = entry.getKey();
			}
			if (entry.getValue() < minCount) {
				minCount = entry.getValue();
				leastFrequent = entry.getKey();
			}
			System.out.println("Most Frequent Word: " + mostFrequent + " (" + maxCount + " times)");
			System.out.println("Least Frequent Word: " + leastFrequent + " (" + minCount + " times)");
		}
		

		
	}
	
}



public class HashMapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
