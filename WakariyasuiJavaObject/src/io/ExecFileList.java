package io;

import java.io.File;
import mylib.Input;

public class ExecFileList {
	public static void main(String[] args) {
		String dir = Input.getString("��������f�B���N�g��"); 
		File f = new File(dir);
		String[] list = f.list();
		
		if (list != null) {
			for (String name : list) {
				File test = new File(dir + File.separator + name);
				if (test.isFile()) {
					System.out.println(name);
				}
			}
		} else {
			System.out.println(dir + "�͑��݂��Ȃ����f�B���N�g���łȂ�");
		}
		
	}
}
