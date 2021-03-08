package CircularLinkedList;

public class circularLinkedListInsertion{

	Node last;
	int length;
	
	// Initializing constructor of circularLinkedList class
	public circularLinkedListInsertion()
	{
		last = null;
		length = 0; 
	}
	
    /* Circular Linked list Node*/
    class Node 
    { 
        int data;
        Node next; 
  
        Node(int data)        // Constructor to create a new node
        { 
        	this.data = data;
        	this.next = null; 
        } 
    }
    
    public boolean isEmpty()
    {
    	return length == 0;
    }
    
    public int length()
    {
    	return length;
    }
    
    // This method is used to insert the node at the beginning of the circular linked list
    public void insertFirst(int value) 
    { 
    	Node new_node = new Node(value);
    	
    	if(isEmpty())
    	{
    		last = new_node;
    	}
    	else  		
    	{
    		new_node.next = last.next;
    	}
    	last.next = new_node;
    	length++;
    } 
 
    // This method is used to insert the node at the end of the circular linked list
    public void insertLast(int value) 
    { 
    	Node new_node = new Node(value);
    	
    	if(isEmpty())
    	{
    		last = new_node;
    		last.next = new_node;	
    	}
    	else  		
    	{
    		new_node.next = last.next;      // New node next points to first node
    		last.next = new_node;           // Last node next points to New node
    		last = new_node;				// Assigning last to New node
    	}
    	length++;
    }
    
    // This method is used to display the values of the circular linked list
    public void printList() 
    { 
    	if(last == null)          // Checking if the circular linked list is empty
    	{
    		return;
    	}
        Node first = last.next;   // Pointing to the first node of the circular linked list
        while (first != last)     // This loop will print till second last value 
        { 
            System.out.print(first.data + " "); 
            first = first.next; 
        } 
        System.out.print(first.data + " ");  // This will print the last value 
    }
    
	public static void main(String[] args) {
		
		circularLinkedListInsertion cl = new circularLinkedListInsertion();
		// For insertion at beginning
		cl.insertFirst(10);
		cl.insertFirst(5);
		cl.insertFirst(7);

		cl.printList();
		System.out.println();
		
		// For insertion at end
		cl.insertLast(2);
		cl.insertLast(3);
		cl.insertLast(1);

		cl.printList();
	}
}
