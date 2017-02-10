package evolution;

public class Singleton {
	private static Singleton singleton;// Make it static because the singleton object belongs to the class.
	
	private Singleton() {// Define a private constructor to avoid arbitrary creation of an object.
		
	}
	
	static {
		singleton = new Singleton();
	}
	
	public static Singleton getSingleton() {// Only one object is created upon class loading.
		return singleton;
	}
	
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
	}
}
