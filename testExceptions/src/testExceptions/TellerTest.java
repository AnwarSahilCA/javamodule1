package testExceptions;

import org.junit.Test;

public class TellerTest {
	Teller teller=new Teller();
	
	
	@Test(expected=InvalidTransactionAmountException.class)
	public void testValidateNegativeAmount() {
		Teller.validateTransaction("EUR", -100);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testValidateUnacceptedCurrency() {
		Teller.validateTransaction("AUSD", 100);
	}

	

}
