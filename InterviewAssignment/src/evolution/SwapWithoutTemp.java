package evolution;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + " : " + y);
	}
}
