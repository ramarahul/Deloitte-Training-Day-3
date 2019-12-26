
public abstract class Account implements Printer {
	
	protected String name;
	protected int number;
	protected double balance;
	public Account(String name, int number, double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	
	public abstract void withdraw(double amount);
	
	public void deposit(double amount) {
		
	}
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", balance=" + balance + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println("Printing account info..."+s);
		
	}

}
