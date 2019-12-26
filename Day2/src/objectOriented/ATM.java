package objectOriented;

public class ATM {
	
	private static double withdrawLimit;
	private double totalAmount;
	private Account acct;	
	
	public ATM(double amount,double withdrawlimit) {
		totalAmount=amount;
		withdrawLimit = withdrawlimit;
	}
	
	public double withdraw(double amount,int pin) {
		if(validatePin(pin)) {
		if(amount>totalAmount) {
			System.out.println("Insufficient Balance");
			return 0.0;
		}
		else if(amount>withdrawLimit) {
			System.out.println("Exceeded Withdraw limit");
			return 0.0;
		}
		else if((acct.getAccBalance()-amount)<Account.minBalance) {
			System.out.println("Inufficient Balance");
		}
		else {
			acct.setAccBalance(acct.getAccBalance()-amount);;
		}
		}
		else {
			System.out.println("Incorrect Pin");
			return 0.0;
		}
		
		return acct.getAccBalance();
	}
	
	public double deposit(double amount,int pin) {
		if(validatePin(pin)) {
				acct.setAccBalance(acct.getAccBalance()+amount);;
			}
		else {
				System.out.println("Incorrect Pin");
				return 0.0;
			}
		return acct.getAccBalance();
	}
	
	public boolean validatePin(int pin) {
		return this.acct.getAccPin()==pin;
	}
	
	public Account getAcct() {
		return acct;
	}

	public void setAcct(Account acct) {
		this.acct = acct;
	}

	public String toString() {
		return "total amount = "+totalAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm1 = new ATM(1500000,4000);
		Account acc1 = new Account("PK",4432,1231412);
		atm1.setAcct(acc1);
		
		System.out.println(atm1.deposit(5000,4432));
		System.out.println(atm1.withdraw(3000,4432));
		System.out.println(atm1.withdraw(5000,4432));

	}

}
