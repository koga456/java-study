package dataStructure;

public class Exec4 {
	public static void main(String[] args) {
		Deck d = new Deck();
		Hand h = new Hand();
		for (int i=0; i<5 ; i++) {
			h.add(d.draw());
		}
		
		for (int i=0; i<h.size(); i++) {
			System.out.println(h.get(i));
		}
	}
}
