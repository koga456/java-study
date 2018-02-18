package thread;

import java.util.concurrent.*;

public class Test1_3 {
	public static void main(String[] args) {
		Friend friend = new Friend();
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Integer> f = es.submit(new Sender(friend));
		try {
			int n = f.get(3000, TimeUnit.MILLISECONDS);
			System.err.println(n+"åèëóêMÇµÇ‹ÇµÇΩ");
		} catch(InterruptedException |
				ExecutionException | TimeoutException e) {
			System.err.println(e+" Ç™î≠ê∂ÇµÇ‹ÇµÇΩ");
			f.cancel(true);
		}
		es.shutdown();
	}
}
