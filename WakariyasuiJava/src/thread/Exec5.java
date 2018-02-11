package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mylib.PrintTask;

public class Exec5 { 
	public static void main (String[] args) {
//		ExecutorService es = Executors.newSingleThreadExecutor();
//		ExecutorService es = Executors.newFixedThreadPool(2);
		ExecutorService es = Executors.newCachedThreadPool();
		
		es.execute(new PrintTask("------1"));
		es.execute(new PrintTask("------------2"));
		es.execute(new PrintTask("------------------3"));
		
		es.shutdown();
	}
}
