package regularExprassion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exec1 {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("\\s+");
		String sentence = "This    is a pen.";
		Matcher matcher = pattern.matcher(sentence);
		
		System.out.println(matcher.replaceAll(" "));
	}
}
