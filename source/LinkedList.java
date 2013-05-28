package source;

/*
 * 
 * ----------------------------------------
 *       STRECTURE OF LINKEDLIST
 *----------------------------------------
 * 			 Constructor
 * LinkedList() 
 * 
 *  	   Getter and Setter				
 * ListNode getList()
 * void setList(ListNode setListNode)
 * 
 *         Helpers methods
 * ListNode add(int data)
 * StringBuilder printList()
 * 
 */

public class LinkedList {
	
	private ListNode listNode;
	StringBuilder s = new StringBuilder();
	
	public class ListNode {
		int data;
		ListNode next = null;

	}
	
	//Constructor
	public LinkedList() {
		listNode = new ListNode();
	}
	
	//Getter
	public ListNode getList() {
		return listNode;
	}
	
	//SETTER
	public void setList(ListNode setListNode) {
		listNode = setListNode;
	}

	//ADD NODE TO LISE
	public ListNode add(int data) {
		ListNode tempList = listNode;
		if ((tempList.next == null) && (tempList.data == 0)) {
			tempList.data = data;
			return tempList;
		} else {
			while (tempList.next != null) {
				tempList = tempList.next;
			}
			ListNode newNode = new ListNode();
			newNode.data = data;
			tempList.next = newNode;
			return newNode;
		}
	}

	//PRINT NODE
	public StringBuilder printList() {
		s.setLength(0);
		ListNode tempNode = listNode;
		while (tempNode != null) {
			s.append(tempNode.data + ",");
			tempNode = tempNode.next;
		}
		s.append("null");
		return s;
	}
	   
	

	//1. An iterative reverse.
	public static ListNode reverseIteratively(ListNode headerNode) {
		ListNode prevNode = null;
		ListNode currNode = headerNode;
		ListNode nextNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}

		return prevNode;
	}
	
	
//	2. A recursive reverse.
	public static ListNode reverseRecursivly(ListNode headerNode) {
		// Reverse of a empty list or null list is null
		if (headerNode == null) {
			return null;
		}

		// Reverse of a single element list is the list with that element
		if (headerNode.next == null) {
			return headerNode;
		}

		// Reverse of n element list is reverse of the second element followed
		// by first element

		// Get the list node pointed by second element
		ListNode secondElementNode = headerNode.next;

		// Unlink the first element
		headerNode.next = null;

		// Reverse everything from the second element
		ListNode revNode = reverseRecursivly(secondElementNode);

		// Now we join both the lists
		secondElementNode.next = headerNode;

		return revNode;
	}

}