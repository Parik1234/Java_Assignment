package org.Btm.CapgApp;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		primeNum();
	}

	// method for display all the prime numbee in range
	public static void primeNum() {
		Scanner scn = new Scanner(System.in);

		// Asking for user input
		System.out.println("Enter range for prime number: ");
		int n = scn.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are: ");

		
		for (int i = 1; i <= n; i++) {
			if (i <= 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			// the prime number.
			if (flag == true) {
				System.out.print(i + " ");
			}
		}

		// closing all the resource.
		scn.close();
	}


}
