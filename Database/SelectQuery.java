package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

public class SelectQuery {

	public static void main(String[] args) {
		
		try 
		{
			Connection conn = ConnectionDb.connectDb();
			String query = "select * from emp where eid=?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, 101);
			ResultSet rs =ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Emp id: "+rs.getInt(1));
				System.out.println("Emp name: "+rs.getString("ename"));
				System.out.println("Emp sal: "+rs.getInt(3));
				System.out.println("Emp city: "+rs.getString("ecity"));
			}
			
		}
		catch(Exception e)
		{
			
		}
	}

}
