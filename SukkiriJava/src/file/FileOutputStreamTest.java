package file;
import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\rpgsave.dat", true);
			fos.write(65);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}
		
	}

}
