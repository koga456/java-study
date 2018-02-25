package junit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class GreetingTest {

	private Greeting target = new Greeting();
	
	@Test
	public void getMessage_朝開始() {
		String message = this.target.getMessage(5);
		assertThat(message, is("おはようございます"));
	}
	
	@Test
	public void getMessage_昼開始() {
		String message = this.target.getMessage(11);
		assertThat(message, is("こんにちは"));
	}
	
	@Test
	public void getMessage_夜開始() {
		String message = this.target.getMessage(17);
		assertThat(message, is("こんばんは"));
	}
}
