package SingleLinkedList;

public class singleLinkedListSearchAnElement {

	// head of the list
	static Node head;  
  
    /* Linked list Node*/
    static class Node 
    { 
        int data; 
        Node next; 
  
        // Constructor to create a new node. Next is initialized as null 
        Node(int data) 
        { 
        	this.data = data; 
        	this.next = null;
        } 
    } 
    
    // This method is used to display the values of the linked list
    public static void printList() 
    { 
        Node current = head; 
        while (current != null) { 
            System.out.print(current.data + " "); 
            current = current.next; 
        } 
    }

    // Inserts a new Node at beginning of the list. New node next is pointing to the head and then new node becomes head.
    public static void insertFirst(int value) 
    { 
        Node new_node = new Node(value); 
        new_node.next = head; 
        head = new_node; 
    } 
    
    // Search for an element in the linked list.
    public static boolean searchAnElement(int value) 
    { 
    	boolean status = false;
        Node current = head; 
        while (current != null)
        { 
        	if(current.data == value)
        	{
        		status = true;
        		System.out.println("Element "+value+" is present in the linked list.");
        	}
            current = current.next; 
        }
        
        if(status == false)
        {
        	System.out.println("Element "+value+" is not present in the linked list.");
        }
        return status;
    } 
    
    public static void main(String args[])
    {
    	singleLinkedListSearchAnElement s1 = new singleLinkedListSearchAnElement();
    	
		s1.insertFirst(10);  // 10
		s1.insertFirst(7);   // 7 -> 10
		s1.insertFirst(18);  // 18 -> 7 -> 10
		s1.insertFirst(2);   // 2 -> 18 -> 7 -> 10
		
		System.out.println("Linked list is :");
        s1.printList();    
        System.out.println();
        
        s1.searchAnElement(5);

    }
}
