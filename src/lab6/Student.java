package lab6;
import java.util.*;
public class Student {

	public static void main(String[] args) {

		HashMap<String, Integer> student = new HashMap<>();

		student.put("Ram", 68);
		student.put("Shyam", 70);
		student.put("Hari", 96);
		student.put("A", 86);
		student.put("Mohit", 80);
		student.put("Sonu", 59);

		// Invoking the method and store the result in map
		Map<String, String> std = getStudent(student);

		// iterating the results
		for (Entry<String, String> entry : std.entrySet())
			System.out.println(entry.getKey() + " won " + entry.getValue());
	}

	// Creating a method to perform the given operation
	public static HashMap<String, String> getStudent(HashMap<String, Integer> student) {

		HashMap<String, String> stdDetails = new HashMap<>();

		// Fetching the key from input hashmap and store it in a set
		Set<String> set = student.keySet();

		// Logic for perform the operation in given condition
		for (String s : set) {
			Integer marks = student.get(s);

			if (marks > 90)
				stdDetails.put(s, "Gold");
			else if (marks < 90 && marks >= 80) {
				stdDetails.put(s, "Silver");
			} else if (marks < 80 && marks >= 70) {
				stdDetails.put(s, "Bronze");
			}
		}

		
		return stdDetails;
	}
}
