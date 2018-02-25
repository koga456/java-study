package junit;

public class Greeting {
	public String getMessage(int hour) {
		String message = null;
		if (hour >= 17 || hour < 5) {
			message = "‚±‚ñ‚Î‚ñ‚Í";
		} else if ( hour < 11) {
			message = "‚¨‚Í‚æ‚¤‚²‚´‚¢‚Ü‚·";
		} else {
			message = "‚±‚ñ‚É‚¿‚Í";
		}
		return message;
	}
}
