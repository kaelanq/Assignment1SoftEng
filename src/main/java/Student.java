package main.java;

public class Student {

		// instance variables
		private String name;
		private String age;
		private String DOB;
		private String ID;
		
		// constructor
		public Student(String name, String age, String DOB, String ID) {
			this.name = name;
			this.age = age;
			this.DOB = DOB;
			this.ID = ID;
		}
		
		// getters and setters
		// set username to name concat. age and return 
		public String getUsername() {
			return name + age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getDOB() {
			return DOB;
		}

		public void setDOB(String dOB) {
			DOB = dOB;
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}
		
		// toString() method
		public String toString() {
			return getUsername();
		}
		
		
} 
