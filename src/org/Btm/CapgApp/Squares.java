package org.Btm.CapgApp;

import java.util.Scanner;

public class Squares {
	int sum;
	int p=0;
	int d=0;
	int l=0;
	int calculateDifference(int x) {
		for(int i=1; i<=x; i++)
		{
			 p=p+i*i;
			 l=(d+i);
			 l=l*l;
			 sum=p-l;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		Squares s=new Squares();
		System.out.println(s.calculateDifference(n));
	}

}
