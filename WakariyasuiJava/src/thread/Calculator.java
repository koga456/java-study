package thread;

public class Calculator implements Runnable {
	private Total t;
	public Calculator(Total t) {
		this.t = t;
	}
	public void run() {
		int n = (int)(Math.random()*10+1);
		t.add(n);
	}
}
