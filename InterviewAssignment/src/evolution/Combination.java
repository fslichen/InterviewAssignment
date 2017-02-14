package evolution;

public class Combination {
	public static void combination(int i, int m, int n, int[] combination) {
		if (combination == null) {
			combination = new int[m];
		}
		if (i < m) {// There are m layers.
			for (int j = 0; j < n; j++) {// Each layer has n choices.
				if (i == 0 || j > combination[i - 1]) {// The choice in the next layer should be greater than the one in the previous layer.
					combination[i] = j;
					combination(i + 1, m, n, combination);
				}
			}
		} else {
			for (int j = 0; j < m; j++) {
				System.out.print(combination[j]);// Print out the combination.
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		combination(0, 3, 7, null);
	}
}
