package evolution;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbers {
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<>();
		int i = 2;
		while (primes.size() < 1000) {
			boolean isPrime = true;
			for (Integer prime : primes) {
				if (i % prime == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes.add(i);
			}
			i++;
		}
		System.out.println(primes);
	}
}
