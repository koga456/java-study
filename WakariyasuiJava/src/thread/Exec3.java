package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exec3 { 
	public static void main (String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		es.execute(new MyUploader());
		es.execute(new MyUploader());
		
		es.shutdown();
	}
}
