package com.SimpleDI;

public class Student {
	
	private String studentName;
	

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}


	public void getExamTicket() {
		System.out.println("Ready for examination,My name is "+studentName);
	}

}
