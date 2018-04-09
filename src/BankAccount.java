
public abstract class BankAccount {

	int totalAmount;
	String tittle;
	protected Request request;
	
	
	public BankAccount()
	{
		
		
	}
	
	public BankAccount(int a,String b,Request request)
	{
		totalAmount = a;
		tittle = b;
		this.request =  request;
		
	}
	
	public  void setAmount(int a)
	{
		totalAmount = a;
		
	}
	
	public  void setTittle(String b)
	{
		
		tittle = b;
		
	}
	
	public  int getAmount()
	{
		return totalAmount;
		
	}
	
	public  String getTittle()
	{
		
		return tittle;
	}
	
	public abstract void withdraw(int amount);
	public abstract void transfer(int amount);
	
	public void open(int id,String name)
	{
		
		System.out.println("congratulation "+ name +" You have open a new account");
		
	}
	
	public void close(int id,String name)
	{
		
		System.out.println("Dear "+ name +" Your account has been closed");
		
	}

	
	
	
	
	
	
}
