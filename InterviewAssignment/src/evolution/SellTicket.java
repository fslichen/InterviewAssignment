package evolution;

import org.junit.Test;

public class SellTicket {
	public int ticketCount = 10;
	
	public synchronized void sellTicket(String salesPerson) {
		if (ticketCount > 0) {
			ticketCount--;
			System.out.println(salesPerson + " has sold a ticket. The remaining ticket count is " + ticketCount + ".");
		}
	}
	
	@Test
	public void test() {
		Thread thread0 = new Thread() {
			public void run() {
				while (ticketCount > 0) {
					sellTicket("Thread one");
				}
			}
		};
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while (ticketCount > 0) {
					sellTicket("Thread two");
				}
			}
		});
		thread0.start();
		thread1.start();
	}
}
