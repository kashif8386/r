
public class BridgePatternDemo {

	public static void main(String args[])
	{
		
		BankAccount GoldAccount = new AccountType(5000,"ali",new GoldAccount());
		BankAccount SilverAccount = new AccountType(5000,"ali",new SilverAccount());
	//	GoldAccount.withdraw(500);
	//	SilverAccount.withdraw(3000);
		SilverAccount.transfer(500);
		
	}
}
