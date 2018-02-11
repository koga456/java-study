package dataStructure;

import java.util.ArrayList;

import mylib.Input;

public class Example4_2 {
	public static void main (String[] args) {
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("2106");
		ls.add("3364");
		ls.add("4278");
		ls.add("5870");
		ls.add("8904");
		
		String s = null;
		
		s = Input.getStr("String");
		int p = ls.indexOf(s);
		if (p != -1) {
			
			ls.set(p, "****");
			for (String str : ls) {
				System.out.println(str);
			}
		} else {
			System.out.println("そのオブジェクトは含まれていない");
		}
	}
}
