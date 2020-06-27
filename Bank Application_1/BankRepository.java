public class BankRepository 
{
	private BankAccount ba[] = new BankAccount[10];
	private static int i = 0;
	public void addBankAccount(BankAccount ac)
	{
		//if the index is greater than 10 then do not add
		this.ba[i] = ac;
		i++;
	}
	public BankAccount[] listAllAccounts()
	{
		/*
		 * Create a new array with size till the index
		 * copy contents of old array to new array
		 * return new array created
		 */
		BankAccount arr[] = accountSearch();
		return arr;
	}
	
	public BankAccount fetchBankAccountByAccountId(int bankAccountId)
	{
		/*
		 * loop through array and find the matching bank account with the id passed
		 * if there is bank account, return bank account, else return null
		 */
		int i = 0;
		BankAccount arr[] = accountSearch();
		while(i < arr.length)
		{
			if(arr[i].getAcc_id() == bankAccountId)
				return arr[i];
			i++;
			if(i==arr.length)
			{
				System.out.println("Account Not Found");
				System.exit(0);
			}
		}
		return null;
	}
	
	public BankAccount deleteBankAccountById(int bankAccountId)
	{
		int i = 0;
		BankAccount arr[] = accountSearch();
		while(i < arr.length)
		{
			if(arr[i].getAcc_id() == bankAccountId)
			{
				arr[i].setName("Null");
				arr[i].setAcc_id(0000);
				return arr[i];
			}
			i++;
			if(i==arr.length)
			{
				System.out.println("Account Not Found");
				System.exit(0);
			}
		}
		return null;
	}
	
	private BankAccount[] accountSearch()
	{
		int j = 0;
		while(ba[j] != null)
			j++;
		int k = 0;
		BankAccount arr[] = new BankAccount[j];
		while(k<j)
		{
			arr[k] = ba[k];
			k++;
		}
		return arr;
	}
}
