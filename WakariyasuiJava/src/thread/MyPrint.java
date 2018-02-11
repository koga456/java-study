package thread;

import mylib.DummyTask;

public class MyPrint implements Runnable {
	@Override
	public void run() {
		for (int i =0; i<3; i++) {
			DummyTask.oneSecond();
			System.out.println("------print");
		}
	}
}
