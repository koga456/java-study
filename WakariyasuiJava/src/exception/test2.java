package exception;

import java.io.IOException;
import java.io.PrintWriter;

import mylib.Input;

public class test2 {
	public static void main (String[] args) {
		Triangle t = null;
		
		while (t == null) {
			double a = Input.getDouble("��A");
			double b = Input.getDouble("��B");
			double c = Input.getDouble("��C");
			
			try {
				t = new Triangle(a, b, c);
			} catch (TriangleException e) {
				System.out.println("�ӂ̒������������Ȃ�");
			}
		}
		
		System.out.println("�ʐ�=" + String.valueOf(t.area()));
		try(PrintWriter out = new PrintWriter("area.txt")) {
			out.println("�ʐ�=" + String.valueOf(t.area()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
