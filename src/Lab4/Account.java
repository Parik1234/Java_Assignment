package Lab4;

public class Account {
	private static long accNum = 1250;
	static double minBal = 850;
	private double balance;
	private String accHolder;
	Per p;

	public Account() {

	}

	// constructor
	public Account(Per p) {
		this.p = p;

	}

	// getter 
	public static long getAccNum() {
		return accNum;
	}

	public static void setAccNum(long accNum) {
		Account.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Per p) {
		this.accHolder = p.getName();
	}

	// toString method
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accHolder=" + accHolder + ", p=" + p + "]";
	}

	// logic for deposit
	public void deposit(double depAmount) {
		if (depAmount > 0) {
			this.balance += depAmount;
			System.out.println("Your total balance is: " + this.balance);
		}
	}

	// declaring withdraw method for future purpose
	public void withdraw(double withAmount) {

	}
	
}
