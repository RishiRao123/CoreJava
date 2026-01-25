package model_type_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Apartment {
	private Map<String, Double> apartmentDetailsMap = new HashMap<>();

	public Map<String, Double> getApartmentDetailsMap() {
		return apartmentDetailsMap;
	}

	public void setApartmentDetailsMap(Map<String, Double> apartmentDetailsMap) {
		this.apartmentDetailsMap = apartmentDetailsMap;
	}

	public void addApartmentDetails(String apartmentNumber, double rent) {
		apartmentDetailsMap.put(apartmentNumber, rent);
	}

	public double findTotalRentOfApartmentslnTheGivenRange(double minimumRent, double maximumRent) {
		double totalRent = 0.0;

		for (Map.Entry<String, Double> entry : apartmentDetailsMap.entrySet()) {
			double currRent = entry.getValue();

			if (currRent >= minimumRent && currRent <= maximumRent) {
				totalRent += currRent;
			}
		}
		return totalRent;
	}

}

public class Practise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Apartment apartment = new Apartment();

		System.out.println("Enter number of details to be added");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the details (Apartment number: Rent)");
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] parts = input.split(":");

			String apartmentNumber = parts[0];
			double rent = Double.parseDouble(parts[1]);

			apartment.addApartmentDetails(apartmentNumber, rent);
		}

		System.out.println("Enter the range to filter the details");
		double minRent = sc.nextDouble();
		double maxRent = sc.nextDouble();

		double ans = apartment.findTotalRentOfApartmentslnTheGivenRange(minRent, maxRent);

		if (ans > 0.0) {
			System.out.println("Total Rent in the range " + minRent + " to " + maxRent + " USD:" + ans);
		} else {
			System.out.println("No apartments found in this range");
		}
		
		sc.close();
		
	}

}
