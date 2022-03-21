package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertIntoEmp2 {

	public static void main(String[] args) {
		
		try {
			
			Connection conn = ConnectionDb.connectDb();
			
			//create statement
			Statement stmt = conn.createStatement();
			
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
			
			//create query
			String query="insert into emp values("+empid+",'"+empname+"',"+empsal+",'"+empcity+"')";
			
			int row=stmt.executeUpdate(query);
			
			System.out.println(row+" Record inserted Sucessfully....");
			
			}//try
			
			catch(Exception e)
			{
				
			}
		
	}//main

}//class
