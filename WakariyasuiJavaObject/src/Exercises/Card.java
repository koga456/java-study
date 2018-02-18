package Exercises;

public class Card {
	static final int RANK = 13;
	static final int SUIT = 4;
	static final String[] NS = {"A", "2", "3", "4", "5", "6",
								"7", "8", "9", "10" ,"J", "Q", "K"};
	static final String[] SS = {"スペード", "ダイヤ", "クラブ", "ハート"};
	static final int[] PS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	private int n;
	public Card(int n) {
		this.n = n;
	}
	public int getNum() {
		return this.n;
	}
	public int cardNumber() {
		return (n - 1) % RANK + 1;
	}
	public int suitNumber() {
		return (n - 1) / RANK;
	}
	public int score() {
		return PS[cardNumber() - 1];
	}
	public String cardNumberString() {
		return NS[cardNumber() - 1];
	}
	public String suitName() {
		return SS[suitNumber()];
	}
	public String toString() {
		return suitName()+cardNumberString();
	}
}
