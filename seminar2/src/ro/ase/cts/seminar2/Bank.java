package ro.ase.cts.seminar2;

public class Bank {
	public static int nextId;
	
	public BankAccount openBankAccount(AccountType tipCont) {
		if(tipCont == AccountType.CURRENT) {
			return new CurrentAccount();
		}else if (tipCont == AccountType.SAVINGS) {
			return new SavingsAccount();
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
