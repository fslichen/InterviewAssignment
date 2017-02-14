package evolution;

public class SelectionSort {
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int j4Min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j4Min] > a[j]) {
					j4Min = j;
				}
			}
			if (i != j4Min) {
				int t = a[i];
				a[i] = a[j4Min];
				a[j4Min] = t;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3, 4, 6, 1, 2, 10, 18};
		selectionSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
