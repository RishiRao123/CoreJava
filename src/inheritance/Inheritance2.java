package inheritance;

// Demonstarting the use of super keyword

class Vehicle {
	protected String brand;
	
	Vehicle(String brand) {
		this.brand = brand;
	}
}

class Car extends Vehicle {
	protected int speed;
	
	Car(String brand, int speed) {
		super(brand);
		this.speed = speed;
	}
	
	public void display() {
		System.out.println(super.brand + " " + speed);
	}
}



public class Inheritance2 {
	
	public static void main(String[] args) {
		Car c1 = new Car("Volvo", 150);
		c1.display();
		System.out.println(c1.brand + " " + c1.speed);
		
	}

}
