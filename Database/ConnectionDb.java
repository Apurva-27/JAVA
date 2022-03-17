package com.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class ConnectionDb {

	static Connection conn=null;
	public static Connection connectDb()
	{
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","password");

		}
		catch(Exception e)
		{
			
		}
		return conn;
	}
	
	
}
