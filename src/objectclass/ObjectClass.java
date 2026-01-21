package objectclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// A task on all the object methods

// 1. Demonstrating equals() and hashCode()
class StudentTask {
	int id;
	String name;
	String email;

	StudentTask(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj instanceof StudentTask) {
			StudentTask s = (StudentTask) obj;
			return (this.id == s.id);
		}
		return false;
	}

}

// 2. Demonstrating toString()
class ProductTask {
	int id;
	String name;
	double price;

	ProductTask(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Name: " + name + "Price: " + price;
	}

}

// 3. HashMap Key Behaviour
class StudentTask1 {
	int id;
	String name;

	public StudentTask1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj instanceof StudentTask1) {
			StudentTask1 s = (StudentTask1) obj;
			return this.id == s.id;
		}
		return false;
	}

}

public class ObjectClass {

	public static void main(String[] args) {

		StudentTask s1 = new StudentTask(1, "Rishi Rao", "rishi@gmail.com");
		StudentTask s2 = new StudentTask(2, "Karan Rao", "karan@gmail.com");
		StudentTask s3 = new StudentTask(3, "Rahul Rao", "rahul@gmail.com");
		StudentTask s4 = new StudentTask(1, "Ramesh Rao", "ramesh@gmail.com");
		StudentTask s5 = new StudentTask(5, "Rajan Rao", "rajan@gmail.com");

		HashSet<StudentTask> student = new HashSet<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);

		Iterator<StudentTask> itr = student.iterator();
		while (itr.hasNext()) {
			StudentTask s = itr.next();
			System.out.println(s.id + " " + s.name);
		}

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));

		ProductTask pt1 = new ProductTask(10, "Rishi Rao", 100.00);
		System.out.println(pt1.toString());
		System.out.println(pt1.toString());

		StudentTask s6 = new StudentTask(1, "A", null);
		StudentTask s7 = new StudentTask(1, "A", null);

		System.out.println(s6 == s7);
		System.out.println(s6.equals(s7));
		
		
		StudentTask1 st1 = new StudentTask1(1, "Rishi rao");
		HashMap<StudentTask1, String> map = new HashMap<>();
		map.put(st1, "First");
		st1.id = 3;
		System.out.println(map.get(st1));

	}

}
