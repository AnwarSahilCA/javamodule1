package firstTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator calc;
	@Before
	public void setUp() throws Exception{
	calc =new Calculator();
	}
	@Test
	public void testPowerZero() {
		int inputBase=0;
		int exp=0;
		int expectedValue=0;
		int actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
	}
	@Test
	public void testPower() {
		int inputBase=2;
		int exp=3;
		int expectedValue=8;
		int actualValue=calc.power(inputBase,exp);
		assertEquals(expectedValue,actualValue);
		/*inputBase=3;
		exp=3;
		expectedValue=27;
		actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
		inputBase=4;
		exp=4;
		actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
		inputBase=18;
		exp=7;
		actualValue=calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
	}
	
	public void testadd() {
		int inputBase=4;
		int exp=4;
		int expectedValue=8;
		int actualValue=calc.add(inputBase, exp);
		assertTrue(expectedValue==actualValue);
		inputBase=18;
		exp=7;
		expectedValue=25;
		actualValue=calc.add(inputBase, exp);
		assertTrue(expectedValue==actualValue);
		//fail("Not yet implemented");
	}
	*/
		

}
}
