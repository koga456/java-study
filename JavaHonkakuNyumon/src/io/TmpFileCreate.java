package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TmpFileCreate {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\newDir");
				
		try {
			Path tempPath = Files.createTempFile(path1, "pre", "tmp");
			System.out.println(tempPath);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
