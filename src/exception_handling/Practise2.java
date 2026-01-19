package exception_handling;

// Task 1

class UserNameValidationException extends RuntimeException {
	private String name;

	UserNameValidationException(String name) {
		super("Invalid username: " + name);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class AgeValidationException extends RuntimeException {
	private int age;

	AgeValidationException(int age) {
		super("Invalid age: " + age);
		this.age = age;
	}
}

class UserService {
	void registerUser(String name, int age) {
		if (name == null || name.isEmpty()) {
			throw new UserNameValidationException(name);
		}
		if (age < 18) {
			throw new AgeValidationException(age);
		}

		System.out.println("User registered: " + name);

	}
}

class InsufficientBalanceException extends RuntimeException {
	private int accountId;
	private double balance;

	public InsufficientBalanceException(int accountId, double balance) {
		super("Account " + accountId + " has insufficient balance: " + balance);
		this.accountId = accountId;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}
}

class BankAccount {
	int accountId;
	double balance;

	BankAccount(int accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}

	void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException();
		}
		if (amount > balance) {
			throw new InsufficientBalanceException(accountId, balance);
		}
		balance -= amount;
		System.out.println("Withdrawal successful. Remaining balance: " + balance);
	}

}

public class Practise2 {

	public static void main(String[] args) {

		// 1.
		UserService us1 = new UserService();
		try {
			us1.registerUser("", 15);
		} catch (UserNameValidationException e) {
			System.out.println("User name must be provided. " + e.getMessage());
		} catch (AgeValidationException e) {
			System.out.println("Age must be greater than 18. " + e.getMessage());
		}
		
		// 2.
		BankAccount ba1 = new BankAccount(25521, 5000.00);
		try {
			ba1.withdraw(10000.00);
		} catch (IllegalArgumentException e) {
			System.out.println("Enter correct number. " + e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println("Balnce is not sufficient. " + e.getMessage());
		}
	}

}
