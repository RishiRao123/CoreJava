package assignment;

// Assignment on Has-A questions.txt

// 1.
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

// 2.
//class Book {
//	int bookID;
//	String title;
//	String author;
//
//	Book(int bookID, String title, String author) {
//		this.bookID = bookID;
//		this.title = title;
//		this.author = author;
//	}
//
//	public void displayBooks() {
//		System.out.println("BookID: " + bookID + " Title: " + title + " Author: " + author);
//	}
//
//}
//
//class LibrarySystem {
//	Book b1 = new Book(101, "Love Girls Only", "Rishi rao");
//
//	LibrarySystem() {
//		b1.displayBooks();
//	}
//}

// 3.
class Address {
	String city;
	String state;
	int pincode;

	Address(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public void displayDetails() {
		System.out.println("City: " + city + " State: " + state + " Pincode: " + pincode);
	}
}

class Student1 {
	Address a = new Address("Hyderabad", "Telangana", 14411);

	Student1() {
		a.displayDetails();
	}
}

class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

class Library {
	String libraryName;

	Library(String libraryName) {
		this.libraryName = libraryName;
	}

	void displayDetails(Book b) {
		System.out.println(b.title + ", written by author " + b.author + " is in library: " + libraryName);
	}
}

class Battery {
	int capacity;
	
	Battery(int capacity) {
		this.capacity = capacity;
	}
}

class Mobile {
	String brand;
	Battery b;
	
	Mobile(String brand) {
		this.brand = brand;
		b = new Battery(5000);
	}
	
	void displayDetails() {
		System.out.println(brand + "has battery of capacity " + b.capacity);
	}
}

public class Assignment4 {

	public static void main(String[] args) {

//		Car c = new Car();

//		LibrarySystem ls = new LibrarySystem();
		
		Library l = new Library("Rao amigo's");
		l.displayDetails(new Book("Love Girls Only", "Rishi  rao"));
		
		Mobile m = new Mobile("Samsung");
		m.displayDetails();
//		Student1 s1 = new Student1();

	}

}
