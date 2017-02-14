package evolution;

import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctElementInArray {
	public static void main(String[] args) {
		int[] a = {3, 4, 5, 8, 1, 4, 5, 4};
		Set<Integer> set = new LinkedHashSet<>();// The LinkedHashSet keeps the original order.
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}
}
