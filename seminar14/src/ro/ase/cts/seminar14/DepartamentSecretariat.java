package ro.ase.cts.seminar14;

import java.util.ArrayList;

public class DepartamentSecretariat {

	private static final int MIN_MEDIE_MERIT = 8;
	private static final int MIN_MEDIE_EXCELENTA = 9;

	ArrayList<StudentAbstract> studenti;

	public DepartamentSecretariat() {
		studenti = new ArrayList<StudentAbstract>();
	}
	
	public DepartamentSecretariat(ArrayList<StudentAbstract> studenti) {
		super();
		this.studenti = studenti;
	}
	
	public ArrayList<StudentAbstract> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<StudentAbstract> studenti) {
		this.studenti = studenti;
	}

	public float calculBursa(int studentIndex) {
		float medieStudent = 0;
		try {
			medieStudent = studenti.get(studentIndex).calculMedie();
		} catch (StudentExceptionWrongValue e) {
			System.err.println(e.getMessage());
		}
		if(medieStudent >= MIN_MEDIE_EXCELENTA) {
			return TipBursaEnum.EXCELENTA.getCuantum();
		}else if (medieStudent >= MIN_MEDIE_MERIT) {
			return TipBursaEnum.MERIT.getCuantum();
		}else {
			return 0;
		}
	}
}
