package customer;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	public List<Account> accounts = new ArrayList<Account>();
	
	public void addAccount(Account account) {

		accounts.add(account);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
