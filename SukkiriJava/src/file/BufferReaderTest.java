package file;
import java.io.*;

public class BufferReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(
					"C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\file.dat");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO ©“®¶¬‚³‚ê‚½ catch ƒuƒƒbƒN
			e.printStackTrace();
		}
		
	}

}
