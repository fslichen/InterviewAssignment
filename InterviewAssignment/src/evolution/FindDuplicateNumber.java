package evolution;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateNumber {
	public static void find(List<Integer> numbers) {
		Set<Number> set = new TreeSet<>();
		for (Integer number : numbers) {
			if (set.contains(number)) {
				System.out.println("The number " + number + " is duplicate.");
			} else {
				set.add(number);
			}
		}
	}
	
	public static void main(String[] args) {
		find(Arrays.asList(1, 3, 5, 5, 7, 8, 8, 9, 10));
	}
}
