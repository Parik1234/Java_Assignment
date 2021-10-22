package org.Btm.CapgApp;

import java.util.Scanner;

public class Cubes {
	int sum;
	int dy;
	public int sumOfCube(int x)
	{
		for(int i=1; i<=x; i++)
		{
			sum=sum+i*i*i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	Cubes s=new Cubes();
	System.out.println(s.sumOfCube(n));
	}

}
