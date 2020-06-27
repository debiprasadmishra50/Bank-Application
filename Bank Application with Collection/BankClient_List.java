import java.util.List;

public class BankClient_List 
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
		
		BankDepository_List br = new BankDepository_List();
		br.addBankAccount(ac1);
		br.addBankAccount(ac2);
		br.addBankAccount(ac3);
		br.addBankAccount(ac4);
		br.addBankAccount(ac5);
		
		List<BankAccount> listAllAccounts = br.listAllAccounts();
		for (BankAccount bankAccount : listAllAccounts) 
		{
			System.out.println(bankAccount.getAcc_id()+"\t"+bankAccount.getName());
		}
		
		try{
			BankAccount fetch = br.fetchBankAccountByAccountId(1001);
			System.out.println(fetch.getAcc_id()+"\t"+fetch.getName());
		}
		catch(NullPointerException e)
		{
			System.out.println("Account Not Found");
		}
		
		BankAccount delete = br.deleteBankAccountById(1004);
		if(delete == null)
			System.out.println("Account Not Found");
	}
}
