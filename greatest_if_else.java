/*
Accept two numbers from user and find greatest number  
*/

import java.util.*;

class greatest_if_else
{
	public static void main(String args[])
	{
		int num1 ,num2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Enter number1 is greater number="+num1);
		}
		else
		{
			System.out.println("Enter number2 is greater number="+num2);
		}
		
	}
}