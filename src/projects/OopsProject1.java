package projects;

// A project Vehicle System

interface Serviceable {
	void service();
}

abstract class Vehicle {
	private int id;
	private String brand;
	private double baseCost;

	Vehicle(int id, String brand, double baseCost) {
		this.id = id;
		this.brand = brand;
		this.baseCost = baseCost;
	}

	public double getBaseCost() {
		return baseCost;
	}

	abstract double calculateMaintenanceCost();

	void displayDetails() {
		System.out.println("ID: " + id + ", Brand: " + brand + ", Maintenance Cost: " + calculateMaintenanceCost());
	}
}

class Car extends Vehicle implements Serviceable {
	int numberOfServices;

	Car(int id, String brand, double baseCost, int numberOfServices) {
		super(id, brand, baseCost);
		this.numberOfServices = numberOfServices;
	}

	public void service() {
		System.out.println("yes car");
	}

	public double calculateMaintenanceCost() {
		double baseCost = getBaseCost();
		return baseCost + (numberOfServices * 500);
	}
}

class Bike extends Vehicle implements Serviceable {
	boolean premiumService;

	Bike(int id, String brand, double baseCost, boolean premiumService) {
		super(id, brand, baseCost);
		this.premiumService = premiumService;
	}

	@Override
	public void service() {
		System.out.println("Bike yes");
	}

	public double calculateMaintenanceCost() {
		double baseCost = getBaseCost();
		return baseCost + (premiumService ? 1000 : 300);
	}
}

class Truck extends Vehicle implements Serviceable {
	double loadCapacity;
	
	Truck(int id, String brand, double baseCost, double loadCapacity) {
		super(id, brand, baseCost);
		this.loadCapacity = loadCapacity;
	}
	
	public void service() {
		System.out.println("yes truck");
	}
	
	public double calculateMaintenanceCost() {
		double baseCost = getBaseCost();
		return baseCost + (loadCapacity*200);
	}
}

class VehicleService {
	void processVehicle(Vehicle vehicle) {
		vehicle.displayDetails();
	}
}


public class OopsProject1 {

	public static void main(String[] args) {
		
		Vehicle v1 = new Car(101, "mustang", 25000, 3);
		Vehicle v2 = new Bike(102, "Goldenwing", 1500, true);
		Vehicle v3 = new Truck(103, "BharatBenz", 30000, 2500);
		
		VehicleService service = new VehicleService();
		
		service.processVehicle(v1);
		service.processVehicle(v2);
		service.processVehicle(v3);

	}

}
