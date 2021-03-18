package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable {

	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount > 0) {
			this.balance -= amount;
		}
	}

}
