package objectclass;

import java.util.ArrayList;
import java.util.List;

// Object is a parent class in hierarchy, for all objects. Every object directly or indirectly extends it.
// some methods are getClass(), hashCode(), 

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

public class ObjectClassDemo {

	public static void main(String[] args) {

		List<Phone> phones = new ArrayList<>();

		phones.add(new Phone(4, 64));
		phones.add(new Phone(6, 128));
		phones.add(new Phone(8, 256));
		phones.add(new Phone(12, 256));
		phones.add(new Phone(16, 512));

		for(Phone p : phones) {
			System.out.println(p.toString());
		}

	}

}
