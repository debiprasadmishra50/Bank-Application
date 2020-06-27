import java.util.List;

public interface BankDAO 
{
	public void addBankAccount(BankAccount ac);
	public List<BankAccount> listAllAccounts();
	public BankAccount fetchBankAccountByAccountId(int id);
	public BankAccount deleteBankAccountById(int id);
}
