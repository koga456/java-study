package io;

import java.io.*;


public class Example12_7 {
	public static void main(String[] args) {
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("dog.ser"));
			Dog taroh = (Dog)(in.readObject());
			System.out.println("–¼‘O=" + taroh.getName());
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
