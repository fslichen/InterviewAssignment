package evolution;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInArray {
	public static Set<Integer> toSet(int[] a) {
		Set<Integer> setA = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			setA.add(a[i]);
		}
		return setA;
	}
	
	public static Set<Integer> join(int[] a, int[] b) {
		Set<Integer> setA = toSet(a);
		Set<Integer> setB = toSet(b);
		Set<Integer> setC = new HashSet<>();
		setA.forEach(x -> {
			if (setB.contains(x)) {// Hash search is efficient.
				setC.add(x);
			}
		});
		return setC;
	}
	
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 0, 5};
		int[] b = {4, 3, 2, 1, 0};
		System.out.println(join(a, b));
	}
}
