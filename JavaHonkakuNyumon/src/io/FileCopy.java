package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopy {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\sample1.dat");
		Path toFile = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\copy.dat");
		
		try {
			Files.copy(path1, toFile);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
