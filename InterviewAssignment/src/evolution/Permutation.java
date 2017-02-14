package evolution;

import java.util.Set;
import java.util.TreeSet;

public class Permutation {
	public static void permutation(int i, int m, int n, int[] permutation, Set<Integer> set) {
		if (permutation == null) {
			permutation = new int[m];
		}
		if (i < m) {// There are m layers.
			for (int j = 0; j < n; j++) {// Each layer has n choices. 
				if (!set.contains(j)) {// The choices should not be duplicate.
					permutation[i] = j;
					set.add(j);// Add the choice in the set.
					permutation(i + 1, m, n, permutation, set);
					set.remove(j);// Remove the choice from the set.
				}
			}
		} else {
			for (int j = 0; j < m; j++) {
				System.out.print(permutation[j]);// Print out the premutations.
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		permutation(0, 3, 7, null, new TreeSet<Integer>());
	}
}
