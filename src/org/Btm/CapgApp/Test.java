package org.Btm.CapgApp;

import java.util.Scanner;

import lab9.Pow;

public class Test {
	

		public static void main(String[] args) {
			
			Pow p= (a,b) -> {
				int result=1;
				for(int i= 0; i<=b; i++)
					result*=a;
				return result;
			};
			Scanner scn= new Scanner(System.in);
			
			System.out.println("Enter a number: ");
			int x= scn.nextInt();
			System.out.println("Enter power: ");
			int y= scn.nextInt();
			
			if(y==0)
				System.out.println(x+" to the power "+y+" is: "+x);
			else if (y>0) {
				System.out.println(x+"power "+y+" is: "+p.pow(x,y));
			}
			else {
				System.out.println("Please enter a positive power.");
			}
			
			scn.close();

		}
	}

