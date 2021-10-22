package org.Btm.CapgApp;

import java.util.Scanner;

public class IncreasingNum {
	int sum;
	public boolean checkNumber(int x) {
		while(x!=0)
		{
		 int dy=x/10;
		 int dl=x%10;
		}
		 if(dl>dy)
			return true;
		
		}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		IncreasingNum b=new IncreasingNum();
		System.out.println(b.checkNumber(n));
		
	}

}
