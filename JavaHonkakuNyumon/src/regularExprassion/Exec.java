package regularExprassion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exec {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("This is a .*\\.");
		String sentence = "This is a pen.";
		Matcher matcher = pattern.matcher(sentence);
		
		if (matcher.matches()) {
			System.out.println("“K‡‚·‚é");
		} else {
			System.out.println("“K‡‚µ‚È‚¢");
		}
	}
}
