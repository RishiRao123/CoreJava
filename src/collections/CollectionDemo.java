package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

//		ArrayList<Integer> al = new ArrayList<>();
//		
//		al.add(25);
//		al.add(30);
//		al.add(5);
//		al.add(-10);
//		al.add(20);
//		
//		System.out.println(al);
//		System.out.println("Size of list: " + al.size());

		Collection<Integer> al2 = new ArrayList<>();
		Collection<Integer> al3 = new ArrayList<>();

		al2.add(25);
		al2.add(30);
		al2.add(5);
		al2.add(-10);
		al2.add(20);

		al3.add(25);
		al3.add(35);
		al3.add(15);
		al3.add(10);
		al3.add(20);

		System.out.println("List befor operations: " + al2);
		al2.addAll(al3);
		System.out.println("List after adding all: " + al2);
		al2.removeAll(al3);
		System.out.println("List after removing all: " + al2);
		al2.retainAll(al3);
		System.out.println("List after retaining all: " + al2);
		

	}

}
