package io;

import java.io.File;
import mylib.Input;

public class ExecExists {
	public static void main(String[] args) {
		String fname = Input.getString("パス"); 
		File f = new File(fname);
		
		if (f.exists()) {
			System.out.println(fname + "は存在する");
		} else {
			System.out.println(fname + "は存在しない");
		}
		
	}
}
