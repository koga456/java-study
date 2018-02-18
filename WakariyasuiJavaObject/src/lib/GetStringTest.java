package lib;

public class GetStringTest {
	public static void main(String[] args) {
		String s;
		while((s=Util.getString("“ü—Í‚µ‚Ä‚­‚¾‚³‚¢"))!=null) {
			System.out.println(s);
		}
	}
}
