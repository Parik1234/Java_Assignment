package org.Btm.CapgApp;

import java.util.Scanner;

public class Natural {
	int sum;
	
	public int calculateSum(int x)
	{
	   for(int i=1; i<=x; i++)
	   {
		   if(i%3==0&&i%5==0)
		sum=sum+i;
	   }
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		Natural n1=new Natural();
		int b=n1.calculateSum(n);
		System.out.println(b);
		
	}

}
