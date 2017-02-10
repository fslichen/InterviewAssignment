package evolution;

public class Int2Decimal {
	public static void main(String[] args) {
		int x = 65536;
		int[] binaries = new int[100];// This style is deprecated, user in interview only, don't use in practice.
		int i = 0;
		while (x > 0) {
			binaries[i++] = x % 2;// This is an efficient way of incrementing i.
			x = x / 2;
		}
		for (i = binaries.length - 1; i >= 0; i--) {
			System.out.print(binaries[i]);
		}
	}
}
