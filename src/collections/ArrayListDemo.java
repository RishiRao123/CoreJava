package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		al.add(25);
		al.add(30);
		al.add(5);
		al.add(-10);
		al.add(20);
		al.add(286);
		al.add(35);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(28);
		al.add(296);
		
		System.out.println("Array list initial: "  +al);
		al.remove(2);
		al.remove(5);
		System.out.println("Array list final: "  +al);
		System.out.println("Size: " + al.size());

	}

}
