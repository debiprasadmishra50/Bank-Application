import java.util.ArrayList;
import java.util.List;

public class BankDepository_List implements BankDAO
{
	List<BankAccount> account_List = new ArrayList<BankAccount>();
	
	@Override
	public void addBankAccount(BankAccount ac) {
		account_List.add(ac);
	}
	
	@Override
	public List<BankAccount> listAllAccounts() {
		return account_List;
	}
	
	@Override
	public BankAccount fetchBankAccountByAccountId(int acc_id) {
		for (BankAccount bankAccount : account_List) {
			if(bankAccount.getAcc_id() == acc_id)
				return bankAccount;
		}
		return null;
	}
	
	@Override
	public BankAccount deleteBankAccountById(int acc_id) {
		int i = 0;
		for (BankAccount bankAccount : account_List) {
			if(bankAccount.getAcc_id() == acc_id)
			{
				account_List.remove(i);
				System.out.println("Account Deleted");
				System.exit(0);
			}
			else
				i++;
		}
		return null;
	}
	
}
