package ro.ase.cts.seminar12.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp was called");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}

	@Test
	void testStudentConstructorRight() {
		String studentName = "Alex";
		int studentAge = 27;
		int grades[] = {8, 8 ,9};
		
		Student student = new Student(studentName, studentAge, grades);
		assertEquals(studentName, student.nume, "Name is not equal");
		assertEquals(studentAge, student.varsta, "Age is not equal");
		assertEquals(grades, student.note, "Grades are not equal");
	}
	
	@Test
	void test2() {
		fail("Not yet implemented - test 2");
	}

}
