package Exercises;

public class Dealer extends Player {
	public Dealer(String name, String icon, CardDeck deck) {
		super(name, icon, deck);
	}
	public void over16() {
		while (score()<=16) {
			addACard();
		}
	}
	public String half() {
		StringBuilder sbuf = new StringBuilder();
		sbuf.append(icon).append(name).append("\t[?]\t");
		halfStr(sbuf);
		sbuf.append("********<->");
		return sbuf.toString();
	}
	public void halfStr(StringBuilder sbuf) {
		Card c = hand.get(0);
		sbuf.append(c).append("\t");
	}
	public static void main(String[] args) {
		CardDeck deck = new CardDeck(52);
		Dealer d = new Dealer("Dealer", "Å†", deck);
		System.out.println(d.half());
		System.out.println(d);
		d.over16();
		System.out.println(d);
	}
}
