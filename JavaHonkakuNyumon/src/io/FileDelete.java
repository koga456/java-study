package io;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDelete {
	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\copy.dat");
		
		try {
			Files.delete(path);
		} catch(NoSuchFileException ex) {
			System.out.println(ex);
		} catch(DirectoryNotEmptyException ex) {
			System.out.println(ex);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
