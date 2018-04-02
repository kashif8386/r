package BridgePattern;

public class Silver extends BankAccount 
{
     int bal;
	 Silver(String n, int b, AccountStatus a,int ba) 
	{
		super(n, b, a);
		bal=ba;
	}
	 
	 public void display()
	 {
		 
	 }
		
		public void changer()
		{
			Account.Deposit(bal);
			
		}
}



