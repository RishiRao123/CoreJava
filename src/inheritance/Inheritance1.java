package inheritance;

class Employee {
	public int id;
	public double salary;
	
	Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("ID: " + id + " Salary: " + salary);
	}
}

class Manager extends Employee {
	
	double bonus;
	
	Manager(int id, double salary, double bonus) {
		super(id, salary);
		this.bonus = bonus;
		
	}
	
	public void calculateTotalSalary() {
		System.out.println(salary += bonus);
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(61416, 25000);
		e1.display();
		Manager m1 = new Manager(61416, 25000, 5000);
		m1.display();
		m1.calculateTotalSalary();
	}

}
