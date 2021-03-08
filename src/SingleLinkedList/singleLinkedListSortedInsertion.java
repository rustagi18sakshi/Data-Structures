package SingleLinkedList;

public class singleLinkedListSortedInsertion {
	
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
	
    // Inserts a new Node at beginning of the list. New node next is pointing to the head and then new node becomes head.
    public static void insertFirst(int value) 
    { 
        Node new_node = new Node(value); 
        new_node.next = head; 
        head = new_node; 
    } 
    
    // Inserts a new Node in the sorted list. 
    // It inserts the new node between current and temp
    public static void insertInSortedList(int value) 
    { 
    	Node newNode = new Node(value);
    	if(head == null)
    	{
    		head = newNode;
    	}
    	
        Node current = head;
        Node temp = null;
        // By this we will find two nodes between which we have to insert our new node
        while(current != null && current.data < newNode.data)  	
        {
        	temp = current;
        	current = current.next; 
        }
        newNode.next = current;       
        temp.next = newNode;
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
    
	public static void main(String[] args) {

		singleLinkedListSortedInsertion s1 = new singleLinkedListSortedInsertion();
		
		// Insert elements in sorted order
		s1.insertFirst(12);  // 12
		s1.insertFirst(10);  // 10 -> 12
		s1.insertFirst(7);   // 7 -> 10 -> 12
		s1.insertFirst(2);   // 2 -> 7 -> 10 -> 12
	
		s1.insertInSortedList(8);
		s1.printList();      // Printing the sorted list
	}

}
