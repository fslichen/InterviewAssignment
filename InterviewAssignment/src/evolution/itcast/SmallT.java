package evolution.itcast;

public class SmallT {
	public static void main(String[] args) {
		SmallT t = new SmallT();
		int b = t.get();
		System.out.println(b);
	}
	
	public int get() {
		try {
			return 1;
		} finally {
			return 2;// It's going to return 2, not 1.
		}
	}
}
