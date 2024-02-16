package com.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* 1st way to get sim is to create object of that class
        If we want jio sim we need to create jio object
        But In this case if we want the other sim to use ,we need to change the source code
        To resolve this spring framework came into the picture.
		*/
		
		/*
		 * Jio jio=new Jio(); 
		 *   jio.calling(); 
		 *   jio.messaging();
		 */
		
		/* 2nd way to get object is using Web.xml file of IOC container 
		 * There are two type of IOC Container
		 *  1.BeanFactory
		 *  2.ApplicationContext
		 *  
		 *  The implementation class of ApplicationContext interface is 
		 *  ClassPathXmlApplicationContext.
		 *  
		 *  To get Bean we have getBean method which get the bean from the container 
		 *  and give it to you for further use.
		 *  
		 *  Now If you want to change the other sim in your phone you just need to change 
		 *  in XMl file don't need to touch the source code.
		 * */
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		  Sim sim=(Sim)ap.getBean("sim");
		  sim.calling();
		  sim.messaging();
		
	}

}
