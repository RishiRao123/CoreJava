package exception_handling;

// Custom Exception
class OrderFailureException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int orderId;

	public OrderFailureException(int orderId) {
		super("Order processing failed for Order ID: " + orderId);
		this.orderId = orderId;
	}

	public int getOrderId() {
		return orderId;
	}
}

// Service class
class OrderService {

	void processOrder(int orderId) {
		if (orderId <= 0) {
			throw new OrderFailureException(orderId);
		}
		System.out.println("Order processed successfully: " + orderId);
	}
}

public class ExceptionHandling4 {

	public static void main(String[] args) {

		OrderService orderService = new OrderService();

		int orderId = 202;

		try {
			orderService.processOrder(orderId);
		} catch (OrderFailureException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Program execution completed.");
	}

}


