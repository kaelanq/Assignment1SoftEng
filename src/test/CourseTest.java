package test;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

import main.Course;
import main.Module;
import main.Student;

public class CourseTest {

	@Test
	public void test() {
		Student james = new  Student("James", "22", "110698", "17358875");
		Student eoghan = new Student("Eoghan", "22", "020998", "17373344");
		Student michael = new Student("Michael", "25", "160795", "14457685");
		
		Student[] softEngStudents = {james, eoghan};
		Student[] dspStudents = {eoghan, michael};

		Module softEng = new Module("Software Engineering", "CT417", softEngStudents);
		Module dsp = new Module("Digital Signal Processing", "EE445", dspStudents);
	
		Module[] eceModules = {softEng, dsp};
		
		DateTime startDate = new DateTime(2020, 9, 28, 0, 0);
		DateTime endDate = new DateTime(2021, 6, 2, 0, 0);
		
		Course ece = new Course("ECE", startDate, endDate, eceModules);
		
		assertArrayEquals(eceModules, ece.getModules());
	}

}
