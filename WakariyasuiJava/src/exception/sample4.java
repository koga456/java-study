package exception;

import java.io.*;

public class sample4 {
	public static void main (String[] args) {
		
		try(BufferedReader in = new BufferedReader(
				new FileReader("note.txt"));
			PrintWriter out = new PrintWriter("new.txt")) {
			
			String s = null;
			while ((s = in.readLine()) != null) {
				out.println(s);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
