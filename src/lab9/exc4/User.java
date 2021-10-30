package lab9.exc4;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		UserPassInf up = (username,password)->{
			return (username.equals("parikshit") && password.equals("@parikshit1"));
		};
		
		System.out.print("Enter the name: ");
		String username=obj.next();
		
		System.out.print("Enter the password : ");
		String password=obj.next();
		
		System.out.println("result "+up.userNamePass(username, password));
		obj.close();
	}

}
