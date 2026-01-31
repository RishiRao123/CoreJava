package Practise;

import java.util.Scanner;

abstract class CargoTransport {

	private String shipmentId;
	private String shipmentDate;
	private int serviceRating;

	public CargoTransport(String shipmentId, String shipmentDate, int serviceRating) {
		this.shipmentId = shipmentId;
		this.shipmentDate = shipmentDate;
		this.serviceRating = serviceRating;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public int getServiceRating() {
		return serviceRating;
	}

	public abstract String vehicleSelection();

	public abstract double calculateTotalCharge();

}

class SteelCargo extends CargoTransport {

	private double steelWeight;
	private double pricePerTon;

	public SteelCargo(String shipmentId, String shipmentDate, int serviceRating, double steelWeight,
			double pricePerTon) {
		super(shipmentId, shipmentDate, serviceRating);
		this.steelWeight = steelWeight;
		this.pricePerTon = pricePerTon;
	}

	public double getSteelWeight() {
		return steelWeight;
	}

	public double pricePerTon() {
		return pricePerTon;
	}

	public String vehicleSelection() {
		if (steelWeight < 5)
			return "MiniTruck";
		if (steelWeight <= 10)
			return "Truck";

		return "HeavyTruck";
	}

	private int getVehiclePrice() {
		String v = vehicleSelection();

		if (v.equals("MiniTruck"))
			return 1200;
		if (v.equals("Truck"))
			return 2500;

		return 4500;
	}

	private double getDiscountRate() {
		int rating = getServiceRating();

		if (rating == 5)
			return 0.25;

		if (rating >= 3 && rating <= 4)
			return 0.1;

		return 0.0;
	}

	public double calculateTotalCharge() {
		double basePrice = steelWeight * pricePerTon;
		double tax = basePrice * 0.28;
		double discount = basePrice * getDiscountRate();
		double totalCharge = (basePrice + getVehiclePrice() + tax) - discount;

		return totalCharge;
	}

}

class FurnitureCargo extends CargoTransport {

	private double volume;
	private String furnitureType;
	private double pricePerCubicMeter;

	public FurnitureCargo(String shipmentId, String shipmentDate, int serviceRating, double volume,
			String furnitureType, double pricePerCubicMeter) {
		super(shipmentId, shipmentDate, serviceRating);
		this.volume = volume;
		this.furnitureType = furnitureType;
		this.pricePerCubicMeter = pricePerCubicMeter;
	}

	public double getVolume() {
		return volume;
	}

	public String getFurnitureType() {
		return furnitureType;
	}

	public double getPricePerCubicMeter() {
		return pricePerCubicMeter;
	}

	public String vehicleSelection() {

		if (volume < 100)
			return "MiniTruck";

		if (volume <= 300)
			return "Truck";

		return "HeavyTruck";
	}

	private double getTypeRate() {
		if (furnitureType.equals("Luxury"))
			return 0.30;

		return 0.15;
	}

	private double getDiscountRate() {
		double discountPercentage = 0;

		if (getServiceRating() == 5)
			discountPercentage = 0.25;
		else if (getServiceRating() >= 3)
			discountPercentage = 0.10;
		else
			discountPercentage = 0.0;

		return discountPercentage;
	}

	private int getVehiclePrice() {
		String v = vehicleSelection();

		if (v.equals("MiniTruck"))
			return 1200;
		if (v.equals("Truck"))
			return 2500;

		return 4500;
	}

	public double calculateTotalCharge() {
		double price = volume * pricePerCubicMeter * getTypeRate();
		double tax = price * 0.25;
		double discount = price * getDiscountRate();
		double totalCharge = (price + getVehiclePrice() + tax) - discount;

		return totalCharge;
	}

}

class Utility {

	public CargoTransport parseInput(String input) {

		String[] data = input.split(":");

		String shipmentId = data[0];
		String shipmentDate = data[1];
		int serviceRating = Integer.parseInt(data[2]);
		String cargoType = data[3];

		if (cargoType.equalsIgnoreCase("SteelCargo")) {

			double steelWeight = Double.parseDouble(data[4]);
			double pricePerTon = Double.parseDouble(data[5]);

			return new SteelCargo(shipmentId, shipmentDate, serviceRating, steelWeight, pricePerTon);
		}

		else if (cargoType.equalsIgnoreCase("FurnitureCargo")) {

			double volume = Double.parseDouble(data[4]);
			String furnitureType = data[5];
			double pricePerCubicMeter = Double.parseDouble(data[6]);

			return new FurnitureCargo(shipmentId, shipmentDate, serviceRating, volume, furnitureType,
					pricePerCubicMeter);
		}

		return null;
	}

	public boolean validateShipmentId(String shipmentId) {

		if (shipmentId.length() != 7)
			return false;

		if (!shipmentId.startsWith("SCG"))
			return false;

		for (int i = 3; i <= 5; i++) {
			if (!Character.isDigit(shipmentId.charAt(i)))
				return false;
		}

		if (!Character.isUpperCase(shipmentId.charAt(6)))
			return false;

		return true;
	}
}

public class Practise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = sc.nextLine();

		Utility utility = new Utility();

		String shipmentId = input.split(":")[0];

		if (!utility.validateShipmentId(shipmentId)) {
			System.out.println("Shipment id " + shipmentId + " is invalid");
			System.out.println("Please provide a valid record");
		} else {

			CargoTransport cg = utility.parseInput(input);

			String vehicle = cg.vehicleSelection();
			double totalCharge = cg.calculateTotalCharge();

			if (cg instanceof SteelCargo) {
				SteelCargo scg = (SteelCargo) cg;

				System.out.println("Shipment id : " + scg.getShipmentId() + " | Date of shipment : "
						+ scg.getShipmentDate() + " | Rating : " + scg.getServiceRating() + " | Steel weight : "
						+ scg.getSteelWeight() + " | Vehicle : " + vehicle + " | Total charge : " + totalCharge);
			} else if (cg instanceof FurnitureCargo) {
				FurnitureCargo fcg = (FurnitureCargo) cg;

				System.out.println("Shipment id : " + fcg.getShipmentId() + " | Date of shipment : "
						+ fcg.getShipmentDate() + " | Rating : " + fcg.getServiceRating() + " | Type of furniture : "
						+ fcg.getFurnitureType() + " | Vehicle : " + vehicle + " | Total charge : " + totalCharge);
			}
		}

		sc.close();
	}
}
