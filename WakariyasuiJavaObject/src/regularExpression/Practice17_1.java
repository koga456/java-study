package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice17_1 {
	public static void main(String[] args) {
		String s = "ケーキが好きですが、ワインも好きです。";
		String reg1 = "(ケーキ|ワイン)(も|が)好き";
		
		Pattern p1 = Pattern.compile(reg1);
		Matcher m1 = p1.matcher(s);
		while(m1.find()) {
			System.out.println(m1.group());
		}
	}
}
