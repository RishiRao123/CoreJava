package collections;

import java.util.Iterator;
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

		Iterator<Product> itr = st2.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			System.out.println("Product: " + p.name + " Price: " + p.price);
		}

	}

}
