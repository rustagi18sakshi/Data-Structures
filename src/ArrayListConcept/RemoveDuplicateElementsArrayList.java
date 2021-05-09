package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,4,5,6,5,7,8,9,9,10));
		
		// --------- Using LinkHashSet class ---------
		
		System.out.println("Using LinkedHashSet class : ");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet); 
		
		System.out.println(numbersListWithoutDuplicates);    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		// --------- Using JDK 8 Stream ---------
		
		System.out.println("Using JDK 8 Stream : ");
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,4,5,6,5,7,8,9,9,10));
		
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(marksListUnique);                // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}
	

}
