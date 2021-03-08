package SingleLinkedList;

public class singleLinkedListRemoveKey {

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
    
    // Deletes the desired node in the list
    public static void deleteNodeWithGivenKey(int key) 
    { 
    	if(head == null)
    	{
    		return;
    	}
    	
        Node current = head;
        Node temp = null;
        // By this we will find two nodes : 
        // current - which contains the key to be deleted and temp - one key before the key to be deleted
        while(current!= null && current.data!=key)  	
        {
        	temp = current;
        	current = current.next; 
        }
        temp.next = current.next;    // Breaking the connection here with the key to be deleted
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

		singleLinkedListRemoveKey s1 = new singleLinkedListRemoveKey();
		
		s1.insertFirst(12);  // 12
		s1.insertFirst(16);  // 16 -> 12
		s1.insertFirst(7);   // 7 -> 16 -> 12
		s1.insertFirst(2);   // 2 -> 7 -> 16 -> 12
		s1.insertFirst(10);  // 10 -> 2 -> 7 -> 16 -> 12
		s1.printList();      // Printing the list before deleting the key
		System.out.println();
		
		s1.deleteNodeWithGivenKey(16);
		s1.printList();      // Printing the list after deleting the key
	}
}
