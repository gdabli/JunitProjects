package customer;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("unused")
public class Main
   {
	public static void main(String[] args)
	{
		Customer customer = new Customer();
		customer.addAccount( new Account(1000, new Currency(CurrencyCode.USD)));
		customer.addAccount( new Account(500, new Currency(CurrencyCode.EUR)));
		customer.addAccount( new Account(300, new Currency(CurrencyCode.CAN)));
		Iterator<Account> it = customer.getAccounts().iterator();
		while( it.hasNext() )
		 {
			Account a = it.next();
			System.out.println( a.getBalance() );
			System.out.println( a.getCurrency().getCurrencyCode() );
		 }
   	}
}


