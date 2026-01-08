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

// 4.
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

// 5.
class Bank {
	void getInterestRate() {
		System.out.println("Bank class , Interest rate");
	}
}

class SBI extends Bank {
	@Override
	void getInterestRate() {
		System.out.println("SBI class, Interest Rate");
	}
}

class HDFC extends Bank {
	@Override
	void getInterestRate() {
		System.out.println("HDFC class, Interest Rate");
	}
}

// 6.
class Employee {
	String name;
	double salary;
	
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

class Manager extends Employee {
	String department;
	
	Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name + " Salary: " + salary + " Department: " + department);
	}
}

// 7.
class Account {
	String accountNo;
	
	Account(String accountNo) {
		this.accountNo = accountNo;
	}
}

class SavingsAccount extends Account {
	double interestRate;
	
	SavingsAccount(String accountNo, double interestRate) {
		super(accountNo);
		this.interestRate = interestRate;
	}
	
	void displayDetails() {
		System.out.println("Account No: " + accountNo + " Interest Rate: " + interestRate);
	}
}

// 8.
class Animal1 {
	protected boolean isCarnivore;
	
	Animal1(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}
}

class Dog1 extends Animal1 {
	Dog1(boolean isCarnivore) {
		super(isCarnivore);
	}
	
	void getType() {
		System.out.println("Animal is Carnivore: " + isCarnivore);
	}
}

// 9.
class Calculator {
	void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is: " + sum);
	}
}

class AdvanceCalculator extends Calculator {
	public void multiply(int a, int b) {
		int ans = a * b;
		System.out.println("Multiplication ans is: " + ans);
	}
}

class Person1 {
	String name;
	int age;
	
	Person1(String name, int age) {
		this.name = name;
		this.age =age;
	}
}

class Teacher extends Person1 {
	String subject;
	double salary;
	
	Teacher(String name, int age, String subject, double salary) {
		super(name, age);
		this.subject = subject;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("Name: " + name + " Age: " + age + " Subject: "  + subject + " Salary: " + salary);
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
		
//		SBI sbi = new SBI();
//		HDFC hdfc = new HDFC();
//		sbi.getInterestRate();
//		hdfc.getInterestRate();
		
//		Manager m1 = new Manager("Rishi rao", 75000.00, "Development");
//		m1.displayDetails();
		
//		SavingsAccount sa = new SavingsAccount("IDBI64146", 0.075);
//		sa.displayDetails();
		
//		Dog1 dg1 = new Dog1(true);
//		dg1.getType();
		
//		AdvanceCalculator ac = new AdvanceCalculator();
//		ac.add(525, 250);
//		ac.multiply(56, 2);
		
		Teacher t1 = new Teacher("Rishi rao", 25, "Java", 78560.52);
		t1.displayDetails();
		
	}

}
