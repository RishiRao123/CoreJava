package model_type_questions;

import java.util.Scanner;

class InvalidGadgetException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidGadgetException(String message) {
		super(message);
	}
}

class GadgetValidatorUtil {

	public boolean validateGadgetID(String gadgetID) throws InvalidGadgetException {

		if (gadgetID == null || !gadgetID.matches("[A-Z]\\d{3}")) {
			throw new InvalidGadgetException("Invalid gadget ID\n");
		}

		return true;
	}

	public boolean validateWarrantyPeriod(int period) throws InvalidGadgetException {

		if (period < 6 || period > 36) {
			throw new InvalidGadgetException("Invalid warranty period\n");
		}

		return true;

	}

}

public class Practise6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GadgetValidatorUtil utility = new GadgetValidatorUtil();

		System.out.println("Enter the number of gadget entries");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter gadget " + i + " details");
			String input = sc.nextLine();

			String[] parts = input.split(":");
			
			try {
				utility.validateGadgetID(parts[0]);
				utility.validateWarrantyPeriod(Integer.parseInt(parts[2]));
				System.out.println("Warranty accepted, stock updated\n");
			} catch(InvalidGadgetException e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();

	}

}
