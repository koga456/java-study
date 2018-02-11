package mylib;
public class DummyTask {
	/* ‚P•bŠÔ‚Ìd–‚É‘Š“– */
	public	static void	oneSecond(){
		try {
			Thread.sleep(1000); // 1•bŠÔ‚ÌƒAƒCƒhƒŠƒ“ƒO
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/* t•bŠÔ‚Ìd–‚É‘Š“–(t‚Ídouble‚Åw’è) */
	public	static void	seconds(double t) throws InterruptedException {
		long n = (long)(1000*t);
		Thread.sleep(n); // nƒ~ƒŠ•bŠÔ‚Ìˆê’â~
	}
	public	static void	nSeconds(double t){
		long n = (long)(1000*t);
		try {
			Thread.sleep(n); // 1•bŠÔ‚Ìˆê’â~
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
