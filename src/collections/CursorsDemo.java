package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {

		// Cursors are used when you want to get data from a collection one by one.
		// three types : Enumeration, Iterator and ListIterator

		// 1. Enumeration : (Legacy 1.0v)
		// Enumeration e = v.elements(); v is vector object.
		// it has two methods only 1. public boolean hasMoreElements() 2.public Object
		// nextElement();

		// code for enumeration

		Vector<Integer> v1 = new Vector<>();

		for (int i = 0; i <= 10; i++) {
			v1.addElement(i);
		}

//		System.out.println("Vector: " + v1);

		Enumeration<Integer> e = v1.elements();
	
		while (e.hasMoreElements()) {
			Integer i = e.nextElement();
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();
		
		// Limitations: applicable only for legacy classes. Can only perform read operations.
		// Iterator provides a solution for these.
		
		// 2. Iterator:
		// methods : 
		// public boolean hasNext(), public Object next(), public void remove();
		// Iterator i = C.iterator(); C->collections
		
		ArrayList<Integer> al1 = new ArrayList<>();
		for(int i=0; i<=10; i++) {
			al1.add(i);
		}
		System.out.println("List: " + al1);
		Iterator<Integer> itr = al1.iterator();
		// removing all odd elements from al1
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if(i % 2 != 0)
				itr.remove();
		}
		System.out.println("List Even: " + al1);
		
		// Limitations: only one direction in forward or backward, replace, addition is not available
		// List iterator overcomes them.
		
		// 3. ListIterator
		// ListIterator ltr = l.ListIteartor(); l->Any list object
		// methods: public boolean hasNext(), public Object next(), public int nextIndex(),
		// public boolean hasPrevious(), public Object previous(), public int previousIndex();
		// public void set(Object obj), public void remove(), public void add(Object obj)
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Jhon Snow");
		l1.add("Rob Stark");
		l1.add("Sansa Stark");
		l1.add("Brandon Stark");
		l1.add("Arya Stark");
		l1.add("Rickon Stark");
		System.out.println("List: " + l1);
		ListIterator<String> ltr = l1.listIterator();
		while(ltr.hasNext()) {
			String str = ltr.next();
			if(str.equals("Rickon Stark")) {
				ltr.remove();
			} else if(str.equals("Rob Stark")) {
				ltr.add("Nedd stark");
			} else if(str.equals("Brandon Stark")) {
				ltr.set("Crow God");
			}
		}
		System.out.println("List after: " + l1);
		
		
	}

}
