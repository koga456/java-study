package string;
public class StringBuilderTest {
	public static void main(String[] args) {
		
		String s1 = "Java programing";
		String s2 = "	Java";
		
		System.out.println("‘å•¶š‚ğ¬•¶š‚É" 
				+ s1.toLowerCase());
		
		System.out.println("¬•¶š‚ğ‘å•¶š‚É" 
				+ s1.toUpperCase());
		
		System.out.println("‹ó”’‚ğœ‹" 
				+ s2.trim());
		
		System.out.println("’u‚«Š·‚¦" 
				+ s1.replace(" ", "X"));

	}

}
