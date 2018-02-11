package dataStructure;

import mylib.Book;

public class Exec1 {
	public static void main(String[] args) {
		Book[] books  = {
					new Book("Œá”y‚Í”L‚Å‚ ‚é", "‰Ä–ÚŸùÎ"),
					new Book("“mqt", "ŠHì—´”V‰î"),
					new Book("Œá”y‚Í”L‚Å‚ ‚é", "‰Ä–ÚŸùÎ")
						};
		
		for (int i=0; i<books.length; i++) {
			System.out.println("["  + (i+1) + "]" + books[i]);
		}
	}
}
