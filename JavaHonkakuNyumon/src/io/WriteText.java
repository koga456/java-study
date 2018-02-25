package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteText {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\sample2.txt");
		
		try (BufferedWriter writer = Files.newBufferedWriter(path1, StandardCharsets.UTF_8)) {
			writer.append("test");
			writer.newLine();
			writer.append("test2");
		} catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
}
