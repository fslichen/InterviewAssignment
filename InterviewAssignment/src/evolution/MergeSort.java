package evolution;

import org.junit.Test;

public class MergeSort {
	public void swap(double[] numbers, int i, int j) {
		double t = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = t;
	}
	
	public double[] mergeSort(double[] numbers) {
		return mergeSort(numbers, 0 , numbers.length - 1);
	}
	
	public double[] mergeSort(double[] numbers, int beginIndex, int endIndex) {
		if (beginIndex == endIndex) {
			double[] sortedNumbers = new double[1];
			sortedNumbers[0] = numbers[beginIndex];
			return sortedNumbers;
		}
		int middleIndex = (beginIndex + endIndex) / 2;
		double[] leftNumbers = mergeSort(numbers, beginIndex, middleIndex);
		double[] rightNumbers = mergeSort(numbers, middleIndex + 1, endIndex);
		double[] sortedNumbers = new double[endIndex + 1 - beginIndex];
		int i = 0, j = 0, k = 0;
		while (i < leftNumbers.length && j < rightNumbers.length) {
			if (leftNumbers[i] < rightNumbers[j]) {
				sortedNumbers[k] = leftNumbers[i];
				i++;
			} else {
				sortedNumbers[k] = rightNumbers[j];
				j++;
			}
			k++;
		}
		while (i < leftNumbers.length) {
			sortedNumbers[k] = leftNumbers[i];
			i++;
			k++;
		}
		while (j < rightNumbers.length) {
			sortedNumbers[k] = rightNumbers[j];
			j++;
			k++;
		}
		return sortedNumbers;
	}
	
	@Test
	public void test() {
		double[] numbers = {1.0, 5.0, 7.0, 3.0, 4.0, 6.0, 2.0, 2.0};
		numbers = mergeSort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}	
