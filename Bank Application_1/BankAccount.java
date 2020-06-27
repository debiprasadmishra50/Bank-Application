public class BankAccount {
	private long acc_id;
	private String name;
	private static int cnt = 1000;

	public BankAccount() {
		this.acc_id = cnt++;
	}
	
	public String getName() {
		return name;
	}

	public void setAcc_id(long acc_id) {
		this.acc_id = acc_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAcc_id() {
		return acc_id;
	}
}
