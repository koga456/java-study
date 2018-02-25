package io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteBinary {
	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\sample2.dat");
		byte[] data = new byte[]{0x41, 0x42, 0x43};
		
		try (OutputStream stream = Files.newOutputStream(path1, StandardOpenOption.APPEND,
				StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
			stream.write(data);
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
