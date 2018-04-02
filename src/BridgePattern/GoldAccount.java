package BridgePattern;

public class GoldAccount implements AccountStatus 
{
	
	public void Deposit(int g) 
	{
		if(g<=100000)
		{
			System.out.println("Transfer successful\n Amount = "+g);
		}
		else
    	{
    		System.out.println("you exceed the limit. your transfer limit should be less than 100000$");
    	}
		
	}

    public void Withdraw(int i)
    {
    	if(i<=1000)
    	{
    		System.out.println("withdraw successful\n Amount = "+i);
    	}
    	else
    	{
    		System.out.println("your limit should be less than 1000$");
    	}
    }
    
	
}
