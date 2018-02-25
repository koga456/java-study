package io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExecPath {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\sample1.dat");
		
		try (InputStream is = Files.newInputStream(path1)) {
			for (int ch; (ch = is.read()) != -1;) {
				System.out.println((char) ch);
			}
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
