package source;

/*
 * ----------------------------------------
 *       STRECTURE OF LINKEDLIST
 *----------------------------------------*/

public class LinkedList {
	
	private Node Node;
	StringBuilder s = new StringBuilder();
	
	public class Node {
		int data;
		Node next = null;

	}
	
	//Constructor
	public LinkedList() {
		Node = new Node();
	}
	
	//Getter
	public Node getList() {
		return Node;
	}
	
	//SETTER
	public void setList(Node setNode) {
		Node = setNode;
	}

	//ADD NODE TO LISE
	public Node add(int data) {
		Node tempList = Node;
		if ((tempList.next == null) && (tempList.data == 0)) {
			tempList.data = data;
			return tempList;
		} else {
			while (tempList.next != null) {
				tempList = tempList.next;
			}
			Node newNode = new Node();
			newNode.data = data;
			tempList.next = newNode;
			return newNode;
		}
	}

	//PRINT NODE
	public StringBuilder printList() {
		s.setLength(0);
		Node tempNode = Node;
		while (tempNode != null) {
			s.append(tempNode.data + "->");
			tempNode = tempNode.next;
		}
		s.append("null");
		return s;
	}
	   
	

	//1. An iterative reverse.
	public  static Node reverseIteratively(Node headerNode) {
		Node prevNode = null;
		Node currNode = headerNode;
		Node nextNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}

		return prevNode;
	}
	
	
//	2. A recursive reverse.
	public static  Node reverseRecursivly(Node headerNode) {
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
		Node secondElementNode = headerNode.next;

		// Unlink the first element
		headerNode.next = null;

		// Reverse everything from the second element
		Node revNode = reverseRecursivly(secondElementNode);

		// Now we join both the lists
		secondElementNode.next = headerNode;

		return revNode;
	}

}