package junit;

public class Greeting {
	public String getMessage(int hour) {
		String message = null;
		if (hour >= 17 || hour < 5) {
			message = "����΂��";
		} else if ( hour < 11) {
			message = "���͂悤�������܂�";
		} else {
			message = "����ɂ���";
		}
		return message;
	}
}
