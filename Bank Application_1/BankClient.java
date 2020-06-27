public class BankClient 
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) 
	{
		BankAccount ac1 = new BankAccount();
		ac1.setName("Debi");
		BankAccount ac2 = new BankAccount();
		ac2.setName("Debi Prasad");
		BankAccount ac3 = new BankAccount();
		ac3.setName("Debi Prasad Mishra");
		BankAccount ac4 = new BankAccount();
		ac4.setName("Debi Mishra");
		BankAccount ac5 = new BankAccount();
		ac5.setName("Mishra Prasad");
		
		BankRepository br = new BankRepository();
		br.addBankAccount(ac1);
		br.addBankAccount(ac2);
		br.addBankAccount(ac3);
		br.addBankAccount(ac4);
		br.addBankAccount(ac5);
		
		BankAccount[] listAllAccounts = br.listAllAccounts();
		for (BankAccount bankAccount : listAllAccounts) 
			System.out.println(bankAccount.getAcc_id()+"\t"+bankAccount.getName());
		
		System.out.println("Enter which account you want to search");
		BankAccount fetchAccId = br.fetchBankAccountByAccountId(sc.nextInt());
		System.out.println(fetchAccId.getAcc_id()+"\t"+fetchAccId.getName());
		
		System.out.println("Enter which account you want to delete");
//		BankAccount deleteBankAccountById = 
		br.deleteBankAccountById(sc.nextInt());
		for (BankAccount bankAccount : listAllAccounts)
			System.out.println(bankAccount.getAcc_id()+"\t"+bankAccount.getName());
	}
}
