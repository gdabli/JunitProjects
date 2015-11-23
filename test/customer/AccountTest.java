package customer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

	Account account1 = new Account(1000, new Currency(CurrencyCode.USD));
	Account account2 = new Account(500, new Currency(CurrencyCode.EUR));
	Account account3 = new Account(300, new Currency(CurrencyCode.CAN));
	
	
	@Test
	public void testGetBalance() {
		assertEquals(account1.getBalance(),(float) 1000,0.0f);
		assertEquals(account2.getBalance(),(float) 500,0.0f);
		assertEquals(account3.getBalance(),(float) 300,0.0f);
	}

	@Test
	public void testGetCurrency() {

		assertEquals(account1.getCurrency().getCurrencyCode(),CurrencyCode.USD);
		assertEquals(account2.getCurrency().getCurrencyCode(),CurrencyCode.EUR);
		assertEquals(account3.getCurrency().getCurrencyCode(), CurrencyCode.CAN);
	}

}
