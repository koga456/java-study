package Exercises;

import java.util.ArrayList;

public class CardDeck {
	private int max;
	private ArrayList<Card> deck;
	public CardDeck(int max) {
		this.max = max;
		deck = new ArrayList<Card>();
		initialize();
	}
	public void initialize() {
		deck.clear();
		for (int i=1; i<=max; i++) {
			Card c = new Card(i);
			deck.add(c);
		}
	}
	public int size() {
		return deck.size();
	}
	public Card next() {
		int n = size();
		if (n == 0) {
			return null;
		}
		int p = (int)(Math.random()*n);
		Card c = deck.remove(p);
		return c;
		
	}
//	void check() {
//		for (Card c : deck) {
//			System.out.println(c);
//		}
//	}
//	public static void main(String[] a) {
//		CardDeck cd = new CardDeck(52);
//		cd.check();
//	}
	public Card indexOf(int k) {
		return deck.get(k);
	}
	public static void main(String[] a) {
		CardDeck cd = new CardDeck(52);
		Card card;
		while((card=cd.next()) != null) {
			System.out.println(card);
		}
	}
}
