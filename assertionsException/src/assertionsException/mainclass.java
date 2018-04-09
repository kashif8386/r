package assertionsException;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assertions myobjectRefference = new assertions(5,5);
		System.out.println(myobjectRefference.sum());
		exceptionhandling myobjectRefference2 = new exceptionhandling(5,0);
		myobjectRefference2.division();
		
		
	}

}
