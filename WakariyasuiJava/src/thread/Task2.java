package thread;

import mylib.DummyTask;

public class Task2 implements Runnable {
	@Override
	public void run() {
		for (int i =0; i<5; i++) {
			DummyTask.nSeconds(1.2);
			System.out.println("task-2");
		}
	}
}
