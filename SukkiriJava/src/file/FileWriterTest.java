package file;
import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\file.dat", true);
			fw.write("こんにちは");
			fw.write("\n");
			fw.write("さようなら");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
