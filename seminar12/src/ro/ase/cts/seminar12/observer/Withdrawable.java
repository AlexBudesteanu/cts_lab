package ro.ase.cts.seminar12.observer;

public interface Withdrawable {
	public void withdraw(double amount) throws InsufficientFundsException;
}
