package dataStructure;

import java.util.ArrayList;
import mylib.Card;

public class Hand {
	private ArrayList<Card> ls;

	public Hand() {
		ls = new ArrayList<Card>();
	}

	public void add(Card card) {
		ls.add(card);
	}
	
	public Card get(int i) {
		return ls.get(i);
	}
	
	public Card remove(int i) {
		return ls.remove(i);
	}
	
	public int size() {
		return ls.size();
	}
	
	public int total() {
		int t = 0;
		for (int i=0; i<ls.size(); i++) {
			t += ls.get(i).getNumber();
		}
		return t;
	}
}
