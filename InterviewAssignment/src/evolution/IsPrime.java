package evolution;

import java.util.stream.IntStream;

public class IsPrime {
	public static boolean isPrime(int n) {
		int factorCount = IntStream.range(2, n / 2).map(x -> n % x == 0 ? 1 : 0).reduce(0, (count, x) -> count + x);
		return factorCount > 0 ? false : true;
	}
	
	public static boolean isPrimeByConvention(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeByConvention(23));
	}
}
