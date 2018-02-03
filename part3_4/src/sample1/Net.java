package sample1;
import java.io.*;
import java.net.*;

public class Net {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://dokojava.jp");
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			int i = isr.read();
			while(i != -1) {
				System.out.print((char) i);
				i = isr.read();
			}
			
			isr.close();
			
		} catch (IOException e) {
			// TODO ©“®¶¬‚³‚ê‚½ catch ƒuƒƒbƒN
			e.printStackTrace();
		}
	}

}
