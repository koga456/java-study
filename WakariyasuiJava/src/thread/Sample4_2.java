package thread;

import java.util.concurrent.*;


public class Sample4_2 { 
	public static void main (String[] args) {

		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> f = es.submit(new MyTask("------task"));
		
		try{
			String ret = f.get(4000, TimeUnit.MILLISECONDS);
			System.out.println("戻り値="+ret);
			
		} catch(InterruptedException |
				ExecutionException | TimeoutException e){
			System.err.println(e+" が発生しました");
			f.cancel(true);
		}
		
		es.shutdown();
	}
}
