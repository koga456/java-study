package pass2;

public class Exec {
	public static void main(String[] args) {
		Shipping[] sp = new Shipping[3];
		sp[0] = new Handbag("SIG101", "�N���X�e�B��", 1);
		sp[1] = new Chair("S203", "���X�c�[��");
		sp[2] = new Dumbbell("RND11", "�ی^�_���x��", 3);
		System.out.println("�i�@��\tCODE\t���i\t����\t�萔��");
		for (Shipping obj : sp) {
			System.out.println(obj.info() 
					+ "\t" + obj.shipping()
					+ "\t"+ obj.handling()
				);
		}
	}
}
