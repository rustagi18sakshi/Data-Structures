package HashMapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronized {

	public static void main(String[] args) {

		// synchronizedMap method of collections class
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("1", "Naveen");
		map1.put("2", "Lisa");	
		map1.put("3", "Tom");	
		
		// create Synchronized Map
		
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);
		
		// Concurrent HashMap : it doesn't throw ConcurrentModificationException
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Python");	
		concurrentMap.put("C", "CSharp");	
		
		System.out.println(concurrentMap.get("B"));
		
	}

}
