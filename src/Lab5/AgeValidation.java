package Lab5;
import java.util.Scanner;
public class AgeValidation {
	static Scanner scn;
	//for checking a age is valid or not
	public static void checkAge()
	{
		scn=new Scanner(System.in);
		System.out.println("this is only for 18+");
		System.out.println("if you are 18+ then give the vote");
		
		//asking for user
		int age=scn.nextInt();
		try {
			//logic of check the age
			if(age<=0) {
				throw new InvaliNumberException("Invalid Input");
			}
			else if(age<18){
				throw new InvalidAgeException("this is only for 18+");
			}
			else {
				System.out.println("yeah you can give the vote");
			}
		}
			catch(InvalidAgeException age){
				System.out.println("you are not allowed to play the game");
			}
		catch(InvaliNumberException num) {
			System.out.println("you give greter than 0");
		}
	}
		
		
	
	public static void msoin(String[] args)
	{
		checkAge();
		
	}

}
