package pass1;

public class Exec {
	public static void main(String[] args) {
		
		int result = 1;
		LocalLogin ll = new LocalLogin();
		result = ll.login();
		if (result == 0) {
			System.out.println("���O�C������");
		}else {
			System.out.println("���O�C�����s");
		}
	}
}
