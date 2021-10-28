package lab6;
import java.util.*;
public class Vote {

	public static void main(String[] args) {
		
		// Creating HashMap object and take id as key and age as value
		HashMap<String, Integer> map= new HashMap<>();
		
		map.put("PARIKSHIT", 47);
		map.put("RAKESH", 16);
		map.put("SAILYA", 25);
		map.put("DHANUSH", 18);
		map.put("KUMAR", 20);
		map.put("DIPEN",99);
		
		// Invoking the function
		List<String> list= voterList(map);
		
		// Creating iterator to iterate the list
		Iterator<String> itr= list.iterator();
		System.out.println("Eligible For Vote:");
		while(itr.hasNext())
			System.out.println(itr.next());

	}
	
	// Creating the method to perform whether a ID is eligible for vote or not
	public static List<String> voterList(HashMap<String, Integer> hMap) {
		
		// arraylist to store the resultant IDs
		List<String> list= new ArrayList<>();
		
		
		for(String id: hMap.keySet()) {
			int age= hMap.get(id);
			if(age>18) {
				list.add(id);
			}
		}
		return list;
	}
}
