package junit;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class GreetingTest {

	private Greeting target = new Greeting();
	
	@Test
	public void getMessage_���J�n() {
		String message = this.target.getMessage(5);
		assertThat(message, is("���͂悤�������܂�"));
	}
	
	@Test
	public void getMessage_���J�n() {
		String message = this.target.getMessage(11);
		assertThat(message, is("����ɂ���"));
	}
	
	@Test
	public void getMessage_��J�n() {
		String message = this.target.getMessage(17);
		assertThat(message, is("����΂��"));
	}
}
