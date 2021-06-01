package sef.module6.sample;

import sef.module6.activity.Employee_I;

public class VirtualMethodSample {
	public static void main(String arg[]){
		Person_P p = new Person_P();
		p.setName("John Doe");

		//Student inherits the methods and behavior from the Person class
		Student_P s = new Student_P();
		s.setName("Jane Doe");

		s.setSchool("A Fictional School");
		s.setGrade(10);

        Employee_P employee_p = new Employee_P();
        employee_p.setTitle("Programmer");
        employee_p.setSalary(10000);

		rollCall(s);
		rollCall(p);

	}

	public static void rollCall(Person_P temp){
			temp.announce();
	}
}
