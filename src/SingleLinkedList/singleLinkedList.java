package SingleLinkedList;

public class singleLinkedList {

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
    
    // This method is used to find out the length of the linked list
    public static int lengthOfList() 
    { 
    	if(head==null)
    	{
    		return 0;
    	}
        Node current = head; 
        int count = 0;
        while (current != null) { 
            count++;
            current = current.next; 
        } 
        return count;
    } 
    
    public static void main(String args[])
    {
    	singleLinkedList sl = new singleLinkedList();
    	sl.head = new Node(10); 
        Node second = new Node(7); 
        Node third = new Node(5); 
        Node fourth = new Node(8); 
        
        //Now we will connect them together
        sl.head.next = second;  //10 -> 7
        second.next = third;    //10 -> 7 -> 5
        third.next = fourth;    //10 -> 7 -> 5 -> 8 
        
        sl.printList();
        
        System.out.println();
        
        int lengthOfList = lengthOfList();
        System.out.println("Length of linked list is : "+lengthOfList);
    }
}
