import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 d = new Demo2();
		assertTrue(d.palindromeCheck("malayalam"));
	}

}
