package main.java;

import main.java.Student;

public class Module {

	// instance variables
	private String name;
	private String ID;
	private Student[] students;
	
	// constructor
	public Module(String name, String iD, Student[] students) {
		this.name = name;
		ID = iD;
		this.students = students;
	}

	// getters and setters
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	// toString() method
	public String toString() {
		return "Name: " + name + "\nID: " + ID +
				"\nStudents: " + students[0].getUsername() + ", " + students[1].getUsername();
	}
}
