package regularExpression;

import java.util.Scanner;

public class Practice17_4 {
	public static void main(String[] args) {
		String s = "ab ‚ ‚¢‚¤ 12,567 a,,";
		Scanner sc = new Scanner(s);
		sc.useDelimiter("\\s+|,+");
		
		while(sc.hasNext()) {
			String str = sc.next();
			System.out.println(str);
		}
		sc.close();
	}
}
