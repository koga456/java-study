package io;

import java.io.*;

import mylib.Input;

public class Practice12_4 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("my.txt");
			String s = null;
			while ((s = Input.getString("String:")) != null) {
				pw.println(s);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("ƒtƒ@ƒCƒ‹‚ğì¬‚Å‚«‚È‚¢");
		}
		
	}
}
