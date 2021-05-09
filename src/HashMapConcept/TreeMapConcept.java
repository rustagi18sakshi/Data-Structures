package HashMapConcept;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		
		// Prints in sorted order of key
		System.out.println(map);           
		
		// Print the smallest key
		System.out.println(map.firstKey());   // 1000
		
		// Print the largest key
		System.out.println(map.lastKey());    // 11000
		
		// Print all the keys <= 3000
		
		Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
		System.out.println(keysLessThan3k);      // [1000, 1400, 2000]

		// Print all the keys >= 3000
		
		Set<Integer> keysGreaterThan3k = map.tailMap(3000).keySet();
		System.out.println(keysGreaterThan3k);   // [3000, 11000]

		// Sorting of String keys
		System.out.println("******** Sorting of String keys in alphabetical order ********");
		
		TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();
		
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 90);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
		
		userMap.forEach((k,v) -> System.out.println("Key is : "+k+" Value is :"+v)); 
		
		
		// Sort in descending order 
		System.out.println("******** Sorting in descending order ********");
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>(Comparator.reverseOrder());
		
		map1.put(1000, "Tom");
		map1.put(2000, "Peter");
		map1.put(3000, "Steve");
		map1.put(11000, "Naveen");
		map1.put(1400, "Robby");
		
		// Prints in sorted order of key
		map1.forEach((k,v) -> System.out.println("Key is : "+k+" Value is :"+v)); 
		 		
	}
}
