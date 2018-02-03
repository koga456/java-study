package mylib;
public class PrintTask implements Runnable {
	private	String	s;
	public	PrintTask(String s){
		this.s = s; 
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++){ // 3秒間の仕事
			DummyTask.oneSecond(); // 1秒間スリープする
			System.out.println(s); 	// sを表示する
		}
	}
}
