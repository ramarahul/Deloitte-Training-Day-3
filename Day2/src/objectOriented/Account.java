package objectOriented;

public class Account {
	String accHolder;
	int accPin;
	double accBalance;
	public static final double minBalance = 1000;

	public double getMinBalance() {
		return minBalance;
	}

	@Override
	public String toString() {
		return "Account [accHolder=" + accHolder + ", accPin=" + accPin + ", accBalance=" + accBalance + ", minBalance="
				+ minBalance + ", toString()=" + super.toString() + "]";
	}

	public Account(String accHolder, int accPin, double accBalance) {
		super();
		this.accHolder = accHolder;
		this.accPin = accPin;
		this.accBalance = accBalance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccPin() {
		return accPin;
	}

	public void setAccPin(int accPin) {
		this.accPin = accPin;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
