package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacityConcept {

	public static void main(String[] args) {

		// Initial Virtual capacity of the Arraylist is 10 by default.
		// Initial Physical capacity of the ArrayList is 0. size() method uses Physical Capacity.
		
		ArrayList<Object> al = new ArrayList<Object>();  //  VC = 10
		
		System.out.println(al.size());   // PC = 0
		
		al.add(100);        // PC = 1, VC = 9
		
		System.out.println(al.size());   // PC = 1
		
		al.add(200);       // PC = 2, VC = 8
		al.add(300);       // PC = 3, VC = 7
		al.add(400);       // PC = 4, VC = 6
		al.add(500);       // PC = 5, VC = 5
		
		System.out.println(al.size());   // PC = 5

		// You can check all this by adding breakpoint and run as "Debug as -> Java Application" 
		// and pressing "FN + F6"
		
		// When the internal array is full, ArrayList needs to allocate the new array with more capacity,
		// copy the existing elements to the new array and de-allocate the existing array.
		// Formula used : ((oldCapacity*3)/2) + 1
	}
}
