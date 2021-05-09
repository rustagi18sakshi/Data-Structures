package HashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		//1. On the basis of key-value : using equals() method 
		
		System.out.println(map1.equals(map2));                		// true
		System.out.println(map1.equals(map3));                		// false
		
		//2. Compare hashmap for the same keys : using keySet() method
		
		System.out.println(map1.keySet().equals(map2.keySet()));    // true
		System.out.println(map1.keySet().equals(map3.keySet()));    // true
		
		//3. Find out the extra keys (map1 v/s map4)
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		// Combine/Union the keys from both the maps : using HashSet
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());    // 1, 2, 3
		combineKeys.addAll(map4.keySet());                                     // 1, 2, 3, 4
		
		// Now remove all the keySet of map1 from hashSet
		combineKeys.removeAll(map1.keySet());                                  // 4
		
		System.out.println("Extra keys in map4 are : "+combineKeys);           // 4
		
		//4. Compare hashmap by values : using values() method
		
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		
		// Case1 : duplicates are not allowed : Using ArrayList
		
		System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<String>(map6.values())));   // true
		System.out.println(new ArrayList<String>(map5.values()).equals(new ArrayList<String>(map7.values())));   // false
		
		// Case2 : duplicates are allowed : Using HashSet
		
		System.out.println(new HashSet<String>(map5.values()).equals(new HashSet<String>(map6.values())));   // true
		System.out.println(new HashSet<String>(map5.values()).equals(new HashSet<String>(map7.values())));   // true
		
	}

}
