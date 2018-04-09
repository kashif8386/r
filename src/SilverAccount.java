
public class SilverAccount  implements Request {
	AccountHolder customers[];
	String accountTittle;
	String openingDate;
	int totalAmount;
	private int amountLimit = 50000;

	
	
	
	public SilverAccount()
	{
		
		
		
	}
	
	public SilverAccount(Contact contactProfile,String accountTittle, String openingDate, int totalAmount, int amountLimit) {
		super();
		//this.contactProfile= contactProfile;
		this.accountTittle = accountTittle;
		this.openingDate = openingDate;
		this.totalAmount = totalAmount;
		this.amountLimit = amountLimit;
	}

   public void openAcc(AccountHolder customer)
   {
	   
	   System.out.print("Congratulation !: Your Silver Account has been created.");
	   
   }
   
   public void accontClose()
   {
	   
	   System.out.print("Your account has been closed.");
	   
   }
   
   public void addBalance(int amount)
   {
	   
	   totalAmount+= amount;
	   System.out.print("Your new balance is "+ totalAmount);
	   

   }
   

	public void withDraw(int amount)
	{
		if(amount > amountLimit )
		{
			System.out.print("withdraw limit exceeds");
		}
		else
		{
			System.out.print("you have withdrawn" + amount +"$\nYour new balance is "+ totalAmount );
			//BankAccount b1 = new BankAccount();
			totalAmount-= amount;
		}
		
	}
	

	public void transferAmount(int amount)
	{
		System.out.print("you cannot transfer amount");
		
	}

	
	

}
