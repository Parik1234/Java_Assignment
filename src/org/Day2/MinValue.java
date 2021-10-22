package org.Day2;

public class MinValue {
	public static void main(String[] args)
	{
		
   int[] arr= {2,5,8,12,65};
  
   int min=arr[0];
   for(int i=0;i<arr.length; i++)
   {
	   if(arr[i]<min)
		   min=arr[i];
   }
   System.out.println(min);	
	}

}


