package test.java;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import main.java.Course;
import main.java.Module;
import main.java.Student;

public class CourseTest {
	
	// create test students
	Student john = new  Student("John", "22", "020298", "17358875");
	Student mary = new Student("Mary", "22", "060698", "17373344");
	Student patrick = new Student("Patrick", "25", "160795", "14457685");
	
	// add students to test modules
	Student[] softEngStudents = {john, mary};
	Student[] dspStudents = {mary, patrick};

	// create test modules
	Module softEng = new Module("Software Engineering", "CT417", softEngStudents);
	Module dsp = new Module("Digital Signal Processing", "EE445", dspStudents);

	// add modules to test course
	Module[] eceModules = {softEng, dsp};
	
	// create course start and end dates with jodatime
	DateTime startDate = new DateTime(2020, 9, 28, 0, 0);
	DateTime endDate = new DateTime(2021, 6, 2, 0, 0);
	
	// create test course
	Course ece = new Course("ECE", startDate, endDate, eceModules);
	
	// test getName() method
	@Test
	public void testGetName() {
		assertEquals("ECE", ece.getName());
	}
	
	// test set/getStartDate() methods
	@Test
	public void testSetGetStartDate() {
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
		ece.setStartDate(new DateTime(2022, 8, 26, 0, 0));
		assertEquals("26/08/2022", ece.getStartDate().toString(fmt));
	}
	
	// test getModules() method
	@Test
	public void testGetModules() {
		assertArrayEquals(eceModules, ece.getModules());
	}
	
	// test course toString() method
	@Test
	public void testToString() {
		assertEquals("Course Name: ECE"
				+ "\nStart Date: 28/09/2020"
				+ "\nEnd Date: 02/06/2021"
				+ "\nModules:\n\nName: Software Engineering\nID: CT417"
				+ "\nStudents: John22, Mary22"  
				+ "\n\nName: Digital Signal Processing\nID: EE445"
				+ "\nStudents: Mary22, Partick25" , ece.toString());
	}

}
