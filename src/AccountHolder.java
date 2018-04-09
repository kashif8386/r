
public class AccountHolder  {
	
	String name;
	int cnic;
	Contact contactProfile;
	
	
	public AccountHolder()
	{
		
		
	}
		
	public AccountHolder(int id,String a,int b,Contact contactProfile)
	{
		name = a;
		cnic = b;	
	   this.contactProfile= contactProfile;
		
		
	}
	

	public  void setName(String b)
	{
		
		this.name = b;
		
	}
	
	public  void setcnic(int b)
	{
		
		this.cnic = b;
		
	}
	
	public  String getName()
	{
		
		return name;
		
	}
	
	public int  getCnic()
	{
		
		return cnic;
		
	}
	
	
	
	
	
	}
	


