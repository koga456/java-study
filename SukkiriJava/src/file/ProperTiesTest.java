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
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		System.out.println("�E�҂̖��O" + name);
		System.out.println("�E�҂�HP" + strHp);
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}

}
