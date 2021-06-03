package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.DepartamentSecretariat;
import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;
import ro.ase.cts.seminar14.TipBursaEnum;

class TestCaseSecretariat {

	/* test fixtures */
	DepartamentSecretariat secretariat;
	static final ArrayList<Student> DEFAULT_STUDENTS;
	
	static {
		DEFAULT_STUDENTS = new ArrayList<Student>();
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		int defaultNote1[] = { 7, 8, 9};
		int defaultNote2[] = { 8, 9, 10};
		DEFAULT_STUDENTS.add(new Student("Anonim", 99, defaultNote1));
		DEFAULT_STUDENTS.add(new Student("Anonim2", 99, defaultNote2));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		secretariat = new DepartamentSecretariat();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/* cardinality 1 - reference test */
	@Tag("importante")
	@Test
	void testCalculBursaStub() {
		/* stub clasa anonima */
		StudentAbstract defaultStudent = new StudentAbstract() {
			
			@Override
			public float calculMedie() throws StudentExceptionWrongValue {
				return 8;
			}
		};
		
		ArrayList<StudentAbstract> listaStudenti = new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultStudent);
		secretariat.setStudenti(listaStudenti);
		
		float bursa = secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.MERIT.getCuantum(), bursa, "cuantumul returnat nu este corect");
	}

	@Test
	void testCalculBursaStubCuClasaConcreta() {
		/* stub clasa concreta */
		StudentStub defaultStudent = new StudentStub();
		defaultStudent.setCalculMedieReturnValue(9);
		defaultStudent.setExceptionalCase(true);
		
		ArrayList<StudentAbstract> listaStudenti = new ArrayList<StudentAbstract>();
		listaStudenti.add(defaultStudent);
		secretariat.setStudenti(listaStudenti);
		
		float bursa = secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.EXCELENTA.getCuantum(), bursa, "cuantumul returnat nu este corect");
	}
	
}
