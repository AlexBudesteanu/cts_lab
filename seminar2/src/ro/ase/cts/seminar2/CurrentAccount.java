package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

	public static double MAX_CREDIT = 5000;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (this.balance >= amount) {
			this.balance -= amount;
		}else {
			throw new InsufficientFundsException("fonduri insuficiente");
		}
	}

	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}else {
			this.withdraw(amount);
			destination.deposit(amount);
		}
	}
}
