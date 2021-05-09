package HashMapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Nav", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 500);
		
		
		// hashing : hashCode() method coming from Object class
		
		marks.get("Lisa");
		// generating hashcode on basis on key
		// getting index
		// searching for key at the index using equals() method
		// returning value if key is found
	}

}
