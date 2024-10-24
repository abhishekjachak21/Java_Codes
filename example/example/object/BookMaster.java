package com.example.object;

class Book {

	String author;
	String ISBN;
	String title;
	String yearPublished;

	public Book() {
	}

	public Book(String author, String iSBN, String title, String yearPublished) {
		super();
		this.author = author;
		ISBN = iSBN;
		this.title = title;
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", ISBN=" + ISBN + ", title=" + title + ", yearPublished=" + yearPublished
				+ "]";
	}

	@Override
	public boolean equals(Object o) {
		Book book = (Book) o;
		if (this.author.equals(book.author) && this.title.equals(book.title) && this.ISBN.equals(book.ISBN))
			return true;
		else
			return false;
	}

}

interface ilibrary {
	void insertBook(Book book);

	Book[] getAllBooksInLibrary();
}

class BookLibrary implements ilibrary {
	Book books[];

	public BookLibrary() {
		books = new Book[10];
	}

	@Override
	public void insertBook(Book book) {
		if (doesBookExistsInLibrary(book)) {
			System.out.println("the book already exists");
			return;
		}
		for (int i = 0; i < books.length; i++) {
			if (this.books[i] == null) {
				System.out.println("adding book with title "+book.title);
				books[i] = book;
				break;
			}
		}
	}

	public boolean doesBookExistsInLibrary(Book b) {
		boolean doesExist = false;
		for (Book book : this.books) {
			if (book!=null && b.equals(book)) {
				doesExist = true;
				break;
			}
			
		}
		return doesExist;
	}

	@Override
	public Book[] getAllBooksInLibrary() {
		return this.books;
	}

}

public class BookMaster {
	public static void main(String[] args) {

		Book book1 = new Book("George Orwell", "9780451524935", "1984", "1949");
		Book book2 = new Book("J.K. Rowling", "9780747532743", "Harry Potter and the Philosopher's Stone", "1997");
		Book book3 = new Book("Harper Lee", "9780061120084", "To Kill a Mockingbird", "1960");
		Book book4 = new Book("F. Scott Fitzgerald", "9780743273565", "The Great Gatsby", "1925");
		Book book5 = new Book("J.R.R. Tolkien", "9780261103573", "The Hobbit", "1937");
		Book book6 = new Book("F. Scott Fitzgerald", "9780743273565", "The Great Gatsby", "1925");

		BookLibrary lib = new BookLibrary();
		lib.insertBook(book1);
		lib.insertBook(book2);
		lib.insertBook(book3);
		lib.insertBook(book4);
		lib.insertBook(book5);
		lib.insertBook(book6);

		for (Book b : lib.getAllBooksInLibrary())
			if (b != null) {
				System.out.println(b);
			}

	}
}
