package class_enum;

public enum Grade {
	ECO("�G�R�m�~�[�N���X", 10000),
	BIZ("�r�W�l�X�N���X", 15000),
	FIRST("�t�@�[�X�g�N���X", 20000);
	
	String name;
	int n;
	
	Grade(String name, int n) {
		this.name = name;
		this.n = n;
	}
	
	public String toString() {
		return name + ":" + n;
	}
}
