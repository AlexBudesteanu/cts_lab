package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentExceptionWrongValue;

class StudentTestCase {
	/* test fixtures */
	Student student;
	static String DEFAULT_NAME = "Anonim";
	static int DEFAULT_VARSTA = 18;
	static int DEFAULT_NOTE[];
	static int NR_NOTE_DEFAULT = 3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_NOTE = new int[NR_NOTE_DEFAULT];
		DEFAULT_NOTE[0] = 9;
		DEFAULT_NOTE[1] = 9;
		DEFAULT_NOTE[2] = 10;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(DEFAULT_NAME, DEFAULT_VARSTA, DEFAULT_NOTE);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	// ordonance test
	@Test
	void testCalculMedieOrdonance() throws StudentExceptionWrongValue {
		// specific testului de ordonance este faptul ca inputul este
		// dat intr-o anumita ordine.
		int note[] = {10, 9, 8, 7, 6};
		student.setNote(note);
		float medie = student.calculMedie();
		float expectedValue = 8;
		assertEquals(expectedValue, medie, "Media nu corespunde");
	}
	
	// cardinality test - zero elemente
	@Test
	void testCalculMedieCardinalityZero() {
		int note[] = new int[3];
		try {
			student.setNote(note);
		} catch (StudentExceptionWrongValue e) {
			fail("Exceptie generata de setNote");
		}
		
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.calculMedie();
		});
		
	}
	
	// cardinality test - 1 element
	@Test
	void testCalculMedieCardinalityOne() {
		int note[] = new int[1];
		note[0] = 9;
		try {
			student.setNote(note);
		} catch (StudentExceptionWrongValue e) {
			fail("Exceptie generata de setNote");
		}
		
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.calculMedie();
		});
		
	}

}
