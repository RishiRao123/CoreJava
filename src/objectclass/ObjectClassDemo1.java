package objectclass;

import java.util.ArrayList;
import java.util.List;

// Object is a parent class in hierarchy, for all objects. Every object directly or indirectly extends it.
// some methods are toString(), hashCode(), equals(), getClass(), finalize(), clone(), hashCode(), 

class Phone {
	int ram;
	int rom;

	Phone(int ram, int rom) {
		this.ram = ram;
		this.rom = rom;
	}

	@Override
	public String toString() {
		return "Phone -->[Ram: " + ram + " Rom: " + rom + "]";
	}
}

// 1.
class Student {
	int id;
	String name;
	double marks;

	Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + " name=" + name + " marks=" + marks + "]";
	}
}

public class ObjectClassDemo1 {

	public static void main(String[] args) {

//		List<Phone> phones = new ArrayList<>();
//
//		phones.add(new Phone(4, 64));
//		phones.add(new Phone(6, 128));
//		phones.add(new Phone(8, 256));
//		phones.add(new Phone(12, 256));
//		phones.add(new Phone(16, 512));
//
//		for (Phone p : phones) {
//			System.out.println(p.toString());
//		}
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(101, "Rishi rao", 93));
		students.add(new Student(102, "Karan rao", 95));
		students.add(new Student(103, "Arjun rao", 85));
		
		for(Student s : students) {
			System.out.println(s);
		}

	}

}
