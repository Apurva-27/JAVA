package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;

public class InsertDataInEmployee {

	public static void main(String[] args) {
		try {
			
		Connection conn = ConnectionDb.connectDb();
		
		//create statement
		Statement stmt = conn.createStatement();
		
		//create query
		String query="insert into emp values(101,'manikandan',5000,'chennai')";
		
		int row=stmt.executeUpdate(query);
		
		System.out.println(row+" Record inserted Sucessfully....");
		
		}//try
		
		catch(Exception e)
		{
			
		}
	}

}
