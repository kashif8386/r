
public interface Request {

	
    public void openAcc(AccountHolder customer);
	public void accontClose();
	public void addBalance(int amount);
	public void transferAmount(int amount);
	public void withDraw(int amount);
	
}
