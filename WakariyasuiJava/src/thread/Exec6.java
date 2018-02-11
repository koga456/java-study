package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exec6 { 
	public static void main (String[] args) {

		ExecutorService es = Executors.newCachedThreadPool();
		
		for (int i=0;i<50;i++) {
			es.execute(new MyUploader());
		}
		
		es.shutdown();
	}
}
