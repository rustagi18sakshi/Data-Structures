package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {

	public static void main(String[] args) {

		// ---------Using Collections.synchronizedList method --------
		ArrayList<String> namesList = new ArrayList<String>();
		
		List<String> synchonizedNamesList = Collections.synchronizedList(namesList);
		
		synchonizedNamesList.add("Java");
		synchonizedNamesList.add("Python");
		synchonizedNamesList.add("Ruby");
		
		System.out.println("Using Collections.synchronizedList method for synchronization : ");
		
		// To add, remove value - we don't need explicit synchronization.
		
		// To fetch/traverse the values from the list - we have to use explicit synchronization.
		
		synchronized (synchonizedNamesList) {
			
			Iterator<String> itr = synchonizedNamesList.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
		
		// ---------Using CopyOnWriteArrayList class --------
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Naveen");
		empList.add("Steve");
		
		// We don't need explicit synchronization for any operation : add/remove/traverse
		
		Iterator<String> itr2 = empList.iterator();
		
		System.out.println("Using CopyOnWriteArrayList class for synchronization : ");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}
}
