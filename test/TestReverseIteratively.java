package test;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import source.LinkedList;
import source.LinkedList.ListNode;

@RunWith(Parameterized.class)
public class TestReverseIteratively {
	private Integer inputNumber;
	private String expectedResult;
	private TestReverseIteratively testReverse;

	public TestReverseIteratively(Integer inputNumber, String expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2, "1,null" },
	         { 6, "5,4,3,2,1,null" },
	         { 7, "6,5,4,3,2,1,null" },
	         { 8, "7,6,5,4,3,2,1,null" },
	         // False 
	         //{ 10, "9,8,7,6,5,4,3,2,null" },
	         //True
	         { 10, "9,8,7,6,5,4,3,2,1,null" },
	         { 9, "8,7,6,5,4,3,2,1,null" },
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
		  assertEquals(expectedResult, test.TestReverseAUX.TestIteratively(inputNumber));
	      System.out.println("");
	   }

}