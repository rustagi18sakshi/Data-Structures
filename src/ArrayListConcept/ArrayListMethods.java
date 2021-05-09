package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
	
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		System.out.println(ar1);     		// [java, python, ruby, javascript]
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Dev Ops");
		
		System.out.println(ar2);     		// [Testing, Dev Ops]
		
		//  ------- Using addAll() --------
		// ar1.addAll(ar2);
		// System.out.println(ar1);  		// [java, python, ruby, javascript, Testing, Dev Ops]
		
		// ar1.addAll(1, ar2);	
		// System.out.println(ar1);  		// [java, Testing, Dev Ops, python, ruby, javascript]
		
		//  ------- Using clear() --------
		// ar1.clear();
		//System.out.println(ar1);   		// []

		//  ------- Using clone() --------
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);  	// [java, python, ruby, javascript]
		
		//  ------- Using contains() --------
		boolean status = ar1.contains("javascript");
		System.out.println(status);     			// true
		System.out.println(ar1.contains("c"));      // false
		
		//  ------- Using indexOf() --------
		// Using indexOf() also we can verify if the element is present in the ArrayList or not.
		System.out.println(ar1.indexOf("javascript")>=0);    // true

		//  ------- Using lastIndexOf() --------
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa","Naveen"));
		System.out.println(list3);                  // [Naveen, Tom, Naveen, Steve, Lisa, Naveen]
		int index = list3.lastIndexOf("Naveen");
		System.out.println(index);                  // 5
		
		//  ------- Using remove() --------
		list3.remove(1);
		System.out.println(list3);					// [Naveen, Naveen, Steve, Lisa, Naveen]
		
		list3.remove("Lisa");
		System.out.println(list3);					// [Naveen, Naveen, Steve, Naveen]
		
		//  ------- Using removeIf() --------
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println(numbers);                // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		numbers.removeIf(num -> num%2==0);          // Lambda function to remove even numbers
		System.out.println(numbers);                // [1, 3, 5, 7, 9]

		//  ------- Using retainAll() --------
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa","Naveen"));
		
		namesList.retainAll(Collections.singleton("Naveen"));
		System.out.println(namesList);              // [Naveen, Naveen, Naveen]
		
		// ------- Using subList() --------
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(subList);                // [3, 4, 5, 6]
		
		// ------- Using toArray() --------
		ArrayList<String> namesList1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Naveen","Steve","Lisa","Naveen"));
		
		String[] arr = namesList1.toArray(new String[namesList1.size()]);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");            // Naveen Tom Naveen Steve Lisa Naveen 
		}
		System.out.println();
		
		// --- Other way -----
		Object[] arr1 = namesList1.toArray();
		System.out.print(Arrays.toString(arr)+" ");  // [Naveen, Tom, Naveen, Steve, Lisa, Naveen] 
		
	}

}
