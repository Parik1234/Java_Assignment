package Lab5;
import java.util.Scanner;
public class FullNameValidation {
public static void main(String[] args) {
		
		checkName();

	}
	
	public static void checkName() {
		
		Scanner scn= new Scanner(System.in);
		
		//User input for first name
		System.out.println("Enter your first name: ");
		String fName= scn.next();
		System.out.println("Enter your last name: ");
		String lName= scn.next();
		
		try {
		
			if(!(fName.isEmpty() || lName.isEmpty())) {
				System.out.println("Full name is: "+fName+" "+lName);
			}
			
		} catch (InvalidNameException in) {
			System.out.println("Please give proper name.");
		}
	}

}
