package io;

import java.io.File;

public class ExecMkdirs {
	public static void main(String[] args) {
		String FS = File.separator;
		File f = new File("c:" + FS + "mydata" + FS + "sys");
		boolean result = f.mkdirs();
		System.out.println("Œ‹‰ÊF" + result);
	}
}
