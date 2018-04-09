import java.util.*;
public class Exc extends Exception {
	
	Scanner a=new Scanner(System.in);
	
	
	public void div(int x,int y)
	{
		try
		{
			int c=x/y;
			System.out.println(c);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
