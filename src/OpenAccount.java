
public class OpenAccount implements Request {

	BankAccount user;
	
	public OpenAccount(BankAccount user)
	{
		
		this.user = user;
		
	}
	
	public void accRequest(int id,String name)
	{
		
		user.open(id, name);
		
	}
	
}
