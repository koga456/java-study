package lib;

public class GetStringTest {
	public static void main(String[] args) {
		String s;
		while((s=Util.getString("入力してください"))!=null) {
			System.out.println(s);
		}
	}
}
