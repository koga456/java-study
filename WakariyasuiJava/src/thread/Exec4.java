package thread;

public class Exec4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyUploader());
		Thread t2 = new Thread(new MyUploader());
		t1.start();
		t2.start();

	}
}
