package dataStructure;

import java.util.ArrayList;

import mylib.Card;

public class Deck {
	private ArrayList<Card> deck;
	private final int NUMBER_OF_SHEETHS = 52;
	
	public Deck() {
		deck = new ArrayList<Card>();
		init();
	}
	
	public void init() {
		deck.clear();
		for (int i = 0; i<NUMBER_OF_SHEETHS; i++) {
			deck.add(new Card(i + 1));
		}
	}
	
	public int size() {
		return deck.size();
	}
	
	public Card get(int i) {
		return deck.get(i);
	}
	
	public Card draw() {
		int i = (int)(Math.random() * size());
		Card card = deck.get(i);
		deck.remove(i);
		return card;
	}
	
	public void print() {
		for (Card card : deck) {
			System.out.println(card);
		}
	}
}
