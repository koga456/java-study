package string;
public class RegularExpressionTest {
	public static void main(String[] args) {
		
		String s1 = "Z12z4567";
		
		boolean b = s1.matches("[A-Z][\\w]{7}");
		
		if (b) {
			System.out.println("��v");
		}else {
			System.out.println("�s��v");
		}
	}

}
