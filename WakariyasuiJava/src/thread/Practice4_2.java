package thread;

import java.math.BigDecimal;
import java.util.concurrent.*;


public class Practice4_2 { 
	public static void main (String[] args) {

		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<BigDecimal> f = es.submit(new PayTask(500));
		
		try{
			BigDecimal ret = f.get();
			System.out.println("ÉŒ="+ret);
			
		} catch(InterruptedException |
				ExecutionException e){
			System.err.println(e+" Ç™î≠ê∂ÇµÇ‹ÇµÇΩ");
			f.cancel(true);
		}
		
		es.shutdown();
	}
}
