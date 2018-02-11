package exception;

import java.io.IOException;
import java.io.PrintWriter;

import mylib.Input;

public class test2 {
	public static void main (String[] args) {
		Triangle t = null;
		
		while (t == null) {
			double a = Input.getDouble("ï”A");
			double b = Input.getDouble("ï”B");
			double c = Input.getDouble("ï”C");
			
			try {
				t = new Triangle(a, b, c);
			} catch (TriangleException e) {
				System.out.println("ï”ÇÃí∑Ç≥Ç™ê≥ÇµÇ≠Ç»Ç¢");
			}
		}
		
		System.out.println("ñ êœ=" + String.valueOf(t.area()));
		try(PrintWriter out = new PrintWriter("area.txt")) {
			out.println("ñ êœ=" + String.valueOf(t.area()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
