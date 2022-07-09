package entities;

public class Account {

	private int aNumber;
	private String aHolder;
	private double accountBalance;
	private static double TAX = 5.00;
	
	public Account(int aNumber, String aHolder) {
		this.aNumber = aNumber;
		this.aHolder = aHolder;
	}
	
	public Account(int aNumber, String aHolder, double initialDeposit) {
		this.aNumber = aNumber;
		this.aHolder = aHolder;
		deposit(initialDeposit);
	}
	
	// getter aNumber
	public int getAccountNumber() {
		return aNumber;
	}
	
	// getter e setter aHolder
	public String getAccountHolder() {
		return aHolder;
	}
	
	public void setAccountHolder(String aHolder) {
		this.aHolder = aHolder;
	}
	
	// getter accountBalance
	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	//métodos
	
	public void deposit(double value) {
		accountBalance += value;
	}
	
	public void withdraw(double value) {
		accountBalance = accountBalance - value - TAX;
	}
	
	public String toString() {
		return "Account " 
				+ aNumber 
				+ ", Holder: "
				+ aHolder
				+ ", Balance: $ "
				+ String.format("%.2f", accountBalance);
	}
	
}
