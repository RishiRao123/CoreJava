package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ArrayList implements list interface. It is dynamic in size. new size will be calculated as
// newSize = (cc * 3/2) + 1

// constructors :
// 1.ArrayList<T> al = new ArrayList<>();
// 2.ArrayList<T> al = new ArrayList<>(int intialCapacity);
// 3.ArrayList<T> al = new ArrayList<>(Colleaction c) for any collection to equivalent arraylist

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

		System.out.println("Array list initial: " + al); // l.toString() method
		al.remove(2);
		al.remove(5);
		System.out.println("Array list final: " + al);
		System.out.println("Size: " + al.size());

		// By default array list is non-synchronized. but we can get synchronized
		// version by using Collections.synchronizeList();
		
		ArrayList<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = Collections.synchronizedList(l1); // synchronized l2. 
		// similarly we can do for set and map.
		System.out.println("list : " + l2);
		
		// remove(Object obj), remove(idx), removeAll(), retainAll(), clear()

	}

}
