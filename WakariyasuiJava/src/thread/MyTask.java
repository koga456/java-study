package thread;

import java.util.concurrent.Callable;

import mylib.DummyTask;

public class MyTask implements Callable<String> {
	
	private String s;
	public MyTask(String s) {
		this.s = s;
	}
	@Override
	public String call() throws Exception {
		for (int i =0; i<3; i++) {
			DummyTask.seconds(1);
			System.out.println(s);
		}
		return "complete";
	}
}
