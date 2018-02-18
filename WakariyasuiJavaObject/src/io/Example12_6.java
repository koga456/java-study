package io;

import java.io.*;


public class Example12_6 {
	public static void main(String[] args) {
		Dog taroh = new Dog("‘¾˜Y");
		try {
			ObjectOutputStream out 
			= new ObjectOutputStream(new FileOutputStream("dog.ser"));
			out.writeObject(taroh);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
