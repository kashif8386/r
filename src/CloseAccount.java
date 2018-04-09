public class CloseAccount implements Request {

	BankAccount user;
	
	public CloseAccount(BankAccount user)
	{
		
		this.user = user;
		
	}
	
	public void accRequest(int id,String name)
	{
		
		user.close(id, name);
		
	}
	
}


