package thread;

public class Exec {
	public static void main(String[] args) {
		CookingRoom room = new CookingRoom();
		Thread t1 = new Thread(new Cook(room));
		Thread t2 = new Thread(new Cook(room));
		Thread t3 = new Thread(new Cook(room));
		Thread t4 = new Thread(new Waiter(room));
		Thread t5 = new Thread(new Waiter(room));
		Thread t6 = new Thread(new Waiter(room));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
