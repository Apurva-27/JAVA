/*
WAP to accept a no from user if no is divisible by 5 then display the cube
*/

import java.util.*;

class cube
{
	public static void main(String args[])
	{
		int num,result;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number:");
		num = sc.nextInt();
		
		if(num%5==0)
		{
			result=(num*num*num);
			System.out.println("Cube of number is="+result);
		}
		else
		{
			System.out.println("Enter proper number.");
		}
		
	}
}