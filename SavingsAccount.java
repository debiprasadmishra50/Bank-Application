public class SavingsAccount {
	private String name;
	private double accBal;

	public SavingsAccount(String name, double accBal) { 
		this.name = name;
		this.accBal = accBal;
	}

	public SavingsAccount(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public void deposit(double amount) {
		accBal = accBal + amount;
	}

	public void withdraw(int withdraw) {
		if (withdraw <= accBal)
			accBal = accBal - withdraw;
		else
			System.out.println("Insufficient Funds");
	}
}
