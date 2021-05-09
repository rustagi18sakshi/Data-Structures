package HashMapConcept;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> marks = new LinkedHashMap<String, Integer>();
		
		marks.put("Nav", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 500);
		
		for(Map.Entry<String, Integer> m : marks.entrySet())
		{
			System.out.println("Key is : "+m.getKey()+" Value is : "+m.getValue());
		}

		/*
		Output is : 
			Key is : Nav Value is : 100
			Key is : Tom Value is : 200
			Key is : Lisa Value is : 300
			Key is : Peter Value is : 400
			Key is : Robby Value is : 600
			Key is : null Value is : 500

		 */
	}
}
