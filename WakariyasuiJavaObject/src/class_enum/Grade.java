package class_enum;

public enum Grade {
	ECO("エコノミークラス", 10000),
	BIZ("ビジネスクラス", 15000),
	FIRST("ファーストクラス", 20000);
	
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
