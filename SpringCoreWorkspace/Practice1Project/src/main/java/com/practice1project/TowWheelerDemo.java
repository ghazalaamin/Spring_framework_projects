package com.practice1project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TowWheelerDemo {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("beans.xml");
		Scooty scooty=(Scooty) appContext.getBean("scooty");
		//CommonFeatureClass scomm= (CommonFeatureClass) appContext.getBean("seetbelt");
		
		scooty.getEngine();
		scooty.getAccelator();
		scooty.getbreak();
	
		scooty.getseetBelt();
		System.out.println(scooty);
		

	}

}
