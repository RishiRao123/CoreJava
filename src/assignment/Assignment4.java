package assignment;

// Assignment on Has-A questions.txt

class Engine {
	String engineType;
	int horsePower;
	
	Engine(String engineType, int horsePower) {
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	
	void displayDetails() {
		System.out.println("engine type: " + engineType + "horse power: " + horsePower);
	}
}

class Car {
	
	Engine e = new Engine("Diesel", 180);
	
	Car() {
		System.out.println("Runn");
		e.displayDetails();
	}
}

class Book {
	int bookID;
	String title;
	String author;
	
	Book(int bookID, String title, String author) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
	}
	
	public void displayBooks() {
		System.out.println("BookID: " + bookID + " Title: " + title + " Author: " + author);
	}
	
}

class LibrarySystem {
	Book b1 = new Book(101, "Love Girls Only", "Rishi rao");
	LibrarySystem() {
		b1.displayBooks();
	}
}


public class Assignment4 {

	public static void main(String[] args) {
		
//		Car c = new Car();
		
		//LibrarySystem ls = new LibrarySystem();
		
	}

}
