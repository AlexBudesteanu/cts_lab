package ro.ase.cts.seminar2.interfaces;

import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public interface Withdrawable {
	public void withdraw(double amount) throws InsufficientFundsException;
}
