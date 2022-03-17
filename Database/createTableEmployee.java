package com.jdbc;


import java.sql.Statement;
import java.sql.Connection;

public class createTableEmployee {

	public static void main(String[] args) {
		Connection conn=null;
		try 
		{
			ConnectionDb.connectDb();
			
			//System.out.println(conn);
			//create statement
			Statement stmt = conn.createStatement();
			
			//create query
			String query="create table emp(eid int primary key,ename varchar(50), sal int, empadd varchar(100))";
			
			//execute query
			stmt.executeUpdate(query);
			
			System.out.println("Table Created Successfully");
			
			//close connection
			conn.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
