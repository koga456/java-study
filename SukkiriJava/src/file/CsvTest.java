package file;
import java.io.*;
import java.util.StringTokenizer;

public class CsvTest {
	public static void main(String[] args) {
		
		String s = "�~�i�g,�A�T�J,�X�K����";
		StringTokenizer st = new StringTokenizer(s, ",");
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			System.out.println(t);
		}
		
		
	}

}
