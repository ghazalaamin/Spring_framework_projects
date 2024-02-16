package com.properties;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
       System.out.println("class loaded");
       JDBCProperty jdbc=(JDBCProperty) ap.getBean("jdbcObj");
       System.out.println(jdbc);
        Connection con=jdbc.getConnections();
        con.close();
       
       
       
	}

}
