package evolution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Scanner;

public class ReadFileAsMapAndSortByStream {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\anyFile.txt");
		Scanner scanner = new Scanner(file);// Scanner simplifies the read file process.
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		while (scanner.hasNextLine()) {
			String word = scanner.nextLine();
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);// Get the value, increase it by one, and put it back.
			} else {
				wordCount.put(word, 1);// Set count as one.
			}
		}
		List<Entry<String, Integer>> list = new LinkedList<>(wordCount.entrySet());// Turn the map into a list of entries.
		list = list.stream().sorted((x, y) -> y.getValue().compareTo(x.getValue())).collect(Collectors.toList());// Sort the list by stream.
		System.out.println(list);
		scanner.close();// Don't forget to close the scanner.
	}
}
