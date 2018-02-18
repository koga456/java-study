package thread;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

import mylib.Pai;

public class PayTask implements Callable<BigDecimal> {
	
	private int n;
	public PayTask(int n) {
		this.n = n;
	}
	@Override
	public BigDecimal call() throws Exception {
		
		if(this.n<=0) throw new Exception();
		BigDecimal x = Pai.calc(this.n);
		return x;
	}
}
