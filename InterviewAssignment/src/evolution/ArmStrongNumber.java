package evolution;

import java.util.function.Function;

public class ArmStrongNumber {
	public static boolean isArmStrongNumber(Integer n) {
		String string = n.toString();
		final int length = string.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			Function<String, Integer> power = x -> {
				int product = 1;
				for (int j = 0; j < length; j++) {
					product *= new Integer(x);
				}
				return product;
			};
			sum += power.apply(string.substring(i, i + 1));
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(153));
	}
}
