package ro.ase.cts.seminar2.exceptii;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(String message) {
		super(message);
	}
	
}
