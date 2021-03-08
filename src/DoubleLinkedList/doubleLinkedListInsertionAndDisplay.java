package DoubleLinkedList;

public class doubleLinkedListInsertionAndDisplay {

	Node head;  
	Node tail;
	int length;
	
	// Initializing constructor of doubleLinkedList class
	public doubleLinkedListInsertionAndDisplay()
	{
		head = null;
		tail = null;
		length = 0; 
	}
	
    /* Double Linked list Node*/
    class Node 
    { 
        int data;
        Node previous;
        Node next; 
  
        Node(int data)        // Constructor to create a new node
        { 
        	this.data = data;
        	this.previous = null; 
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
    
    // This method is used to display the values of the double linked list from the head
    public void printForward() 
    { 
    	if(head == null)
    	{
    		return;
    	}
        Node current = head; 
        while (current != null) { 
            System.out.print(current.data + " "); 
            current = current.next; 
        } 
    } 
    
    // This method is used to display the values of the double linked list from the tail
    public void printBackward() 
    { 
    	if(tail == null)
    	{
    		return;
    	}
        Node current = tail; 
        while (current != null) { 
            System.out.print(current.data + " "); 
            current = current.previous; 
        } 
    }
    
    // This method is used to insert the values at the head of the double linked list
    public void insertFirst(int value) 
    { 
    	Node new_node = new Node(value);
    	
    	if(isEmpty())
    	{
    		tail = new_node;
    	}
    	else  		
    	{
    		head.previous = new_node;
    	}
    	new_node.next = head;
    	head = new_node;
    	length++;
    } 
    
    // This method is used to insert the values at the tail of the double linked list
    public void insertLast(int value) 
    { 
    	Node new_node = new Node(value);
    	
    	if(isEmpty())
    	{
    		head = new_node;
    	}
    	else  		
    	{
    		tail.next = new_node;
    	}
    	new_node.previous = tail;
    	tail = new_node;
    	length++;
    } 
    
	public static void main(String[] args) {

		doubleLinkedListInsertionAndDisplay dl1 = new doubleLinkedListInsertionAndDisplay();
		dl1.insertLast(10);
		dl1.insertLast(15);
		dl1.insertLast(8);
		dl1.insertLast(9);
		
		dl1.printForward();
		System.out.println();
		
		dl1.insertFirst(10);
		dl1.insertFirst(16);
		dl1.insertFirst(7);
		dl1.insertFirst(2);
		
		dl1.printForward();
	}

}
