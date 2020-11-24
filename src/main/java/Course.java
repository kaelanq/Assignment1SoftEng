package main.java;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import main.java.Module;

public class Course {

	private String name;
	private Module[] modules;
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String name, DateTime startDate, DateTime endDate, Module[] modules) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modules = modules;
	}
	
	public  Module[] getModules() {
		return modules;
	}
	
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
		return "Course Name: " + name + 
				"\nStart Date: " + startDate.toString(fmt) + 
				"\nEnd Date: " + endDate.toString(fmt) +
				"\nModules:\n\n" + modules[0] + "\n\n" + modules[1]; 
	}
}