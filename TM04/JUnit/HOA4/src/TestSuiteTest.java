import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestSuiteTest {

	TestSuite obj = new TestSuite();
	@Test
	public void testPalindromeCheck() {
	assertEquals(true,obj.palindromeCheck("malayalam"));
	}

	@Test
	public void testFindName() {
		ArrayList emp = new ArrayList();
		emp.add("Javed");
		emp.add("Shahid");
		emp.add("Aatifa");	
		assertSame("FOUND",obj.findName(emp,"Aatifa"));
		assertSame("NOT FOUND",obj.findName(emp,"Aashiq"));
	}

	@Test
	public void testStringConcat() {
		assertEquals("malayalam",obj.stringConcat("malaya","lam"));
	}

}
