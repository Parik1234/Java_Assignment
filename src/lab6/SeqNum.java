package lab6;
import java.util.*;
public class SeqNum {
static Scanner scn= new Scanner(System.in);
	
	public static void main(String[] args) {
	
	// Taking input from user
	System.out.println("Enter Size ");
	int size= scn.nextInt();
	
	// Asking for array size
	int[] arr= new int[size];
	
	System.out.println();
	System.out.println("Enter "+size+" numbers of square is: ");
	for(int i=0; i<size; i++) {
		arr[i]= scn.nextInt();
	}
	
	System.out.println();
	System.out.println("Original array: ");
	for(int n: arr)
		System.out.println(n);
	
	// Invoking the method
	Map<Integer, Integer> map= getSquares(arr);
	
	System.out.println();
	System.out.println("Squares of numbers is: ");
	// Fetching each number and square of the each number
	// and printing the same
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	}

	// Creating a method to perform the square of numbers
	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map= new HashMap<>();
		
		// taking each number from array and making the square of that number and add on the map
		for(int n: arr) {
			map.put(n, n*n);
		}
		
		return map;
		
	}
}
