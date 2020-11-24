package main;

import main.Student;

public class Module {

	private String name;
	private String ID;
	private Student[] students;
	
	public Module(String name, String iD, Student[] students) {
		this.name = name;
		ID = iD;
		this.students = students;
	}

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
	
	public String toString() {
		return "Name: " + name + "\nID: " + ID +
				"\nStudents: " + students[0].getUsername() + ", " + students[1].getUsername();
	}
}
