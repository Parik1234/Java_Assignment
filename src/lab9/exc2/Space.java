package lab9.exc2;
import java.util.Scanner;
public class Space {
public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		SpaceStringInf s= (ss) -> {
			char[] ch= ss.toCharArray();
			String str2= "";
			for(int i= 0; i<ch.length;i++) {
				str2+= ch[i]+ " ";
			}
			return str2;
		};
		
		System.out.println("Enter a value");
		String str3= scn.next();
		System.out.println();
		System.out.println("Result: "+ s.stringSpc(str3));
		
		scn.close();

	}

}
