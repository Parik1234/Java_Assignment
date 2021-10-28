package lab6;
import java.util.*;
public class SortL {

	public static void main(String[] args) {
		
		HashMap<String, Integer> h= new HashMap<>();
		h.put("apple", 72);
		h.put("banana", 8);
		h.put("mango", 66);
		h.put("papaya", 75);
		h.put("orange", 02);
		h.put("jackfruit",55);
		
		//invoking the method
		getValue(h);

	}
	
	public static List getValue(HashMap<String,Integer> hMap) {
		
		//store in map
		Map<String,Integer> map= hMap;
		
		//display all the key value pair
		//for(Entry<String, Integer> entry: map.entrySet()) {
		//	System.out.println("Key: "+ entry.getKey()+" Value: "+entry.getValue());
		//}
		
		System.out.println();
		List<Integer> list= new ArrayList<>(map.values());
		for(Integer ol: list)
			System.out.println("before sorting: "+ol);
		
		//sorting the list
		Collections.sort(list);
		
		System.out.println();
		for(Integer ol: list) {
			System.out.println("after sorting: "+ol);
		}
		
		return list;
	}
}
