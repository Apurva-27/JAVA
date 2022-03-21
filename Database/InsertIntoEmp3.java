package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertIntoEmp3 {

	public static void main(String[] args) {
		
		try {
			
			Connection conn = ConnectionDb.connectDb();
						
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Emp id:");
			int empid=sc.nextInt();
					
			sc.nextLine();	
			System.out.println("Enter Emp name:");
			String empname=sc.nextLine();
		
			System.out.println("Enter Emp salary:");
			int empsal=sc.nextInt();
			
			sc.nextLine();	
			System.out.println("Enter Emp city:");
			String empcity=sc.nextLine();
						
			
			String query="insert into emp values(?,?,?,?)";
			PreparedStatement ps =conn.prepareStatement(query);		
			
			ps.setInt(1,empid);
			ps.setString(2, empname);
			ps.setInt(3,empsal);
			ps.setString(4, empcity);
			
			int row=ps.executeUpdate();
			System.out.println(row+" Record inserted Sucessfully....");
			
			
	}
	catch(Exception e)
	{
		System.out.println("Record present...");
	}

	}//main
}