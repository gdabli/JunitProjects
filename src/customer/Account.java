package customer;

public class Account {

	private float balance;
	private Currency unit;
	public Account(float balance, Currency unit) {
		this.balance = balance;
		this.unit = unit;
	}
	public float getBalance() {
		return balance;
	}
	public Currency getCurrency() {
		return unit;
	}
}
