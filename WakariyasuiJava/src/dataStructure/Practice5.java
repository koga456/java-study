package dataStructure;

import mylib.Card;

public class Practice5 {
	public static void main(String[] args) {
		Hand h = new Hand();
		h.add(new Card(0,1));
		h.add(new Card(1,3));
		h.add(new Card(1,10));
		h.add(new Card(2,13));
		h.add(new Card(3,5));
		
		h.remove(1);
		
		for (int i=0; i<h.size(); i++) {
			System.out.println(h.get(i));
		}
		
		System.out.println("‡Œv=" + h.total());
	}
}
