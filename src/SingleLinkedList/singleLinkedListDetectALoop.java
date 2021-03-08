package SingleLinkedList;

public class singleLinkedListDetectALoop {
	
	Node head;
	
	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
    // This method insert elements in list and create loop among them
    public void createALoopInLinkedList() 
    { 
    	Node first = new Node(10);
    	Node second = new Node(5);
    	Node third = new Node(2);
    	Node fourth = new Node(16);
    	Node fifth = new Node(8);
    	
    	head = first;
    	first.next = second;
    	second.next = third;
    	third.next = fourth;
    	fourth.next = fifth;
    	fifth.next = second;     // Here we are creating a loop
    } 	
    
    // This method detects whether there is a loop in linked list or not
    public boolean detectALoop() 
    { 
        Node fastPtr = head;
        Node slowPtr = head;
        
        while(fastPtr!=null && fastPtr.next!=null)   
        {
        	slowPtr = slowPtr.next;             // slowPtr is shifted to the next node
        	fastPtr = fastPtr.next.next;		// fastPtr is shifted to next to next node
        	if(slowPtr == fastPtr)
        	{
        		return true;
        	}
        }   
        return false;
    } 

	public static void main(String[] args) {

    	singleLinkedListDetectALoop s1 = new singleLinkedListDetectALoop();
    	s1.createALoopInLinkedList();
    	
    	// Verifying whether linked list contains a loop
    	boolean status = s1.detectALoop();
    	System.out.println("Does linked list contains loop : "+status);
	}

}
