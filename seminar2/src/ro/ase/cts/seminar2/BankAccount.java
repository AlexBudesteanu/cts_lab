package ro.ase.cts.seminar2;

public abstract class BankAccount extends Account{
	protected double balance;
	protected String iban;
	
	public BankAccount() {
		this.balance = 0;
		this.iban = "";
	}
	
	public BankAccount(double balance, String iban) {
		this.balance = balance;
		this.iban = iban;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
