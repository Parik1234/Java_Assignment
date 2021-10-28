package lab6;
import java.util.*;;
public class OccChar {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.println("Enter a String to chars: ");
		String str = scn.next();

		// Convert the string to char array
		char[] arr = str.toCharArray();

		// Fetching each char from char array
		for (char ch : arr) {
			System.out.println("original char array contains: " + ch + " ");
		}

		System.out.println();

		// invoking the function
		Map<Character, Integer> map= getValues(arr);
		
		// Fetching each char and the occurrence of the each char
	
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
				}
	}

	// creating a method to count each char occurrence in char array
	public static Map<Character, Integer> getValues(char[] arr) {

		
		Map<Character, Integer> map = new LinkedHashMap<>();

		// checking each char from char array
		for (char ch : arr) {
			if (map.containsKey(ch)) {

			
				map.put(ch, map.get(ch) + 1);
			} else {
				
				map.put(ch, 1);
			}
		}

		
		return map;
	}
}
