package file;
import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\file.dat", true);
			fw.write("����ɂ���");
			fw.write("\n");
			fw.write("���悤�Ȃ�");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		
	}

}
