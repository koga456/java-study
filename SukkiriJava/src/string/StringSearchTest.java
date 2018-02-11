package string;
public class StringSearchTest {
	public static void main(String[] args) {
		
		String s1 = "Java and Javascript";
				
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		
		if (s1.endsWith("java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		
		if (s1.startsWith("Java")) {
			System.out.println("文字列s1は、Javaが先頭にあります");
		}
		
		System.out.println("文字列s1で最初にJavaが登場する位置は" 
		+ s1.indexOf(s1));
		
		System.out.println("文字列s1で最後にJavaが登場する位置は" 
				+ s1.lastIndexOf(s1));
		
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}

}
