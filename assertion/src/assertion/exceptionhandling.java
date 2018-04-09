package assertion;

public class exceptionhandling {
	int a, b, op;

	exceptionhandling(int a, int b) {
		this.a = a;
		this.b = b;
	
	}
	int result;

	public int sum() 
	{
		int result = a + b;
		return result;
	}
	
	public int div(){
	try{
		int result = a / b;
	  }
	
	catch(ArithmeticException e)
	{
		System.out.println("Excepion Caught Division by 0");
	}
	return result;
}
}
