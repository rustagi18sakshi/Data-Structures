package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Sakshi");
		studentList.add("Shruti");
		studentList.add("Megha");
		studentList.add("Lisa");
		
		// For loop iteration
		System.out.println("For loop iteration : ");
		
		for(int i=0; i<studentList.size(); i++)
		{
			System.out.println(studentList.get(i));
		}
		
		// For-each loop iteration
		System.out.println("For-each loop iteration : ");
		
		for(String s : studentList)
		{
			System.out.println(s);
		}
		
		// After JDK-8 - Java streams with lambda
		System.out.println("Using Java Streams with lambda : ");
		
		studentList.stream().forEach(ele -> System.out.println(ele));
		
		// Using iterator
		System.out.println("Using iterator : ");
		
		Iterator<String> it = studentList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
