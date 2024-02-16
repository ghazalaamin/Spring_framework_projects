package com.springLiteralDI;

public class Student {

   private String studentName;
   
   
	/*
	 * Used in setter injection
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */
     
   


	public void getExamTicket() {
		System.out.println("I "+studentName+" Got Exam ticket");
	}


	public Student(String studentName) {
		this.studentName = studentName;
	}
	
}
