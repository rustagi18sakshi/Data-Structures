package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsArrayList {

	public static void main(String[] args) {

		// Integer ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		
		// Double ArrayList
		ArrayList<Double> al1 = new ArrayList<Double>();
		al1.add(100.0);
		al1.add(200.0);
		al1.add(300.0);
		System.out.println(al1);
		
		// String ArrayList
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sakshi");
		al2.add("Shruti");
		al2.add("Megha");
		System.out.println(al2);

		// Creating ArrayList using Arrays 
		ArrayList<String> al3 = new ArrayList<String>(Arrays.asList("Sakshi","Shru","Megha"));
		System.out.println(al3);
	}

}
