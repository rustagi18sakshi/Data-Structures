package DoubleLinkedList;

/*
Link to study : https://www.udemy.com/course/data-structures-java/learn/lecture/17977331#overview
*/
import java.util.NoSuchElementException;
public class doubleLinkedListDeletion {

	Node head;  
	Node tail;
	int length;
	
	// Initializing constructor of doubleLinkedList class
	public doubleLinkedListDeletion()
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
    
    // This method is used to delete the first value i.e. head of the double linked list
    public void deleteFirst() 
    { 
    	if(isEmpty())
    	{
    		throw new NoSuchElementException();
    	}
    	Node temp = head; 		
    	if(head == tail)
    	{
    		tail = null;       // assign tail to null if head == tail
    	}
    	else
    	{
    		head.next.previous = null;     // set previous connection of second node to null
    	}
    	head = head.next;				   // set head to second node
    	temp.next = null;                  // set next link of first node to null to break the connection 
    	length--;
    } 
    
    // This method is used to delete the last value i.e. tail of the double linked list
    public void deleteLast() 
    { 
    	if(isEmpty())
    	{
    		throw new NoSuchElementException();
    	}
    	Node temp = tail; 		
    	if(head == tail)
    	{
    		head = null;       // assign head to null if head == tail
    	}
    	else
    	{
    		tail.previous.next = null;     // set next connection of second last node to null
    	}
    	tail = tail.previous;			   // set tail to second last node
    	temp.previous = null;              // set previous link of last node to null to break the connection 
    	length--;
    } 
    
	public static void main(String[] args) {

		doubleLinkedListDeletion dl1 = new doubleLinkedListDeletion();

		dl1.insertFirst(10);
		dl1.insertFirst(16);
		dl1.insertFirst(7);
		dl1.insertFirst(2);
		
		dl1.printForward();
		
		// To verify deletion of first node
		dl1.deleteFirst();
		System.out.println();
		dl1.printForward();
		
		// To verify deletion of last node
		dl1.deleteLast();
		System.out.println();
		dl1.printForward();		
	}
}
