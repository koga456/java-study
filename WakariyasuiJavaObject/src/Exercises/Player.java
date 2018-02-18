package Exercises;

import java.util.ArrayList;

public class Player {
	protected CardDeck deck;
	protected ArrayList<Card> hand;
	protected String name;
	protected String icon;
	
	public Player(String name, String icon, CardDeck deck) {
		this.name = name;
		this.icon = icon;
		this.deck = deck;
		hand = new ArrayList<Card>();
		initialize();
	}
	public void initialize() {
		hand.clear();
		for (int i=0; i<2; i++) {
			addACard();
		}
	}
	public void addACard() {
		Card c = deck.next();
		if (c != null) {
			hand.add(c);
		}
	}
	public int score() {
		int sum = 0;
		for (Card c : hand) {
			sum += c.score();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sbuf = new StringBuilder();
		sbuf.append(icon).append(name).append("\t[").append(score()).append("]\t");
		cardStr(sbuf);
		return sbuf.toString();
	}
	void cardStr(StringBuilder sbuf) {
		for (Card c: hand) {
			sbuf.append(c);
			sbuf.append("\t");
		}
	}
//	void check() {
//		System.out.print(icon + name + "\t");
//		for (Card c: hand) {
//			System.out.print(c + "\t");
//		}
//	}
//	public static void main(String[] a) {
//		CardDeck deck = new CardDeck(52);
//		Player p = new Player("Player", "¡", deck);
//		p.check();
//	}
	public static void main(String[] a) {
		CardDeck deck = new CardDeck(52);
		Player p = new Player("Player", "¡", deck);
		p.addACard();
		System.out.println(p);
	}
}
