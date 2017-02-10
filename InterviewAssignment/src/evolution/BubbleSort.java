package evolution;

public class BubbleSort {
	public static void bubbleSort(int[] a) {
		int length = a.length;
		for (int i = 0; i < length - 1; i++) {// In order to push length numbers, length - 1 iterations are needed. 
			for (int j = 1; j < length - i; j++) {// Push the largest number within each iteration backwards.
				if (a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {4, 3, 1, 6, 5, 2};
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
