package string;
public class StringBuilderTest {
	public static void main(String[] args) {
		
		String s1 = "Java programing";
		String s2 = "	Java";
		
		System.out.println("�啶������������" 
				+ s1.toLowerCase());
		
		System.out.println("��������啶����" 
				+ s1.toUpperCase());
		
		System.out.println("�󔒂�����" 
				+ s2.trim());
		
		System.out.println("�u������" 
				+ s1.replace(" ", "X"));

	}

}
