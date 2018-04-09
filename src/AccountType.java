
public class AccountType extends BankAccount {

	
	public AccountType(int a,String b,Transaction transaction)
	{
		super(a,b,transaction);
		
	}
	
	
	public void transfer(int amount)
	{
		transaction.transferAmount(amount);
		
	}

	
	public void withdraw(int amount) {
		
		transaction.withDrawAmount(amount);
	}
	
}
	
	
