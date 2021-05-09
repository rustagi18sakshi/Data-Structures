package HashMapConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
		
		marks.put("Nav", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);

		System.out.println(marks.get("Nav"));
		
	}
}
