package io;

import java.io.File;
import mylib.Input;

public class ExecExists {
	public static void main(String[] args) {
		String fname = Input.getString("ÉpÉX"); 
		File f = new File(fname);
		
		if (f.exists()) {
			System.out.println(fname + "ÇÕë∂ç›Ç∑ÇÈ");
		} else {
			System.out.println(fname + "ÇÕë∂ç›ÇµÇ»Ç¢");
		}
		
	}
}
