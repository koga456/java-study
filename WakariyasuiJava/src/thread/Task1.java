package thread;

import mylib.DummyTask;

public class Task1 implements Runnable {
	@Override
	public void run() {
		for (int i =0; i<5; i++) {
			DummyTask.nSeconds(0.5);
			System.out.println("task-1");
		}
	}
}
