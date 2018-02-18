package class_enum;

public class Exec2 {
	public static void main(String[] args) {
		Card d5 = new Card(Suit2.DIAMOND, 5);
		Card s1 = new Card(Suit2.SPADE, 1);
		Card s3 = new Card(Suit2.SPADE, 3);
		Card h6 = new Card(Suit2.HEART, 6);
		Card h9 = new Card(Suit2.HEART, 9);
		Card h13 = new Card(Suit2.HEART, 13);
		Card c8 = new Card(Suit2.CLUB, 8);
		Card c10 = new Card(Suit2.CLUB, 10);
		
		Card[] cards = {d5, s1, s3, h6, h9, h13, c8, c10};
		
		int d = 0;
		int s = 0;
		int h = 0;
		int c = 0;
		
		for (Card card : cards) {
			switch(card.suit) {
			case DIAMOND:
				d++;
				break;
			case SPADE:
				s++;
				break;
			case HEART:
				h++;
				break;
			case CLUB:
				c++;
			}
		}
		
		System.out.println("ダイヤ：" + d);
		System.out.println("スペード：" + s);
		System.out.println("ハート：" + h);
		System.out.println("クラブ：" + c);
	}
}
