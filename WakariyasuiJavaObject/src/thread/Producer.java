package thread;

public class Producer extends Thread {
	static final int END = -1;
	MyQueue queue = null;
	public Producer(MyQueue queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				int n = produce(i);			
				queue.put(n);		
			}
			queue.put(Producer.END);
		} catch(InterruptedException e) {}
	}
	int produce(int n) {
		sleepRandomly();
		System.out.println("Producer:" + Thread.currentThread().getName()
				+ "‚Í" + n + "@‚ð¶ŽYŠ®—¹");
		return n;
	}
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch(InterruptedException e) {}
	}
}
