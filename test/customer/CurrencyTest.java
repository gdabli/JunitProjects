package customer;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
	Currency currency1 = null;
	Currency currency2 = null;
	Currency currency3 = null;
	@Before
	public void setUpMyTest(){
		currency1 = new Currency(CurrencyCode.EUR);
		currency2 = new Currency(CurrencyCode.CAN);
		currency3 = new Currency(CurrencyCode.USD);
	}
	
	@Test
	public void testGetCurrencyCode() {
		assertEquals(currency1.getCurrencyCode(),CurrencyCode.EUR);
		assertEquals(currency2.getCurrencyCode(),CurrencyCode.CAN);
		assertEquals(currency3.getCurrencyCode(),CurrencyCode.USD);
	}
	@After
	public void releaseResources(){
		currency1 = null;
		currency2 = null;
		currency3 = null;
	}

}
