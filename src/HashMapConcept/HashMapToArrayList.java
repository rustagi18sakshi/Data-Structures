package HashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("Company map size is : "+compMap.size());
		
		for(Map.Entry<String, Integer> m : compMap.entrySet())
		{
			System.out.println(m.getKey() +" = "+m.getValue());
		}
		
		// Convert hashmap keys into arraylist
		
		ArrayList<String> compNameList = new ArrayList<String>(compMap.keySet());
		
		System.out.println("Company name key list is : ");
		
		for(String name : compNameList)
		{
			System.out.println(name);
		}
		
		// Convert hashmap values into arraylist
		
		ArrayList<Integer> compValueList = new ArrayList<Integer>(compMap.values());
		
		System.out.println("Company value list is : ");
		
		for(Integer value : compValueList)
		{
			System.out.println(value);
		}
	}
}
