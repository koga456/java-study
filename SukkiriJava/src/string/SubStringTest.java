package string;
public class SubStringTest {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 100; i++) {
			sb.append("Java" + String.valueOf(i));
		}

		String s = sb.toString();
		System.out.println(s);
	}

}
