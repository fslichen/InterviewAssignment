package evolution;

import java.util.stream.IntStream;

public class IsPerfectNumber {
	public static boolean isPerfectNumberByConvention(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {// This is the traditional control statement.
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum / 2 == n) {
			return true;
		} 
		return false;
	}
	
	public static boolean isPerfectNumberByLambda(int n) {
		return IntStream.rangeClosed(1, n).reduce(0, (sum, i) -> {
			return n % i == 0 ? sum + i : sum;
		}) / 2 == n ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPerfectNumberByConvention(6));
		System.out.println(isPerfectNumberByLambda(6));
	}
}
