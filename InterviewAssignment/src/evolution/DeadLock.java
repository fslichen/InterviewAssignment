package evolution;

public class DeadLock {
	private String lock0 = "lock0";
	private String lock1 = "lock1";
	
	Thread thread0 = new Thread() {
		public void run() {
			while (true) {
				synchronized (lock0) {
					synchronized (lock1) {
						System.out.println("Hello World");
					}
				}
			}
		}
	};
	
	Thread thread1 = new Thread() {
		public void run() {
			while (true) {
				synchronized (lock1) {
					synchronized (lock0) {
						System.out.println("Goodbye Past");
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		deadLock.thread0.start();
		deadLock.thread1.start();
	}
}
