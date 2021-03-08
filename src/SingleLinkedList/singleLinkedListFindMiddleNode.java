package SingleLinkedList;

/*
For reference : https://www.udemy.com/course/data-structures-java/learn/lecture/17977749#overview
*/
public class singleLinkedListFindMiddleNode {

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
    
    // This method finds out the middle node. For even nodes(e.g. having 4 nodes), middle node will be : 3
    // For odd nodes(e.g. having 5 nodes), middle node will be 3
    public static Node getMiddleNode() 
    { 
        if(head == null)
        {
        	return null;
        }
        
        Node slowPtr = head;
        Node fastPtr = head;
        
        while(fastPtr!=null && fastPtr.next!=null)   // Traversing till second last node of the list
        {
        	slowPtr = slowPtr.next;             // slowPtr is shifted to the next node
        	fastPtr = fastPtr.next.next;		// fastPtr is shifted to next to next node
        }
        return slowPtr;
    } 
    
	public static void main(String[] args) {

		// Demo for linked list having even number of nodes
    	singleLinkedListFindMiddleNode s1 = new singleLinkedListFindMiddleNode();
		s1.insertFirst(10);  // 10
		s1.insertFirst(7);   // 7 -> 10
		s1.insertFirst(18);  // 18 -> 7 -> 10
		s1.insertFirst(2);   // 2 -> 18 -> 7 -> 10
		
		System.out.println("Even Linked list is :");
        s1.printList();    
        System.out.println();
        
        Node middleNodeEven = getMiddleNode();
        System.out.println("Middle node for even number of nodes is : "+middleNodeEven.data);

		// Demo for linked list having odd number of nodes
    	s1.insertFirst(6);   // 6-> 2 -> 18 -> 7 -> 10
    	
		System.out.println("Odd Linked list is :");
		s1.printList();    
        System.out.println();
        
        Node middleNodeOdd = getMiddleNode();
        System.out.println("Middle node for odd number of nodes is : "+middleNodeOdd.data);

	}
}
