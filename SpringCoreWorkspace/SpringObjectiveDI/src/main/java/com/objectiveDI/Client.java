package com.objectiveDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		Airtel airtel=(Airtel) ap.getBean("airtel");
		airtel.getService();
		
		
	}

}
