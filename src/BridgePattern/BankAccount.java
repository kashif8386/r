package BridgePattern;

public abstract class BankAccount 
{
  public String Name;
  public int accnumber;
  public int opendate;
  public int Balance;
  
  protected AccountStatus Account;
  
  protected BankAccount(String n,int b,AccountStatus a)
  {
	  Name=n;
	  Balance=b;
	  Account=a;
  }
  
  public abstract void changer();
}
