package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Comparable is an interface implemented by the class itself to define its natural ordering.
// Method to implement: compareTo(T o).

class Employee implements Comparable<Employee> {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Employee e) {
		return this.id - e.id;
	}

}

class Product implements Comparable<Product> {
	int price;
	String name;

	Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public int compareTo(Product p) {
		return this.price - p.price;
	}
}

class Book implements Comparable<Book> {
	int id;
	String title;
	double price;

	Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}

	@Override
	public int compareTo(Book b) {
		return (int) (this.price - b.price);
	}
}

public class ComparableDemo {

	public static void main(String[] args) {

		Set<Employee> st1 = new TreeSet<>();
		st1.add(new Employee(101, "Rishi rao"));
		st1.add(new Employee(102, "Karan rao"));
		st1.add(new Employee(103, "Rahul rao"));
		st1.add(new Employee(101, "raj"));
		st1.add(new Employee(105, "rajan rao"));

		// System.out.println("TreeSet: " + );
		// System.out.println("Size: " + st1.size());

		Set<Product> st2 = new TreeSet<>();
		st2.add(new Product(1000, "Phone"));
		st2.add(new Product(500, "Mouse"));
		st2.add(new Product(1000, "Keyboard"));
		st2.add(new Product(2000, "Laptop"));

		System.out.println("Size: " + st2.size());

		Iterator<Product> itr1 = st2.iterator();
		while (itr1.hasNext()) {
			Product p = itr1.next();
			System.out.println("Product: " + p.name + " Price: " + p.price);
		}

		List<Book> book = new ArrayList<>();
		book.add(new Book(1, "GOT", 222));
		book.add(new Book(2, "Money", 200));

		Collections.sort(book);
//		When you call:
//		Collections.sort(list);
//		Java internally does something like:
//		compare(s1, s2)
//		compare(s2, s3)
//		compare(s1, s3)

		Iterator<Book> itr2 = book.iterator();
		while (itr2.hasNext()) {
			Book b = itr2.next();
			System.out.println("ID:" + b.id + " Title: " + b.title + " Price: " + b.price);
		}
		

	}

}
