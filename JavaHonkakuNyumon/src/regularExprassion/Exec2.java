package regularExprassion;

import java.util.regex.Pattern;

public class Exec2 {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("\\s+");
		String sentence = "This is a pen.";
		String[] words = pattern.split(sentence);
		
		for (String word : words) {
			System.out.println(word);
		}
	}
}
