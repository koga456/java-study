package thread;

import java.util.ArrayList;

public class Test1_5 {
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for (int i=0; i<5; i++) {
			Friend f = new Friend();
			list.add(f);
		}
		SendMails s = new SendMails(list);
		int n = s.send();
		
		System.out.println(n + "Œ‚Ìƒ[ƒ‹‚ð‘—M‚µ‚Ü‚µ‚½");
	}
}
