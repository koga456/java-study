package io;

import java.io.*;


public class Example12_5 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("my.txt"));
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("�t�@�C�����J���Ȃ�");
		} catch (IOException e) {
			System.out.println("�f�[�^��ǂݏo���Ȃ�");
		}
		
	}
}
