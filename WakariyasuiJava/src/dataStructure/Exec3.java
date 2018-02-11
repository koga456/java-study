package dataStructure;

import mylib.Card;

public class Exec3 {
	public static void main(String[] args) {
		Deck d = new Deck();
		for (int i=0; i<5 ; i++) {
			Card card = d.draw();
			System.out.println(card);
		}
		
		System.out.println("Žc‚è" + d.size() + "–‡");
	}
}
