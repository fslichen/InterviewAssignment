package evolution;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 12345;
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		}
		System.out.println(reverseNumber);
	}
}
