package interfaces;

// Interface exactly one abstract method is called as functional interface.
// It allows static and default methods as normal interface but only one abstract method is possible.
// Lambda expressions are special type expressions, used to implement functional interfaces.

@FunctionalInterface
interface TransactionValidator {
	boolean validate(double amount);
}

class TransactionService {
	void process(double amount, TransactionValidator validator) {
		if(validator.validate(amount)) 
			System.out.println("Transaction approved");
		else
			System.out.println("Transaction rejected");
	}
}

public class FunctionalInterface1 {

	public static void main(String[] args) {
		
		// Lambda expression
		TransactionValidator minValidator = amnt -> amnt >= 100;
		
		TransactionService ts = new TransactionService();
		
		ts.process(1500.25, minValidator);
		ts.process(95.55, minValidator);

	}

}
