package customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testGetName() {
	Customer cust = new Customer();
	cust.setName("Gaurav");
	assertEquals(cust.getName(),("Gaurav"));
	}

	@Test
	public void testGetAccounts() {

	Customer cust = new Customer();
	ArrayList<Account> list = new ArrayList<Account>();
	Account account1 = new Account((float)304,  new Currency(CurrencyCode.EUR) );
	list.add(account1);
	Account account2 = new Account((float)304,  new Currency(CurrencyCode.CAN) );
	list.add(account2);
	Account account3 = new Account((float)304,  new Currency(CurrencyCode.USD) );
	list.add(account3);
	cust.setAccounts(list);
	assertTrue(cust.getAccounts().contains(account1));
	assertTrue(cust.getAccounts().contains(account2));
	assertTrue(cust.getAccounts().contains(account3));		
	}

}
