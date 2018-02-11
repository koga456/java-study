package string;
public class StringBuilderTest {
	public static void main(String[] args) {
		
		String s1 = "Java programing";
		String s2 = "	Java";
		
		System.out.println("大文字を小文字に" 
				+ s1.toLowerCase());
		
		System.out.println("小文字を大文字に" 
				+ s1.toUpperCase());
		
		System.out.println("空白を除去" 
				+ s2.trim());
		
		System.out.println("置き換え" 
				+ s1.replace(" ", "X"));

	}

}
