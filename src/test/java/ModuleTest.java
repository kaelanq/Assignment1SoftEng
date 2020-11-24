package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Module;
import main.java.Student;

public class ModuleTest {
	
	// create test students
	Student john = new  Student("John", "22", "020298", "17358875");
	Student mary = new Student("Mary", "22", "060698", "17373344");
	
	// add students to test module
	Student[] softEngStudents = {john, mary};

	// create test module
	Module softEng = new Module("Software Engineering", "CT417", softEngStudents);

	// test getName() method
	@Test
	public void testGetName() {
		assertEquals("Software Engineering", softEng.getName());
	}
	
	// test getStudents() method
	@Test
	public void testGetStudents() {
		assertArrayEquals(softEngStudents, softEng.getStudents());
	}
	
	// test module toString() method
	@Test
	public void testToString() {
		assertEquals("Name: Software Engineering\nID: CT417"
				+ "\nStudents: John22, Mary22", softEng.toString());
	}

}
