package Lab4;

public class Bank {

	public static void main(String[] args) {
		
		Per p1= new Per("Parikshit", 23);
		Per p2= new Per("Kumar", 25);
		
		SalAcc s1= new SalAcc();
		CurrentAccount c1= new CurrentAccount();
		
		s1.createAccount(p1,2000);
		c1.createAccount(p2, 3000);
		
		System.out.println(s1.balance);
		System.out.println(c1.balance);
		
		s1.deposit(2000);
		c1.withdraw(2000);
	}

}
