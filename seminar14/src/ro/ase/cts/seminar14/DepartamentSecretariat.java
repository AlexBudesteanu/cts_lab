package ro.ase.cts.seminar14;

import java.util.ArrayList;

public class DepartamentSecretariat {

	ArrayList<Student> studenti;

	public DepartamentSecretariat() {
		studenti = new ArrayList<Student>();
	}
	
	public DepartamentSecretariat(ArrayList<Student> studenti) {
		super();
		this.studenti = studenti;
	}
	
	float calculBursa(int studentIndex) {
		return 0;
	}
}
