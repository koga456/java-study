package lib;

public class GetStringTest {
	public static void main(String[] args) {
		String s;
		while((s=Util.getString("���͂��Ă�������"))!=null) {
			System.out.println(s);
		}
	}
}
