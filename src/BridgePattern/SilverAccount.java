package BridgePattern;

public class SilverAccount implements AccountStatus 
{
	public void Deposit(int g) 
	{
		if(g<=50000)
		{
			System.out.println("Transfer successful\n Amount = "+g);
		}
		else
    	{
    		System.out.println("you exceed the limit. your transfer limit should be less than 50000$");
    	}
		
	}
	
	public void Withdraw(int i)
    {
    	if(i<=2000)
    	{
    		System.out.println("withdraw successful\n Amount = "+i);
    	}
    	else
    	{
    		System.out.println("your limit should be less than 2000$");
    	}
    }
    
	
}
