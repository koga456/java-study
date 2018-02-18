package thread;

public class Consumer extends Thread {
	MyQueue queue = null;
	public Consumer(MyQueue queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			while(true) {
				int n = queue.take();
				if (n == Producer.END) {
					break;
				}
				consume(n);
			}
		} catch(InterruptedException e) {}
	}
	void consume(int n) {
		System.out.println("Consumer:" + Thread.currentThread().getName()
				+ "‚Í" + n + "@‚ğÁ”ï’†");
		sleepRandomly();
	}
	void sleepRandomly() {
		try {
			int n = (int)(Math.random() * 1000);
			Thread.sleep(n);
		} catch(InterruptedException e) {}
	}
}
