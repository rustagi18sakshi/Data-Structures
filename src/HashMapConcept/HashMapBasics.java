package HashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {

		// no order - no indexing
		// stores data in the form of key-value
		// key can not be duplicate
		// can store one null key and multiple null values
		// hash map is non-synchronized or thread-safe
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London 1");
		capitalMap.put(null, "Berlin");                   // One null key can be added
		capitalMap.put(null, "LA");	                      // Updates the value of null key
		capitalMap.put("Russia", null);					  // We can add multiple null values
		capitalMap.put("France", null);					  // We can add multiple null values
		
		System.out.println(capitalMap.get("India"));       // New Delhi
		System.out.println(capitalMap.get("UK"));	       // London 1

	
		System.out.println(capitalMap.get(null));          // LA
		System.out.println(capitalMap.get("Russia"));      // null
		
		// Iteration on HashMap
		
		// Iterate hashmap using Iterator over the keys - by using keySet()
		
		System.out.println("***** Iteration over key using keySet() ***** ");
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = capitalMap.get(key);
			
			System.out.println("Key is : "+key+" Value is : "+value);
		}
		
		// Iterate hashmap by using entrySet()
		
		System.out.println("***** Using entrySet() ***** ");
		
		for(Map.Entry<String, String> m : capitalMap.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+" Value is : "+m.getValue());
		}
		
		// Iterate hashmap using Java 8 for-each and lambda
		
		System.out.println("***** Using lambda ***** ");
		
		capitalMap.forEach((k,v) -> System.out.println("Key : "+k+" Value : "+v));
		
	}

}
