package assertionsException;

public class assertions {
	
	int variableA;
	int variableB;
	int total_sum;
	
	public assertions(int vara,int varb){
		variableA = vara;
		variableB = varb;
	}
	

	public int sum()
	{
		/*
		 * this function simply adds two numbers and displays their output 
		 * if a is too large assert gives message 
		 * if b is too large assert gives message
		 * if first variable is non positive than it also gives assert message
		 * 
		 * 
		 * */
		assert(Integer.MAX_VALUE - variableA >= variableB ): "Value of"+variableA+"+"+variableB+"is too large to add";
		total_sum = variableA + variableB;
		assert(total_sum - variableA == variableB):"Sum of"+variableA+"+"+variableB+"returned wrong sum" + total_sum;
		return total_sum;
	}

	
	
	
}
