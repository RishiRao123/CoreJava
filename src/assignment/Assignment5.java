package assignment;

// A task on Inheritance

// 1.
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int rollNo;
	double marks;

	Student(String name, int age, int rollNo, double marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public void displayDetails() {
		System.out.println("Name: " + name + " | Age: " + age + " | RollNo: " + rollNo + " | Marks: " + marks);
	}
}

// 2. 
class Vehicle {
	int speed;
	String fuelType;

	Vehicle(int speed, String fuelType) {
		this.speed = speed;
		this.fuelType = fuelType;
	}
}

class Car1 extends Vehicle {
	String brand;

	Car1(int speed, String fuelType, String brand) {
		super(speed, fuelType);
		this.brand = brand;
	}

	void displayCar() {
		System.out.println("Speed: " + speed + " | " + "Fuel Type: " + fuelType + " | " + "Brand: " + brand);
	}
}

// 3.
class Animal {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Mammal extends Animal {
	@Override
	void eat() {
		System.out.println("Mammal Eats");
	}
}

class Dog extends Mammal {
	@Override
	void eat() {
		System.out.println("Dog eats");
	}

	void bark() {
		System.out.println("Dog barks");
	}
}

// 5.
class Shape {
	void draw() {
		System.out.println("Draw from shape");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Draw from Circle");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Draw from rectangle");
	}
}

public class Assignment5 {

	public static void main(String[] args) {

//		Student s1 = new Student("Rishi rao", 35, 12203, 91);
//		s1.displayDetails();

//		Car1 cr1 = new Car1(180, "Diesel", "Mercedes");
//		cr1.displayCar();

//		Dog d1= new Dog();
//		d1.eat();
//		d1.bark();

//		Circle cl1 = new Circle();
//		cl1.draw();
//		Rectangle r1 = new Rectangle();
//		r1.draw();

	}

}
