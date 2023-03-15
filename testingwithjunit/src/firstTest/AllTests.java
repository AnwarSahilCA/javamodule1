package firstTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PalindromeTest.class, TestCalculator.class, TestFactorial.class })
public class AllTests {

}
