package projects;

// Online Order Processing System

interface Payable {
	void pay(double amount);
}

abstract class Order {
	private int orderID;
	private String customerName;
	private double orderAmount;

	Order(int orderID, String customerName, double orderAmount) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
	}

	protected double getOrderAmount() {
		return orderAmount;
	}

	abstract double calculateShippingCost();

	void processOrder(Payable payment) {
		System.out.println("Order ID: " + orderID + "Customer Name: " + customerName);
		double shippingCost = calculateShippingCost();
		double totalAmount = orderAmount + shippingCost;
		System.out.println("Total Amount: " + totalAmount);
		payment.pay(totalAmount);
	}
}

class DomesticOrder extends Order {

	DomesticOrder(int orderID, String customerName, double orderAmount) {
		super(orderID, customerName, orderAmount);
	}

	public double calculateShippingCost() {
		double orderAmount = getOrderAmount();
		return orderAmount * 0.05;
	}
}

class InternationalOrder extends Order {
	double customsDuty;

	InternationalOrder(int orderID, String customerName, double orderAmount, double customsDuty) {
		super(orderID, customerName, orderAmount);
		this.customsDuty = customsDuty;
	}

	public double calculateShippingCost() {
		double orderAmount = getOrderAmount();
		return orderAmount * 0.10 + customsDuty;
	}

}

class CardPayment implements Payable {
	public void pay(double amount) {
		System.out.println("Processing Card Payment of " + amount);
	}
}

class UPIPayment implements Payable {
	public void pay(double amount) {
		System.out.println("Processing UPI Payment of " + amount);
	}
}

class OrderService {
	void placeOrder(Order order, Payable payment) {
		order.processOrder(payment);
	}
}

public class OopsProject2 {

	public static void main(String[] args) {
		
		Order o1 = new DomesticOrder(6145, "Rishi rao", 1500.00);
		Order o2 = new InternationalOrder(6146, "Karan rao", 150960.00, 3500.26);
		
		Payable p1 = new CardPayment();
		Payable p2 = new UPIPayment();
		
		OrderService service = new OrderService();
		
		service.placeOrder(o1, p2);
		service.placeOrder(o2, p1);
		
	}

}
