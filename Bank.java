public class Bank {
	public static void main(String[] args) {
		SavingsAccount acc1 = new SavingsAccount("Debi" , 100000.00);
		SavingsAccount acc2 = new SavingsAccount("Debi Prasad");
		
//		sa.setName("Debi");
//		sa.setAccBal(100000.00);
		System.out.println(acc1.getName() + "\t" + acc1.getAccBal());

		acc1.withdraw(20000);
		System.out.println(acc1.getName() + "\t" + acc1.getAccBal());

		acc1.deposit(5000);
		System.out.println(acc1.getName() + "\t" + acc1.getAccBal());
		
		System.out.println(acc2.getName() + "\t" + acc2.getAccBal());
		acc2.setName("No name");
		System.out.println(acc2.getName() + "\t" + acc2.getAccBal());
		acc2.setAccBal(20000.00);
		System.out.println(acc2.getName() + "\t" + acc2.getAccBal());
		
	}
}
