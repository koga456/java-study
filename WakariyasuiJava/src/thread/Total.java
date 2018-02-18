package thread;

public class Total {
	private int sum;
	public synchronized void add(int n) {
		int pre = sum;
		System.out.println(pre+"+"+n+"="+(sum+=n));
	}
	public int getTotal() {return sum;}

}
