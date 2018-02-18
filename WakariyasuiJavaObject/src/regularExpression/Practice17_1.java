package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice17_1 {
	public static void main(String[] args) {
		String s = "�P�[�L���D���ł����A���C�����D���ł��B";
		String reg1 = "(�P�[�L|���C��)(��|��)�D��";
		
		Pattern p1 = Pattern.compile(reg1);
		Matcher m1 = p1.matcher(s);
		while(m1.find()) {
			System.out.println(m1.group());
		}
	}
}
