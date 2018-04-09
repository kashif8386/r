
public  class GoldAccount  implements Request {
	AccountHolder customer[];
	String accountTittle;
	String openingDate;
	int totalAmount;
	private int amountLimit = 800;
	

	public GoldAccount()
	{
		
		
	}
	
	
	public GoldAccount(String accountTittle, String openingDate, int totalAmount, int amountLimit)
	{
		super();
	//	this.customer = customer;
		this.accountTittle = accountTittle;
		this.openingDate = openingDate;
		this.totalAmount = totalAmount;
		this.amountLimit = amountLimit;
	}

	
	
	 public void openAcc(AccountHolder name)
	   {
		   
		   System.out.print("Congratulation !: Your Gold Account has been created.");
		   
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
			System.out.println("withdraw limit exceeds");
		}
		else
		{
			System.out.println("you have withdrawn " + amount +" $");
			totalAmount-= amount;
		}
		
		
	}
	

	

	public void transferAmount(int amount)
	{
		System.out.print("you have transfered" + amount +"$");
		
	}
	

	

}
