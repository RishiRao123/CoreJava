package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Comparator is a separate interface used to define multiple different ways to compare objects.
// Method to implement: compare(T o1, T o2)'

public class ComparatorDemo {

	public static void main(String[] args) {

		Comparator<Employee> nameComparator1 = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		};

		Set<Employee> set1 = new TreeSet<>(nameComparator1);

		set1.add(new Employee(201, "Rishi"));
		set1.add(new Employee(202, "Rishi")); // duplicate by name
		set1.add(new Employee(203, "Amit"));

		System.out.println("Size: " + set1.size());
		
		Comparator<Product> nameComparator2 = new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return p1.name.compareTo(p2.name);
			}
		};
		
		Set<Product> set2 = new TreeSet<>(nameComparator2);
		set2.add(new Product(1000, "Phone"));
		set2.add(new Product(1000, "Phone"));
		set2.add(new Product(500, "Mouse"));
		set2.add(new Product(500, "Keyboard"));
		set2.add(new Product(500, "Mouse"));
		
		System.out.println("Size: " + set2.size());
		
		
	}
}
