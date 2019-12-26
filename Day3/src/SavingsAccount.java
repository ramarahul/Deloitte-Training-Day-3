
public class SavingsAccount extends Account {
	
	private static final double MINIMUM = 10000;

	public SavingsAccount(String name, int number, double balance) {
		super(name, number, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print(String s) {
		//System.out.println("Printing Account info "+s);
		super.print(s);
	}
	
	
	
	@Override
	public void withdraw(double amount) {
		if(balance-amount>=MINIMUM) {
			balance-=amount;
		}
	}
	
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}

}
