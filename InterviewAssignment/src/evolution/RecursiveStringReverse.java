package evolution;

public class RecursiveStringReverse {
	public static String recursiveReverse(String string) {
		if (string.length() == 1) {
			return string;
		} else {
			return string.charAt(string.length() - 1) + recursiveReverse(string.substring(0, string.length() - 1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(recursiveReverse("Hello World"));
	}
}
