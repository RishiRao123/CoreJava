package assignment;

// A task on Polymorphism

// 1. Employee Salary System
class EmployeePoly {
	void calculateSalary() {
		System.out.println("Employee salary");
	}
}

class DeveloperPoly extends EmployeePoly {
	@Override
	void calculateSalary() {
		System.out.println("Developer salary");
	}
}

class ManagerPoly extends EmployeePoly {
	@Override
	void calculateSalary() {
		System.out.println("Manager salary");
	}
}

class InternPoly extends EmployeePoly {
	@Override
	void calculateSalary() {
		System.out.println("Intern salary");
	}
}

// 2. Payment Processing Application
interface PaymentPoly {
	void pay();
}

class CreditCardPaymentPoly implements PaymentPoly {
	public void pay() {
		System.out.println("Payment type credit card");
	}
}

class DebitCardPaymentPoly implements PaymentPoly {
	public void pay() {
		System.out.println("Payment type debit card");
	}
}

class UPIPaymentPoly implements PaymentPoly {
	public void pay() {
		System.out.println("Payment type UPI");
	}
}

class PaymentServicePoly {
	void transactionType(PaymentPoly p) {
		p.pay();
	}
}

// 3. Online Notification System
class NotificationPoly {
	void send() {
		System.out.println("Sending notification");
	}
}

class EmailNotificationPoly extends NotificationPoly {
	@Override
	void send() {
		System.out.println("Sending Email Notification");
	}
}

class SMSNotificationPoly extends NotificationPoly {
	@Override
	void send() {
		System.out.println("Sending SMS Notification");
	}
}

class PushNotificationPoly extends NotificationPoly {
	@Override
	void send() {
		System.out.println("Sending Push Notification");
	}
}

// 4. Vehicle Rental System
class RentalVehicle {
	void calculateRent() {
		System.out.println("Vehicle rent");
	}
}

class RentalCar extends RentalVehicle {
	@Override
	void calculateRent() {
		System.out.println("Car rent calculated");
	}
}

class RentalBike extends RentalVehicle {
	@Override
	void calculateRent() {
		System.out.println("Bike rent calculated");
	}
}

class RentalTruck extends RentalVehicle {
	@Override
	void calculateRent() {
		System.out.println("Truck rent calculated");
	}
}

// 5. Banking Interest Calculator
abstract class BankAccountPoly {
	abstract void calculateInterest();
}

class SavingsAccountPoly extends BankAccountPoly {
	@Override
	void calculateInterest() {
		System.out.println("Savings account interest rate is 7%");
	}
}

class FixedDepositAccountPoly extends BankAccountPoly {
	@Override
	void calculateInterest() {
		System.out.println("Fixed Deposit account interest rate is 8.5%");
	}
}

class CurrentAccountPoly extends BankAccountPoly {
	@Override
	void calculateInterest() {
		System.out.println("Current account interest rate is 12%");
	}
}

class InterestRateServicePoly {
	void getInterestRate(BankAccountPoly bank) {
		bank.calculateInterest();
	}
}

// 6. Media Player Application
class MediaFilePoly {
	void play() {
		System.out.println("Playing media file");
	}
}

class AudioFilePoly extends MediaFilePoly {
	@Override
	void play() {
		System.out.println("Playing audio file");
	}
}

class VideoFilePoly extends MediaFilePoly {
	@Override
	void play() {
		System.out.println("Playing video file");
	}
}

class PodcastPoly extends MediaFilePoly {
	@Override
	void play() {
		System.out.println("Playing podcast");
	}
}

// 7. E-Commerce Discount System
class CustomerPoly {
	void calculateDiscount() {
		System.out.println("Customer discount");
	}
}

class RegularCustomerPoly extends CustomerPoly {
	@Override
	void calculateDiscount() {
		System.out.println("Regular customer discount");
	}
}

class PremiumCustomerPoly extends CustomerPoly {
	@Override
	void calculateDiscount() {
		System.out.println("Premium customer discount");
	}
}

class VIPCustomerPoly extends CustomerPoly {
	@Override
	void calculateDiscount() {
		System.out.println("VIP customer discount");
	}
}

// 8. Restaurant Billing System
class MenuItemPoly {
	void calculatePrice() {
		System.out.println("Menu item price");
	}
}

class VegItemPoly extends MenuItemPoly {
	@Override
	void calculatePrice() {
		System.out.println("Veg item price");
	}
}

class NonVegItemPoly extends MenuItemPoly {
	@Override
	void calculatePrice() {
		System.out.println("Non-Veg item price");
	}
}

// 9. Game Character Behavior
class GameCharacter {
	void attack() {
		System.out.println("Character attacks");
	}
}

class WarriorChar extends GameCharacter {
	@Override
	void attack() {
		System.out.println("Warrior attacks with sword");
	}
}

class ArcherChar extends GameCharacter {
	@Override
	void attack() {
		System.out.println("Archer attacks with bow");
	}
}

class MageChar extends GameCharacter {
	@Override
	void attack() {
		System.out.println("Mage attacks with magic");
	}
}

public class Assignment6 {

	public static void main(String[] args) {

		EmployeePoly e1 = new DeveloperPoly();
		EmployeePoly e2 = new ManagerPoly();
		EmployeePoly e3 = new InternPoly();
		e1.calculateSalary();
		e2.calculateSalary();
		e3.calculateSalary();

		PaymentServicePoly ps = new PaymentServicePoly();
		ps.transactionType(new CreditCardPaymentPoly());
		ps.transactionType(new DebitCardPaymentPoly());
		ps.transactionType(new UPIPaymentPoly());

		NotificationPoly n1 = new EmailNotificationPoly();
		NotificationPoly n2 = new SMSNotificationPoly();
		NotificationPoly n3 = new PushNotificationPoly();
		n1.send();
		n2.send();
		n3.send();

		RentalVehicle v1 = new RentalCar();
		RentalVehicle v2 = new RentalBike();
		RentalVehicle v3 = new RentalTruck();
		v1.calculateRent();
		v2.calculateRent();
		v3.calculateRent();

		InterestRateServicePoly irs = new InterestRateServicePoly();
		irs.getInterestRate(new SavingsAccountPoly());
		irs.getInterestRate(new FixedDepositAccountPoly());
		irs.getInterestRate(new CurrentAccountPoly());

		MediaFilePoly m1 = new AudioFilePoly();
		MediaFilePoly m2 = new VideoFilePoly();
		MediaFilePoly m3 = new PodcastPoly();
		m1.play();
		m2.play();
		m3.play();

		CustomerPoly c1 = new RegularCustomerPoly();
		CustomerPoly c2 = new PremiumCustomerPoly();
		CustomerPoly c3 = new VIPCustomerPoly();
		c1.calculateDiscount();
		c2.calculateDiscount();
		c3.calculateDiscount();

		MenuItemPoly mi1 = new VegItemPoly();
		MenuItemPoly mi2 = new NonVegItemPoly();
		mi1.calculatePrice();
		mi2.calculatePrice();

		GameCharacter ch1 = new WarriorChar();
		GameCharacter ch2 = new ArcherChar();
		GameCharacter ch3 = new MageChar();
		ch1.attack();
		ch2.attack();
		ch3.attack();
	}
}
