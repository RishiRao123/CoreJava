package abstraction;

abstract class Payment {
	protected double amount;
	
	Payment(double amount) {
		this.amount = amount;
	}
	
	abstract void pay();
	
	void paymentReceipt() {
		System.out.println("Payment receipt " + amount + " successful.");
	}	
}

class CreditCardPayment extends Payment {
	String cardNumber;
	
	CreditCardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}
	
	void pay() {
		System.out.println("Processing Credit Card payment");
	}
}

class UPIPayment extends Payment {
	String upiID;
	
	UPIPayment(double amount, String upiID) {
		super(amount);
		this.upiID = upiID;
	}
	
	void pay() {
		System.out.println("Processing UPI payment");
	}
}

class NetBankingPayment extends Payment {
	String bankName;
	
	NetBankingPayment(double amount, String bankName) {
		super(amount);
		this.bankName = bankName;
	}
	
	void pay() {
		System.out.println("Processing Net Banking payment");
	}
}

class PaymentService {
	void processPayment(Payment payment) {
		payment.pay();
		payment.paymentReceipt();
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		
		Payment p1 = new CreditCardPayment(15000.00, "2021200030");
		Payment p2 = new UPIPayment(5000.23, "7670866851@payyes");
		Payment p3 = new NetBankingPayment(1000050, "IDBI Bank");
		
		PaymentService p = new PaymentService();
		p.processPayment(p1);
		p.processPayment(p2);
		p.processPayment(p3);

	}

}
