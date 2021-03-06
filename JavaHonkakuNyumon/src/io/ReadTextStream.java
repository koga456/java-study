package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextStream {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\sample1.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(path1, StandardCharsets.UTF_8)) {
			reader.lines().forEach(System.out::println);
		} catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
}
