package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Student;

public class Tests {
	
	@Test
	public void testGetUsername() {
		Student james = new  Student("James", "22", "110698", "17358875");
		assertEquals("James22", james.getUsername());
	}
}
