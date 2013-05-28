package test;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import source.LinkedList;
import source.LinkedList.Node;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TestReverseRecursivly {
	private Integer inputNumber;
	private String expectedResult;
	private TestReverseRecursivly testReverse;


	public TestReverseRecursivly(Integer inputNumber, String expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	public String TestRecursivly(int a) {
		LinkedList newList = new LinkedList();
		for (int i = 1; i < a; i++) {
			newList.add(i);
		}
		Node headerNode = newList.getList();
		headerNode = LinkedList.reverseRecursivly(headerNode);
		newList.setList(headerNode);
		return newList.printList().toString();
	}
	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {	
	    		 { 2, "1->null" },
	 	         { 6, "5->4->3->2->1->null" },
		         { 7, "6->5->4->3->2->1->null" },
		         { 8, "7->6->5->4->3->2->1->null" },
		         // False 
		         //{ 10, "9->8->7->6->5->4->3->2->null" },
		         //True
		         { 10, "9->8->7->6->5->4->3->2->1->null" },
		         { 9, "8->7->6->5->4->3->2->1->null" },
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testReverse() {
	      assertEquals(expectedResult, TestRecursivly(inputNumber));
	   }

}