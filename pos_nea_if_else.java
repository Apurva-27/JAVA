/*
Accept two numbers from user and check it is positive or negative  
*/

import java.util.*;

class pos_nea_if_else
{
	public static void main(String args[])
	{
		int num;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number:");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Enter number is positive.");
		}
		else
		{
			System.out.println("Enter number negative.");
		}
		
	}
}