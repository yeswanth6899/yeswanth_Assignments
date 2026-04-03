
class TicketCounter{
	private int availableSeats = 10;
	
	public synchronized boolean bookSeat(String counterName) {
		if(availableSeats>0) {
			availableSeats--;
			System.out.println(counterName + " booked a seat. Remaining: " + availableSeats);
			return true;
		}
		else {
			System.out.println(counterName + " No seats Available!");
			return false;
		}
	}
	
	public int getAvailableSeats(){
		return availableSeats;
	}
}
public class CinemaTicketBookingSystem {
	public static void main(String[] args) throws InterruptedException {
		TicketCounter counter = new TicketCounter();
		Thread t1 = new Thread(()->{
		for(int i=0; i<= 4; i++) {
			counter.bookSeat("COUNTER-A");
			try {
				Thread.sleep(50);
			}
			catch(Exception e) {
				System.out.println("Exception Handled");
			}
		}
				
	});
		
		Thread t2 = new Thread(()->{
			for(int i=0; i<= 4; i++) {
				counter.bookSeat("COUNTER-B");
				try {
					Thread.sleep(50);
				}
				catch(Exception e) {
					System.out.println("Exception Handled");
				}
			}
					
		});
		Thread t3 = new Thread(()->{
			for(int i=0; i<= 4; i++) {
				counter.bookSeat("COUNTER-C");
				try {
					Thread.sleep(50);
				}
				catch(Exception e) {
					System.out.println("Exception Handled");
				}
			}
					
		});
	
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Booking closed. Seats remaining: " + counter.getAvailableSeats());
	}
}
