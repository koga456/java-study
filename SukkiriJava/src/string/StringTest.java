package string;
public class StringTest {
	public static void main(String[] args) {
		
		String s1 = " ";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2‚Æs3‚Í“™‚µ‚¢");
		}
		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2‚Æs3‚ÍƒP[ƒX‚ğ‹æ•Ê‚µ‚È‚¯‚ê‚Î“™‚µ‚¢");
		}
		
		System.out.println("s1‚Ì’·‚³‚Í" + s1.length() + "‚Å‚·");
		
		if (s1.isEmpty()) {
			System.out.println("s1‚Í‹ó•¶š‚Å‚·");
		}
	}

}
