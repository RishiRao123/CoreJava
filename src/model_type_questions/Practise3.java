package model_type_questions;

import java.util.Scanner;
import java.time.Year;

interface Room {
	double calculateTotalBill(int nightsStayed, int joiningYear);

	default int calculateMembershipYears(int joiningYear) {
		int currentYear = Year.now().getValue();
		return currentYear - joiningYear;
	}
}

class HotelRoom implements Room {
	private String roomType;
	private double ratePerNight;
	private String guestName;

	HotelRoom(String roomType, double ratePerNight, String guestName) {
		this.roomType = roomType;
		this.ratePerNight = ratePerNight;
		this.guestName = guestName;
	}

	public String getRoomType() {
		return roomType;
	}

	public double getRatePerNight() {
		return ratePerNight;
	}

	public String getGuestName() {
		return guestName;
	}

	@Override
	public double calculateTotalBill(int nightsStayed, int joiningYear) {
		double totalBill = nightsStayed * ratePerNight;
		int membershipYears = calculateMembershipYears(joiningYear);

		if (membershipYears > 3) {
			totalBill -= totalBill * 0.10;
		}

		return Math.round(totalBill);
	}
}

public class Practise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Deluxe Room
		System.out.println("Enter Deluxe Room Details:");
		System.out.print("Guest Name: ");
		String name1 = sc.nextLine();

		System.out.print("Rate Per Night: ");
		double rate1 = sc.nextDouble();

		System.out.print("Nights Stayed: ");
		int nights1 = sc.nextInt();

		System.out.print("Joining Year: ");
		int year1 = sc.nextInt();
		sc.nextLine(); // clear buffer

		// Suite Room
		System.out.println("\nEnter Suite Room Details:");
		System.out.print("Guest Name: ");
		String name2 = sc.nextLine();

		System.out.print("Rate Per Night: ");
		double rate2 = sc.nextDouble();

		System.out.print("Nights Stayed: ");
		int nights2 = sc.nextInt();

		System.out.print("Joining Year: ");
		int year2 = sc.nextInt();

		HotelRoom deluxeRoom = new HotelRoom("Deluxe Room", rate1, name1);
		HotelRoom suiteRoom = new HotelRoom("Suite Room", rate2, name2);

		System.out.println("\nRoom Summary:");
		System.out.println(
				deluxeRoom.getRoomType() + ": " + deluxeRoom.getGuestName() + ", " + deluxeRoom.getRatePerNight()
						+ " per night, Membership:" + deluxeRoom.calculateMembershipYears(year1) + " years");
		System.out
				.println(suiteRoom.getRoomType() + ": " + suiteRoom.getGuestName() + ", " + suiteRoom.getRatePerNight()
						+ " per night, Membership:" + suiteRoom.calculateMembershipYears(year2) + " years");

		String[] parts1 = deluxeRoom.getRoomType().split(" ");
		String[] parts2 = suiteRoom.getRoomType().split(" ");
		System.out.println("\nTotal Bill:");
		System.out.println("For " + deluxeRoom.getGuestName() + "(" + parts1[0] + "):"
				+ deluxeRoom.calculateTotalBill(nights1, year1));
		System.out.println("For " + suiteRoom.getGuestName() + "(" + parts2[0] + "):"
				+ suiteRoom.calculateTotalBill(nights2, year2));

		sc.close();
	}
}
