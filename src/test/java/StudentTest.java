package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Student;

public class StudentTest {
	
	// create test student
	Student john = new  Student("John", "22", "020298", "17358875");
	
	// test getUsername() method
	@Test
	public void testGetUsername() {
		assertEquals("John22", john.getUsername());
	}
	
	// test set/getAge() methods
	@Test
	public void testSetGetAge() {
		john.setAge("23");
		assertEquals("23", john.getAge());
	}
}
