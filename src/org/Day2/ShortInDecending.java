package org.Day2;

public class ShortInDecending {
	public static void main(String[] args)
	{
		int[] arr=new int[] {5,2,8,9,12};
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			if(i==arr.length-1)
			{
			//System.out.println(arr[i]);
			}
			
		}
	}

}
