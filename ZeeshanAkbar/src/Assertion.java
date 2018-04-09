import java.util.Scanner;
public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner;
		
			Scanner s = new Scanner(System.in);
			
			int age = s.nextInt();
				assert  age <= 18:"IS not valid";
					System.out.println("Age is "+age);
		}
	}

