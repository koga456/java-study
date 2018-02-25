package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFilter {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\userlist.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(path1, StandardCharsets.UTF_8)) {
			reader.lines()
				.map(s -> s.split(" ")[0]).distinct()
				.forEach(System.out::println);
		} catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
}
