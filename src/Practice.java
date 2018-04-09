
public class Practice {

	  
	
	
	
	
	public void convert(String sentence)
	{
		
        int pointer = sentence.length()-1;
        char space = ' ';
    	int counter = 0;
	
	while(pointer>=0)
	{
		if(sentence.charAt(pointer)!= space && pointer !=0)
		
		{
		//	System.out.println(sentence.charAt(12));
			
			pointer -- ;

			counter ++ ;
			
		}
		
		 else
		
		{
		
			 if(pointer==0)
			 {
				 
				 int temp = pointer;
				 
				 counter++;
					
					for(int j=0; j<counter;j++ )
					{
						System.out.print(sentence.charAt(temp));
						temp++; 
					} 
					
					
									if(pointer!=0)
									{
									System.out.print(sentence.charAt(pointer));
									}
									pointer -- ;
									counter=0;
									
					
				 
			 }
			 
			 
			 else
			 {
				 
				 int temp = pointer + 1;
					
					for(int j=0; j<counter;j++ )
					{
						System.out.print(sentence.charAt(temp));
						temp++; 
					} 
					if(pointer!=0)
					{
					System.out.print(sentence.charAt(pointer));
					}
					pointer -- ;
					counter=0;
				 
				 
			 }
			 
			
			

			
		}
		
	}
	
	
}
}
