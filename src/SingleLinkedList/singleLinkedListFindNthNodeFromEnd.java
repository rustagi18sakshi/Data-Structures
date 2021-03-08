package SingleLinkedList;

import java.util.Scanner;

/*
Linked list is :
1 5 2 18 7 10 
Enter the node from end you want to get :
2
Nth node from end is : 7
*/

public class singleLinkedListFindNthNodeFromEnd {

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
    
    // This method is used to get the Nth node from the end.
    // refPtr is traversed first for count<n(i.e. n number of times) 
    // and then till refPtr!=null so that mainPtr moves till nth node from end.
    public static Node getNthNodeFromEnd(int n) 
    { 
        if(head == null)
        {
        	return null;
        }
        if(n<=0)
        {
        	throw new IllegalArgumentException("Invalid value of n : "+n);
        }
        
        Node mainPtr = head;
        Node refPtr = head;
        int count = 0;
        
        while(count < n)
        {
        	refPtr = refPtr.next;             // refPtr is shifted to the next node
        	count++;
        }
        while(refPtr!=null)					  // Traversing till the end of the list
        {
        	refPtr = refPtr.next;             // refPtr is shifted to the next node
        	mainPtr = mainPtr.next;			  // mainPtr is shifted to the next node
        }
        return mainPtr;
    } 
    
	public static void main(String[] args) {

    	singleLinkedListFindNthNodeFromEnd s1 = new singleLinkedListFindNthNodeFromEnd();
		s1.insertFirst(10);  // 10
		s1.insertFirst(7);   // 7 -> 10
		s1.insertFirst(18);  // 18 -> 7 -> 10
		s1.insertFirst(2);   // 2 -> 18 -> 7 -> 10
		s1.insertFirst(5);   // 5 -> 2 -> 18 -> 7 -> 10
		s1.insertFirst(1);   // 1 -> 5 -> 2 -> 18 -> 7 -> 10
		
		System.out.println("Linked list is :");
        s1.printList();    
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node from end you want to get :");
        int endNodeNumber = sc.nextInt();
        
        Node NthNodeFromEnd = getNthNodeFromEnd(endNodeNumber);
        System.out.println("Nth node from end is : "+NthNodeFromEnd.data);
		
	}

}


