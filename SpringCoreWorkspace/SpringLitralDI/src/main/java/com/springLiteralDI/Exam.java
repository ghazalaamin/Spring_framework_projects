package com.springLiteralDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
       Student stu= (Student) ap.getBean("stu");
       
		/* ========================================================================= */
       
		/*
		 * 1st If the property is not private you can directly assign the value to it.
		 */
		/*
		 * stu.studentName="Ghazala Amin"; stu.getExamTicket();
		 */
       
		/* ========================================================================= */
        /*
		 * 2nd If the property is private ,you can use setter injection to set the
		 *  property using xml.
		 */
		/* stu.getExamTicket(); */
       
		/*
		 * ============================================================================
		 */
        /*
		 * 3rd If the property is private ,you can use constructor injection to set the
		 *  property using xml.
		 */
          stu.getExamTicket();
          
       
       
       
	}

}
