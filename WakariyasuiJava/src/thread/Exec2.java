package thread;

public class Exec2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
		t1.start();
		t2.start();
	}
}
