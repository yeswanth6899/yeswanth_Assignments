package default_package;

class Book{
	
	String title;
	String author;
	String ISBN;
	String genre;
	boolean isIssued;
	
	Book(String title, String author, String ISBN, String genre){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.genre = genre;
		this.isIssued = false;
	}
	
	void displayInfo() {
		System.out.println("Title of the book: " + title);
		System.out.println("Author of the book: " + author);
		System.out.println("ISBN of the book: " + ISBN);
		System.out.println("Genre of the book: " + genre);
		System.out.println("Is the book Issued!: " + isIssued);
		System.out.println("---------------------------------");
	}
	
	void markIssued() {
		this.isIssued = true;
	}
	
	void markReturned() {
		this.isIssued = false;
	}
}

class Library{
	String name;
	int bookCount;
	
	Book[] books = new Book[20];
	
	Library(String name) {
		this.name = name;
	}
	
	void addBook(Book b) {
		if(bookCount < 20) {
			books[bookCount++] = b;
		}
	}
	
	Book findByTitle(String title) {
		for(int i=0; i<bookCount; i++) {
			if(books[i].title.toLowerCase().equals(title.toLowerCase())) {
				return books[i];
			}
		}
		System.out.println("Not Found");
		return null;	
	}
	
	void findByAuthor(String author) {
		for(int i=0; i<bookCount; i++) {
			if(books[i].author.toLowerCase().equals(author.toLowerCase())) {
				books[i].displayInfo();
			}		
		}
	}
	
	void issueBook(String title) {
		Book b = findByTitle(title);
		if(b!= null && !b.isIssued) {
			b.markIssued();
		}
	}
	
	void returnBook(String title) {
		Book b = findByTitle(title);
		if(b != null && b.isIssued) {
			b.markReturned();
		}
	}
	
	void displayAllBooks() {
		for(int i=0; i< bookCount; i++) {
			books[i].displayInfo();
		}
	}
	
	int countAvailable() {
		int count = 0;
		for(int i=0; i<bookCount; i++) {
			if(!books[i].isIssued) {
				count++;
			}
		}
		return count;
	}
}

public class LibrarySystem {

	public static void main(String[] args) {
		
		Library lib = new Library("College Library");
		
		lib.addBook(new Book("Java Basics", "John", "111", "Tech"));
		lib.addBook(new Book("Python Guide", "Alice", "222", "Tech"));
		lib.addBook(new Book("Data Science", "Bob", "333", "Tech"));
		lib.addBook(new Book("History Book", "John", "444", "History"));
		lib.addBook(new Book("Math Book", "Tom", "555", "Education"));
		lib.addBook(new Book("Physics Book", "Sam", "666", "Science"));

		lib.issueBook("Java Basics");
		lib.issueBook("Python Guide");

		lib.returnBook("Java Basics");

		Book result = lib.findByTitle("Data Science");
		if(result != null) {
			result.displayInfo();
		}

		lib.displayAllBooks();

		System.out.println("Available Books: " + lib.countAvailable());
	}
}