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
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
