package SingleLinkedList;

public class singleLinkedListInsertion {
	
	static Node head;
	
	/* Linked list Node*/
	static class Node
	{
		int data;
		Node next;
		
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
    
    // Inserts a new Node at end of the list. 
    public static void insertLast(int value) 
    { 
        Node new_node = new Node(value); 
        
        // If head is null then the inserted node becomes head
        if(head==null)
        {
        	head = new_node;
        	return;
        }
        
        // Traversing till the end of the list. Thing to remember here is : we are using 'current.next' in while loop.
        Node current = head;
        while(current.next !=null)
        {
        	current = current.next;
        }
        
        // Change the next of last node
        current.next = new_node;
    } 
    
    // Inserts a new node after the given prev_node. 
    public void insertAfter(Node prev_node, int new_data) 
    { 
        // Check if the given Node is null 
        if (prev_node == null) 
        { 
            System.out.println("The given previous node cannot be null"); 
            return; 
        } 
  
        Node new_node = new Node(new_data); 
  
        // Make next of new Node as next of prev_node
        new_node.next = prev_node.next; 
  
        // Make next of prev_node as new_node
        prev_node.next = new_node; 
    } 
    
	public static void main(String[] args) 
	{
		singleLinkedListInsertion s1 = new singleLinkedListInsertion();
		s1.insertFirst(10);  // 10
		s1.insertFirst(7);   // 7 -> 10
		s1.insertFirst(18);  // 18 -> 7 -> 10
		s1.insertFirst(2);   // 2 -> 18 -> 7 -> 10
		
		s1.insertLast(10);   // 2 -> 18 -> 7 -> 10 -> 10
		s1.insertLast(5);    // 2 -> 18 -> 7 -> 10 -> 10 -> 5
		
		// inserting after 2nd node
		s1.insertAfter(s1.head.next, 3);     // 2 -> 18 -> 3 -> 7 -> 10 -> 10 -> 5
		
		s1.printList();			
	}
}
