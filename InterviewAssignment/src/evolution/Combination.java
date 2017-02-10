package evolution;

public class Combination {
	public static void permutation(int i, int m, int n, int[] combination) {
		if (combination == null) {
			combination = new int[m];
		}
		if (i < m) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j > combination[i - 1]) {
					combination[i] = j;
					permutation(i + 1, m, n, combination);
				}
			}
		} else {
			for (int j = 0; j < m; j++) {
				System.out.print(combination[j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		permutation(0, 2, 7, null);
	}
}
