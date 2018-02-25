package junit;

public class Greeting {
	public String getMessage(int hour) {
		String message = null;
		if (hour >= 17 || hour < 5) {
			message = "こんばんは";
		} else if ( hour < 11) {
			message = "おはようございます";
		} else {
			message = "こんにちは";
		}
		return message;
	}
}
