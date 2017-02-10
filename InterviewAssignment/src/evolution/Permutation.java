package evolution;

import java.util.Set;
import java.util.TreeSet;

public class Permutation {
	public static void permutation(int i, int m, int n, int[] permutation, Set<Integer> set) {
		if (permutation == null) {
			permutation = new int[m];
		}
		if (i < m) {
			for (int j = 0; j < n; j++) {
				if (!set.contains(j)) {
					permutation[i] = j;
					set.add(j);
					permutation(i + 1, m, n, permutation, set);
					set.remove(j);
				}
			}
		} else {
			for (int j = 0; j < m; j++) {
				System.out.print(permutation[j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		permutation(0, 2, 7, null, new TreeSet<Integer>());
	}
}
