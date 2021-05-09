package HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {

	// This way should be avoided
	public static Map<String, Integer> marksMap;
	
	static
	{
		marksMap = new HashMap<String, Integer>();
		marksMap.put("Sakshi", 100);
		marksMap.put("Shruti", 200);
	}
	
	public static void main(String[] args) {

		// 1. using HashMap class
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		Map<String, String> map2 = new HashMap<String, String>();
		
		// 2. static way : static hashmap 
		
		System.out.println(HashMapInitialization.marksMap.get("Sakshi"));   // 100
		

		// 3. immutable Map with only one single entry
		// immutable means that its value can not be changed. And singletonMap so that it takes only one entry.
		
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		map3.get("test");
		map3.put("abc", 200);     // gives UnsupportedOperationException
		

		
	}
}
