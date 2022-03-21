package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDataEmployee {

	public static void main(String[] args) {
		try {
			
			Connection conn = ConnectionDb.connectDb();
			
			//create statement
			Statement stmt = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Emp name:");
			String empname=sc.nextLine();
			
			System.out.println("Enter Emp salary:");
			int empsal=sc.nextInt();
			
			
			String query="update emp set ename='"+empname+"',sal="+empsal+" where eid=101";
			
			//create query
			/*String query="update emp set ename='ajith',sal=45000 where eid=101";
			*/
			int row=stmt.executeUpdate(query);
			
			System.out.println(row+" Record updated Sucessfully....");
			
			}//try
			
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}

}
