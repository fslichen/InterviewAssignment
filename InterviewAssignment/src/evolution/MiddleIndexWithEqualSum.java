package evolution;

public class MiddleIndexWithEqualSum {
	public static void equalSum(int[] a) {
		int leftIndex = 0;
		int rightIndex = a.length - 1;
		int leftSum = 0;
		int rightSum = 0;
		while (leftIndex < rightIndex) {
			leftSum += a[leftIndex++];// The array use leftIndex first before increment of leftIndex.
			rightSum += a[rightIndex--];// The array use rightIndex first before decrement of rightIndex.
		}
		if (leftSum == rightSum) {
			System.out.println(leftIndex + " : " + rightIndex);
		} else {
			System.out.println("Not Found");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 6, 3, 3, 3};
		equalSum(a);
	}
}
