package mylib;
public class DummyTask {
	/* １秒間の仕事に相当 */
	public	static void	oneSecond(){
		try {
			Thread.sleep(1000); // 1秒間のアイドリング
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/* t秒間の仕事に相当(tはdoubleで指定) */
	public	static void	seconds(double t) throws InterruptedException {
		long n = (long)(1000*t);
		Thread.sleep(n); // nミリ秒間の一時停止
	}
	public	static void	nSeconds(double t){
		long n = (long)(1000*t);
		try {
			Thread.sleep(n); // 1秒間の一時停止
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
