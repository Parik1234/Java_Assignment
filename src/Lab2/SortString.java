package Lab2;
import java.util.Scanner;
import java.util.Arrays;
public class SortString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(sc.nextLine());

		String[] names = new String[size];
		System.out.println("Enter the names");
		for (int i = 0; i < size; i++) {
			names[i] = sc.nextLine();
		}

		String s = sortString(names);

	}

	public static String sortString(String[] names) {
		Arrays.sort(names);
		int len = names.length;
		int mid = len / 2;
		System.out.println("Resultant array is: ");
		if (len % 2 == 0) {
			for (int i = 0; i < mid; i++) {
				System.out.println(names[i].toUpperCase());
			}
			for (int j = mid; j < len; j++) {
				System.out.println(names[j].toLowerCase());
			}
		} else {
			for (int i = 0; i < (mid) + 1; i++) {
				System.out.println(names[i].toUpperCase());
			}
			for (int j = (mid + 1); j < len; j++) {
				System.out.println(names[j].toLowerCase());
			}
		}

		return null;
	}
}
