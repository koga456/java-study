package file;
import java.io.*;
import java.util.Properties;
import java.util.StringTokenizer;

public class ProperWriteTiesTest {
	public static void main(String[] args) {
		
		FileWriter fr = null;
		Properties p =null;
		try {
			fr = new FileWriter
				("C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\rpgsave.properties");
			p = new Properties();
		
			p.setProperty("heroName", "�A�T�J");
			p.setProperty("heroHp", "62");
			p.setProperty("heroMp", "45");
			p.store(fr, "�E�҂̏��");
			fr.close();
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}

	}

}
