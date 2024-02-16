package com.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCProperty {
	
	@Value("${jdbcObj.driver}")
	private String driver;
	
	@Value("${jdbcObj.url}")
	private String url;
	
	@Value("${jdbcObj.password}")
	private String password;
	
	@Value("${jdbcObj.username}")
	private String username;
	
	
	@Override
	public String toString() {
		return "JDBCProperty [driver=" + driver + ", url=" + url + ", password=" + password + ", username=" + username
				+ "]";
	}
	
	public Connection getConnections() throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection con= DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established "+con);
		return con;
	}
	
	

}
