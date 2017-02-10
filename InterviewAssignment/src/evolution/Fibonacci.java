package evolution;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(1);
		for (int i = 2; i < 100; i++) {
			numbers.add(numbers.get(i - 1) + numbers.get(i - 2));
		}
		System.out.println(numbers);
	}
}
