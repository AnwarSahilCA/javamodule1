package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
	Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPalindrome() {
		int n=12321;
		boolean expectedResult=true;
		boolean actualValue=calc.palindrome(n);
		assertEquals(expectedResult,actualValue);
		//fail("Not yet implemented");
	}

}
