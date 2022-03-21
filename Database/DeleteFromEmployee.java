package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;


public class DeleteFromEmployee {

	public static void main(String[] args) {
		try {
			
			Connection conn = ConnectionDb.connectDb();
			
			//create statement
			Statement stmt = conn.createStatement();
			
			//create query
			String query="delete from emp where eid=101";
			
			int row=stmt.executeUpdate(query);
			
			System.out.println(row+" Record deleted Sucessfully....");
			
			}//try
			
			catch(Exception e)
			{
				
			}
	}

}
