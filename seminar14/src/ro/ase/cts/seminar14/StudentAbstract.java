package ro.ase.cts.seminar14;

public abstract class StudentAbstract {
	/*
	 * constraints nume - [3 - 255] caractere varsta - [18 - 30] note - [1 - 10]
	 */
	String nume;
	int varsta;
	int note[];
	
	public abstract float calculMedie() throws StudentExceptionWrongValue;
}
