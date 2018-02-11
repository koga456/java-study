package exception;

public class Triangle {
	private double a;
	private double b;
	private double c;
	
	Triangle (double a, double b, double c) 
			throws TriangleException {
		if (a >= b + c 
				|| b >= c + a
				|| c >= a + b) {
			
			throw new TriangleException();
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area () {
		double area = 0;
		double s = (a + b + c) / 2.0;
		area = Math.sqrt((s * (s-a) * (s-b) * (s-c)));
		
		return area;
	}
}
