package BridgePattern;

public class Test {

	public static void main(String[] args) 
	{
		BankAccount s=new Silver("Hilal",10000,new SilverAccount(),3000);
		s.changer();
	   
		

	}

}
