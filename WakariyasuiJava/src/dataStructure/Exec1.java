package dataStructure;

import mylib.Book;

public class Exec1 {
	public static void main(String[] args) {
		Book[] books  = {
					new Book("��y�͔L�ł���", "�Ėڟ���"),
					new Book("�m�q�t", "�H�열�V��"),
					new Book("��y�͔L�ł���", "�Ėڟ���")
						};
		
		for (int i=0; i<books.length; i++) {
			System.out.println("["  + (i+1) + "]" + books[i]);
		}
	}
}
