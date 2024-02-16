package com.SimpleDI;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1st way to set the dependency for class student is making the "object" and 
		 * setting the values if the property is not private*/ 
		
		/*
		 * Student stu=new Student();
		 * stu.studentName="Ghazala Amin";
		 * stu.getExamTicket();
		 */
		
		
		/* =================================================================== */
		
		
		/*
		 * 2nd If property is private we can use "setter" injection but will
		 * be tightly coupled
		 */
		/*
		 * Student stu=new Student(); stu.setStudentName("Ghazala Amin");
		 * stu.getExamTicket();
		 */
		
		
		/* ======================================================================= */
		
		
		 /*
		 * 3rd If property is private we can use "constructor" injection but will
		 * be tightly coupled
		 */
		  Student stu=new Student("Ghazala Amin");
		  stu.getExamTicket();
		  
		  
		
	}

}
