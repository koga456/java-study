package io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBinary {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\sample1.txt");
		System.out.println(path1.getParent());
		System.out.println(path1.resolveSibling("sample2.txt"));
		System.out.println(path1.resolveSibling("..\\sample3.txt").normalize());
	}
}
