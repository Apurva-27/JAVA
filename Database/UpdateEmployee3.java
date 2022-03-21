package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateDataEmployee {

	public static void main(String[] args) {
		try {
			
			Connection conn = ConnectionDb.connectDb();
			
			//create statement
			Statement stmt = conn.createStatement();
			
			//create query
			String query="update emp set ename='ajith',sal=45000 where eid=101";
			
			int row=stmt.executeUpdate(query);
			
			System.out.println(row+" Record updated Sucessfully....");
			
			}//try
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}

}
