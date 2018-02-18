package io;

import java.io.*;


public class Practice12_6 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("my.txt"));
			PrintWriter pw = new PrintWriter(
					new BufferedWriter(new FileWriter("my2.txt")));
			String s = null;
			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			br.close();
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("ファイルを開けない");
		} catch (IOException e) {
			System.out.println("データを読み出せない");
		}
		
	}
}
