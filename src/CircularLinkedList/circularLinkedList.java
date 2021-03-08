package CircularLinkedList;

public class circularLinkedList {

	Node last;  
	int length;
	
	// Initializing constructor of circularLinkedList class
	public circularLinkedList()
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
    
    public void createCircularLinkedList()
    {
    	Node first = new Node(2);
    	Node second = new Node(8);
    	Node third = new Node(5);
    	Node fourth = new Node(1);
    	
    	first.next = second;
    	second.next = third;
    	third.next = fourth;
    	fourth.next = first;  // Fourth node is pointing to first to make it circular linked list
    	
    	last = fourth;     // we need to assign the value to last	
    }
    
    // This method is used to display the values of the circular linked list
    public void printList() 
    { 
    	if(last == null)          // Checking if the circular limked list is empty
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
		
		circularLinkedList cl = new circularLinkedList();
		cl.createCircularLinkedList();
		cl.printList();

	}

}
