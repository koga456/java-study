package file;
import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\file.dat", true);
			fw.write("Ç±ÇÒÇ…ÇøÇÕ");
			fw.write("\n");
			fw.write("Ç≥ÇÊÇ§Ç»ÇÁ");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}
		
	}

}
