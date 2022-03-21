package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDataEmployee {

	public static void main(String[] args) {
		try {
			
			Connection conn = ConnectionDb.connectDb();
						
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Emp name:");
			String empname=sc.nextLine();
			
			System.out.println("Enter Emp salary:");
			int empsal=sc.nextInt();
					
      //create query************************
			String query="update emp set ename='"+empname+"',sal="+empsal+" where eid=?";
			
			PreparedStatement ps =conn.prepareStatement(query);
			
      System.out.println("Enter Emp id:");
			int empid=sc.nextInt();
			ps.setInt(1,empid);
			
			int row=ps.executeUpdate();
			
			System.out.println(row+" Record updated Sucessfully....");
			
			}//try
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}

}
