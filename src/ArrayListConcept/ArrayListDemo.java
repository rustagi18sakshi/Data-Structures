package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Dynamic array
		
		// Default Generics
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(100);
		al.add("Sakshi");
		al.add(true);
		
		System.out.println(al);         // Prints [100, Sakshi, true]
		
		System.out.println(al.get(2));  // Prints 'true'
		
		// In these cases we get : java.lang.IndexOutOfBoundsException
		// System.out.println(al.get(6));
		// System.out.println(al.get(-1));
		
		// Size of arraylist
		System.out.println(al.size());  // Prints 3
		
		al.add(400);
		al.add("Shruti");
		al.add(500);
		
		System.out.println(al.size());  // Prints 6

			
	}
}
