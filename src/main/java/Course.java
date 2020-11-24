package main.java;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import main.java.Module;

public class Course {

	// instance variables
	private String name;
	private Module[] modules;
	private DateTime startDate;
	private DateTime endDate;
	
	// constructor
	public Course(String name, DateTime startDate, DateTime endDate, Module[] modules) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modules = modules;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public  Module[] getModules() {
		return modules;
	}

	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	// toString() to print required info
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
		return "Course Name: " + name + 
				"\nStart Date: " + startDate.toString(fmt) + 
				"\nEnd Date: " + endDate.toString(fmt) +
				"\nModules:\n\n" + modules[0] + "\n\n" + modules[1]; 
	}
}