package thread;

import mylib.DummyTask;

public class MyUploader implements Runnable {
	@Override
	public void run() {
		for (int i =0; i<5; i++) {
			DummyTask.oneSecond();
			System.out.println("Uploading...");
		}
	}
}
