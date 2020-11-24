package main;

public class Student {

		private String name;
		private String age;
		private String DOB;
		private String ID;
		private String modules;
		
		public Student(String name, String age, String DOB, String ID) {
			this.name = name;
			this.age = age;
			this.DOB = DOB;
			this.ID = ID;
		}
		
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

		public String getModules() {
			return modules;
		}

		public void setModules(String modules) {
			this.modules = modules;
		}
		
		public String toString() {
			return getUsername();
		}
		
		
} 
