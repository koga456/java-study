package mylib;
public class DummyTask {
	/* �P�b�Ԃ̎d���ɑ��� */
	public	static void	oneSecond(){
		try {
			Thread.sleep(1000); // 1�b�Ԃ̃A�C�h�����O
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/* t�b�Ԃ̎d���ɑ���(t��double�Ŏw��) */
	public	static void	seconds(double t) throws InterruptedException {
		long n = (long)(1000*t);
		Thread.sleep(n); // n�~���b�Ԃ̈ꎞ��~
	}
	public	static void	nSeconds(double t){
		long n = (long)(1000*t);
		try {
			Thread.sleep(n); // 1�b�Ԃ̈ꎞ��~
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
