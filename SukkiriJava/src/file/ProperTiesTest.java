package file;
import java.io.*;
import java.util.Properties;
import java.util.StringTokenizer;

public class ProperTiesTest {
	public static void main(String[] args) {
		
		Reader fr = null;
		Properties p =null;
		try {
			fr = new FileReader
				("C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\rpgsave.properties");
			p = new Properties();
			p.load(fr);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		System.out.println("勇者の名前" + name);
		System.out.println("勇者のHP" + strHp);
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
