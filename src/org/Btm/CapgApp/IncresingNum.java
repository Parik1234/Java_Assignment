package org.Btm.CapgApp;
import java.util.Scanner;
public class IncresingNum {
	
	public boolean toInc(int x)
	{
		int num=x%10;
		x/=10;
		while(x>0) {
			if(num<x%10)
				return false;
			num=x%10;
			x/=10;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		IncresingNum o=new IncresingNum();
		System.out.println(o.toInc(n));
		}
}
