package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirCreate {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\newDir\\newSubDir");
				
		try {
			Files.createDirectories(path1);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
