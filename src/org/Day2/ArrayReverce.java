package org.Day2;

public class ArrayReverce {
	public static void main(String[] args)
	{
		int[] arr=new int[] {21,32,65,98,45};
		//this loop is using for reverse order
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
