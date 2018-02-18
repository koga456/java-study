package thread;

import java.util.concurrent.*;

import mylib.DummyTask;


public class Sample3_3 { 
	public static void main (String[] args) {

		ExecutorService es = Executors.newCachedThreadPool();
		Total kei = new Total();
		es.execute(new Calculator(kei));
		es.execute(new Calculator(kei));
		es.execute(new Calculator(kei));
		es.shutdown();
		DummyTask.nSeconds(1);
		System.out.println(kei.getTotal());
		
	}
}
