package interfaces;

// a solid task of implementing functional interfaces

@FunctionalInterface
interface DiscountRule {
	double applyDiscount(double amount);
}

class BillingService {
	void calculateFinalAmount(double amount, DiscountRule rule) {
		double finalAmount = rule.applyDiscount(amount);
		System.out.println("Original Amount: " + amount);
		System.out.println("Final Amount: " + finalAmount);
	}
}

public class FunctionalInterface2 {

	public static void main(String[] args) {
		// First way
//		DiscountRule firstClass = amnt -> amnt - (0.5 * amnt);
//		DiscountRule secondClass = amnt -> amnt - (0.25 * amnt);
//		DiscountRule thirdClass = amnt -> amnt - (0.1 * amnt);
		
		
		
		BillingService bs = new BillingService();
		
//		bs.calculateFinalAmount(1000, firstClass);
//		bs.calculateFinalAmount(1000, secondClass);
//		bs.calculateFinalAmount(1000, thirdClass);
		
		// Another way of passing directly without extra classes
		bs.calculateFinalAmount(3000, amnt -> amnt - amnt * 0.1);
		bs.calculateFinalAmount(8000, amnt -> amnt > 5000 ? amnt-500 : amnt);
		bs.calculateFinalAmount(12000, amnt -> amnt - (amnt * 0.15));

	}

}
