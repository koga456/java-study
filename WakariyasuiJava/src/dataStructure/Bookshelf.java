package dataStructure;

import mylib.Book;


public class Bookshelf {
	private Book[] books;
	
	public Bookshelf(Book[] books) {
		this.books = books;
	}
	
	public int size() {
		return books.length;
	}
	
	public Book get(int i){
		return books[i];
	}
}
