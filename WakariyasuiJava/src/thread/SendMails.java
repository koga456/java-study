package thread;

import java.util.ArrayList;
import java.util.concurrent.*;

public class SendMails  {
	private ArrayList<Friend> list;
	public SendMails(ArrayList<Friend> list) {
		this.list = list;
	}
	public int send() {
		// €”õ
		ArrayList<Future<Integer>> flist = new ArrayList<>();
		ExecutorService es = Executors.newCachedThreadPool();
		
		// ‘—Mˆ—
		for (int i=0; i<list.size(); i++) {
			Friend f = list.get(i);
			Future<Integer> ft = es.submit(new Sender(f));
			flist.add(ft);
		}
		
		// –ß‚è’l‚Ìæ“¾
		int n = 0;
		for (int i =0; i<flist.size(); i++) {
			Future<Integer> f = flist.get(i);
			try {
				n += f.get(2, TimeUnit.SECONDS);
			} catch(InterruptedException |
				ExecutionException | TimeoutException e) {
				System.err.println(e+" ‚ª”­¶‚µ‚Ü‚µ‚½");
				f.cancel(true);
			}
		}
		
		es.shutdown();
		return n;
	}
}
