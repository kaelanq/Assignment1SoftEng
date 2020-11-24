package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Student;

public class StudentTest {
	
	@Test
	public void testGetUsername() {
		Student james = new  Student("James", "22", "110698", "17358875");
		assertEquals("James22", james.getUsername());
	}
}
