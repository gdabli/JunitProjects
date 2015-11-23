package customer;

public class Currency {
	
	private CurrencyCode code;
	public Currency(CurrencyCode string){
		this.code = string;
	}
	public CurrencyCode getCurrencyCode() {
		return code;
	}

}
