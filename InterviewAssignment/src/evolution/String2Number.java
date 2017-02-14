package evolution;

public class String2Number {
	public static int run(String string) {
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			sum = sum * 10 + string.charAt(i) - (int) '0';// You don't need to memorize the ascii table.
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(run("21354"));
	}
}
