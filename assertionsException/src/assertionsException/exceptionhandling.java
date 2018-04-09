package assertionsException;

public class exceptionhandling {
	
	int nominator;
	int denumerator;
	int result;
	
	public exceptionhandling(int vara,int varb) {
		// TODO Auto-generated constructor stub
		nominator = vara;
		denumerator = varb;
	}
		
	

	public void division()
	{
		try {
			result = nominator/denumerator;
			System.out.println("Result is "+result);
			
			}
		catch (Exception e)
		{
			System.out.println("exception occurred"+e.getMessage());
		}
	}

	
	
	
}