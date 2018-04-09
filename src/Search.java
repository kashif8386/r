
public class Search {

	public static void main(String[] args)
	{
		
		int array[]= {44,88,1,2};
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]<=min)
			{
				min=array[i];
				
			}
			
		}
		System.out.print(min);
	}
}
