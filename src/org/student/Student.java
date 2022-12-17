package org.student;

import org.department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		
		Student obj = new Student();
		
		//Methods from college class in org.College Package
		System.out.println("College Name is:"+" "+ obj.collegeName());
		System.out.println("College Code is:"+" "+obj.collegeCode());
		System.out.println("College Rank is:"+" "+obj.collegeRank());
		
		//Methods from Department class in org.department Package
		System.out.println("College Department is:"+" "+obj.deptName());
		
		//Methods from Student class in org.student Package
		System.out.println("Student Name is:"+" "+obj.studentName());
		System.out.println("Student Department is:"+" "+obj.studentDept());
		System.out.println("Student Id is:"+" "+obj.studentId());
		
	}
	
	
	//Methods in class
	private String studentId() {
		
		return "714017106022";
	}



	private String studentDept() {
		
		return "Electronic and communication Engineering";
	}



	
	public String studentName() {
		return "Ramya";
	}
	

}
