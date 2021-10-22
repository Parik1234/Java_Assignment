package org.Btm.CapgApp;

import java.util.Scanner;

public class Power {
	public boolean checkNumber(int x)
	{
		while(x%2==0)
		{
			x=x/2;
		}
		if(x==1)
			return true;
			else
				return false;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		Power p=new Power();
		boolean rs=p.checkNumber(n);
		if(rs==true)
			System.out.println("this is power of 2");
		else
			System.out.println("this is not power of 2");
	}

}
