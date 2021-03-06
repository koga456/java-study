package thread;

import java.math.BigDecimal;
import java.util.concurrent.*;


public class Practice4_2 { 
	public static void main (String[] args) {

		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<BigDecimal> f = es.submit(new PayTask(500));
		
		try{
			BigDecimal ret = f.get();
			System.out.println("π="+ret);
			
		} catch(InterruptedException |
				ExecutionException e){
			System.err.println(e+" が発生しました");
			f.cancel(true);
		}
		
		es.shutdown();
	}
}
