package string;
public class StringSearchTest {
	public static void main(String[] args) {
		
		String s1 = "Java and Javascript";
				
		if (s1.contains("Java")) {
			System.out.println("������s1�́AJava���܂�ł��܂�");
		}
		
		if (s1.endsWith("java")) {
			System.out.println("������s1�́AJava�������ɂ���܂�");
		}
		
		if (s1.startsWith("Java")) {
			System.out.println("������s1�́AJava���擪�ɂ���܂�");
		}
		
		System.out.println("������s1�ōŏ���Java���o�ꂷ��ʒu��" 
		+ s1.indexOf(s1));
		
		System.out.println("������s1�ōŌ��Java���o�ꂷ��ʒu��" 
				+ s1.lastIndexOf(s1));
		
		if (s1.isEmpty()) {
			System.out.println("s1�͋󕶎��ł�");
		}
	}

}
