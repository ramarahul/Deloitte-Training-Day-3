
public class AccountTest {
	
	public static void showBalance(Account ac) {
		System.out.println(ac.getBalance());
	}
	
	public static void printAccount(Account ac,Printer p) {
		ac.print("From accounts");
		p.print("From printer class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount("Neha",123,100000);
		System.out.println(sa);
		sa.withdraw(4000);
		System.out.println(sa);
		
		CurrentAccount ca = new CurrentAccount("Neha", 123, 200000);
		System.out.println(ca);
		ca.withdraw(2000);
		System.out.println(ca);
		
		Account ac = new SavingsAccount("Amit", 678, 300000);
		System.out.println();
		ac.withdraw(50000);
		System.out.println(ac);
		System.out.println("------------------");
		
		showBalance(ac);
		System.out.println("------------------");
		showBalance(sa);
		
		ac.print("Hello Account");
		sa.print("From Savings");
		ac.print("Hello Account");
		
		printAccount(ac,new ConsolePrinter());
		printAccount(ac,new FilePrinter());

	}

}
