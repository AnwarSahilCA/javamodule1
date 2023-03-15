package firstTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFactorial {
	static Calculator calc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test cases");
		
	}

	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
		System.out.println("Before each Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testFactorial() {
		int n=5;
		int expectedValue=120;
		int actualValue=calc.factorial(n);
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testFactorial2() {
		int n=6;
		int expectedValue=720;
		int actualValue=calc.factorial(n);
		assertEquals(expectedValue,actualValue);
				
	}
}


