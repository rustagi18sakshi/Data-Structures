package SingleLinkedList;

/*
Can refer video : https://www.udemy.com/course/data-structures-java/learn/lecture/17977309#overview
*/
public class singleLinkedListReverse {

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
	    public static void printList(Node head) 
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
	    
	    // This method is used to reverse the values of the linked list. 
	    // This method will give us the 'reverse Head' node.
	    public static Node reverseList(Node head) 
	    { 
	    	if(head == null)
	    	{
	    		return head;
	    	}
	    	
	        Node current = head; 
	        Node next = null;
	        Node previous = null;
	        while (current != null) { 
	        	next = current.next;
	        	current.next = previous;
	        	previous = current;
	        	current = next;
	        } 
	        return previous;
	    }
	    
	public static void main(String[] args) {

    	singleLinkedListReverse s1 = new singleLinkedListReverse();
    	
		s1.insertFirst(10);  // 10
		s1.insertFirst(7);   // 7 -> 10
		s1.insertFirst(18);  // 18 -> 7 -> 10
		s1.insertFirst(2);   // 2 -> 18 -> 7 -> 10
		
		System.out.println("Initial Linked list is :");
        s1.printList(head);    
        System.out.println();
        
		System.out.println("Reverse Linked list is :");
        Node reverseHead = s1.reverseList(head);     // This will give the head of the reverse list
  
        s1.printList(reverseHead);     
	}
}
