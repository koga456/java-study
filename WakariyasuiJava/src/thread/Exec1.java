package thread;

import mylib.DummyTask;

public class Exec1 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyPrint());
		t.start();
		
		for (int i = 0; i<3; i++) {
			DummyTask.oneSecond();
			System.out.println("--main");
		}
	}
}
