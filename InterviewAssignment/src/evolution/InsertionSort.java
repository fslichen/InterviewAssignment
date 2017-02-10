package evolution;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {4, 3, 1, 2, 5, 7, 6};
		int length = a.length;
		for (int i = 1; i < length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		for (int i = 0; i < length; i++) {
			System.out.print(a[i]);
		}
	}
}
