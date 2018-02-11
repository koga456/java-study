package exception;

import java.io.IOException;
import java.io.PrintWriter;

import mylib.Input;

public class test2 {
	public static void main (String[] args) {
		Triangle t = null;
		
		while (t == null) {
			double a = Input.getDouble("ÓA");
			double b = Input.getDouble("ÓB");
			double c = Input.getDouble("ÓC");
			
			try {
				t = new Triangle(a, b, c);
			} catch (TriangleException e) {
				System.out.println("ÓÌ·³ª³µ­È¢");
			}
		}
		
		System.out.println("ÊÏ=" + String.valueOf(t.area()));
		try(PrintWriter out = new PrintWriter("area.txt")) {
			out.println("ÊÏ=" + String.valueOf(t.area()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
