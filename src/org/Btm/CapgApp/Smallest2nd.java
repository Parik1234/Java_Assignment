package org.Btm.CapgApp;
//import java.util.Scanner;
public class Smallest2nd {
	int sml;
	int min;
	public int sortString(int[] x){
		for(int i=0; i<=x.length; i++)
		{
		for(int j=i+1; j<x.length; j++)
		{
			if(a[i]>a[j])
			{
				min=a[i];
				a[i]=a[j];
				a[j]=min;
			}
		}
		}

		return a[1];
	}
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,8,3};
	
	}
	
	
	}


