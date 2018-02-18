package class_enum;

public enum Suit {
	SPADE("スペード", 0),
	DIAMOND("ダイヤ", 1),
	CLUB("クラブ", 2),
	HEART("ハート", 3);
	
	String name;
	int n;
	
	Suit(String name, int n) {
		this.name = name;
		this.n = n;
	}
}
