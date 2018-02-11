package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test1 {
	public static void main (String[] args) {
		
		try(BufferedReader in = new BufferedReader(
				new FileReader("src\\mylib\\Dice.java"))) {
			
			String s = null;
			int line = 0;
			int ch = 0;
			while ((s = in.readLine()) != null) {
				
				line++;
				ch += s.length();
			}
			
			System.out.println("çsêî=" + line);
			System.out.println("éöêî=" + ch);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
