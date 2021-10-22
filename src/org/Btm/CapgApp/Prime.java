package org.Btm.CapgApp;

import java.util.Scanner;

public class Prime {
	int toPrimeNumber(int x) {
		for(int i=2; i<=x/2; i++)
		{
			if(x%i==0)
			{
				
			}
		}
	return x;	
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		Prime p=new Prime();
		p.toPrimeNumber(n);
	}

}
