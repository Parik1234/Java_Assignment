package org.Day2;

public class Sum {
	int sum;
	public int toSum()
	{
	int[] arr= {10,20,65,98,45};
	for(int i=0; i<arr.length; i++)
	{
		sum=sum+arr[i];
	}
	return sum;	
	}
	public static void main(String[] args)
	{
		Sum s=new Sum();
		System.out.println(s.toSum());
	}

}
