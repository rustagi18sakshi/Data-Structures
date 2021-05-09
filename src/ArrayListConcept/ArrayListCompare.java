package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListCompare {

	public static void main(String[] args) {

	    // 1. Compare two lists : sort and then equals()
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","G"));
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		System.out.println(l1.equals(l2));         // false
		System.out.println(l1.equals(l3));         // true
		
	    // 2. Compare two lists and find out additional elements in first list
		
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		// To find out additional element in 'l4' list
		l4.removeAll(l5);
		
		System.out.println(l4);            // [F]
		
	    // 3. Find out the missing elements of second list from the first list
		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

		// To find out missing element in 'l6' list as compared to 'l7' list
		l7.removeAll(l6);
		
		System.out.println(l7);            // [E]
		
	    // 4. Find out the common elements in two array lists
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","JS","C#","Ruby"));
		
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","PHP","C#"));
		
		LinkedHashSet<String> set = new LinkedHashSet<String>(lang1);
		
		set.retainAll(lang2);
		
		System.out.println(set);         // [Java, Python, Ruby, C#]
	}

}
