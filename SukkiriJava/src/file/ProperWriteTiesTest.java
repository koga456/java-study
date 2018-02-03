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
		
			p.setProperty("heroName", "アサカ");
			p.setProperty("heroHp", "62");
			p.setProperty("heroMp", "45");
			p.store(fr, "勇者の情報");
			fr.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
