package lab9.exc3;

import java.util.Scanner;

public class Factori {
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);
	FactorialInf fact = (num) -> {
		int value = 1;
		for (int i = 0; i <= num; i++) {
			if (i == 0)
				value = 1;
			else
				value = value * i;
		}
		return value;
	};
	System.out.println("Enter the value");
	int number = obj.nextInt();
	System.out.println(number+ " "+ fact.getFact(number));

	obj.close();
}

}

