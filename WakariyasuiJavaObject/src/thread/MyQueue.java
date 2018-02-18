package thread;

public class MyQueue {
	int[] intbuf;
	int start;
	int count;
	public MyQueue(int size) {
		intbuf = new int[size];
		start = 0;
		count = 0;
	}
	public synchronized void put(int n) throws InterruptedException {
		while (count >= intbuf.length) {
			System.out.println(Thread.currentThread().getName() + "wait : バッファの空きを待つ");
			wait();
		}
		int end = (start + count) % intbuf.length;
		System.out.println(end);
		intbuf[end] = n;
		count++;
		notifyAll();
	}
	public synchronized int take() throws InterruptedException {
		while (count == 0) {
			System.out.println(Thread.currentThread().getName() + "wait : データを待つ");
			wait();
		}
		int n = intbuf[start];
		start = (start + 1) % intbuf.length;
		count--;
		notifyAll();
		return n;
	}
}
