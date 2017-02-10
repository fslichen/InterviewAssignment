package evolution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
	public static void reverseByStream(List<String> strings) {
		List<String> newStrings = new LinkedList<>();
		int length = strings.size();
		for (int i = 0; i < length; i++) {
			newStrings.add(strings.get(length - 1 - i));// It's length - 1.
		}
		System.out.println(newStrings);
	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a", "b", "c", "d", "f");
		reverseByStream(strings);
	}
}
