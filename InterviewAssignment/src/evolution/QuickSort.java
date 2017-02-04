package evolution;

import org.junit.Test;

public class QuickSort {
	public void quickSort(double[] numbers) {
		quickSort(numbers, 0, numbers.length - 1);
	}
	
	public void quickSort(double[] numbers, int beginIndex, int endIndex) {
		int i = beginIndex;
		int j = endIndex;
		if (i >= j) {
			return;
		}
		double pivot = numbers[i];
		while (i < j) {
			while (i < j) {
				if (numbers[i] >= pivot) {
					break;
				} else {
					i++;
				}
			}
			while (i < j) {
				if (numbers[j] <= pivot) {
					break;
				} else {
					j--;
				}
			}
			if (i < j) {
				swap(numbers, i, j);
				i++;
			}
		}
		quickSort(numbers, beginIndex, i - 1);
		quickSort(numbers, i + 1, endIndex);
	}
	
	public void swap(double[] numbers, int i, int j) {
		double t = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = t;
	}
	
	@Test
	public void test() {
		double[] numbers = {1.0, 2.0, 2.0, 4.0, 3.0, 10.0, 0.0, 18.0, 23.0, 12.0, 15.0};
		quickSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
