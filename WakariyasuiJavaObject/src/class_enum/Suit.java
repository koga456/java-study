package class_enum;

public enum Suit {
	SPADE("�X�y�[�h", 0),
	DIAMOND("�_�C��", 1),
	CLUB("�N���u", 2),
	HEART("�n�[�g", 3);
	
	String name;
	int n;
	
	Suit(String name, int n) {
		this.name = name;
		this.n = n;
	}
}
