package test;

import source.LinkedList;
import source.LinkedList.ListNode;

public class TestReverseAUX {

	public static String TestIteratively(int a) {
		LinkedList newList = new LinkedList();
		for (int i = 1; i < a; i++) {
			newList.add(i);
		}
		System.out.print("List before reversal : ");
		System.out.println(newList.printList().toString());
		ListNode headerNode = newList.getList();
		headerNode = LinkedList.reverseIteratively(headerNode);
		newList.setList(headerNode);
		System.out.print("Itertative reverse   : ");
		System.out.println(newList.printList().toString());
		return newList.printList().toString();
	}
	
	public static String TestRecursivly(int a) {
		LinkedList newList = new LinkedList();
		for (int i = 1; i < a; i++) {
			newList.add(i);
		}
		System.out.print("List before reversal : ");
		System.out.println(newList.printList().toString());
		ListNode headerNode = newList.getList();
		headerNode = LinkedList.reverseRecursivly(headerNode);
		newList.setList(headerNode);
		System.out.print("Recursive reverse    : ");
		System.out.println(newList.printList().toString());
		return newList.printList().toString();
	}

}
