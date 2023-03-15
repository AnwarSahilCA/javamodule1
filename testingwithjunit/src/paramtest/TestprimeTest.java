package paramtest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class TestprimeTest {
	private final Integer InputNumber;
	private final boolean expectedResult;
	private PrimeNumber PrimeNumber;
	@Before
	public void initialize() {
		PrimeNumber=new PrimeNumber();
	}
	public  TestprimeTest(Integer inputNumber, Boolean expectedResult) {
		this.InputNumber=inputNumber;
		this.expectedResult=expectedResult;
	}
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][]{
			{2,true},
			{6,false},
			{19,true},
			{22,false},
			{23,true},
			{24,false}}
		);
	}

	@Test
	public  void testValidate() {
		System.out.println("Parameterized number is"+InputNumber);
		assertEquals(expectedResult,PrimeNumber.validate(InputNumber));
		
	}

}
