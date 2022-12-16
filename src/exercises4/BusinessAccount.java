package exercises4;

public class BusinessAccount extends Account{

	private double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(double loanLimit) {
		super();
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(int number, String holder, double balance) {
		super(number, holder, balance);
		// TODO Auto-generated constructor stub
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
