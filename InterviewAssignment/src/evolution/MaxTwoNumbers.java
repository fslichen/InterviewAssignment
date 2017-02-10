package evolution;

public class MaxTwoNumbers {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 7, 9, 1, 2};
		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (largestNumber < numbers[i]) {
				secondLargestNumber = largestNumber;
				largestNumber = numbers[i];
			} else if (secondLargestNumber < numbers[i]) {
				secondLargestNumber = numbers[i];
			}
		}
		System.out.println(largestNumber + " : " + secondLargestNumber);
	}
}
