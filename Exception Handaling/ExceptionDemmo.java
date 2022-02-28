package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st value");
		a=sc.nextInt();

		System.out.println("Enter 2nd value");
		b=sc.nextInt();
		
		try
		{
			int c=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
				//or
			System.out.println("Exception occurs");
				//or
			e.printStackTrace();
		}
		
		System.out.println("End Code");
	
		
	}

}


/*
	OUTPUT
Enter 1st value
12
Enter 2nd value
0
/ by zero
java.lang.ArithmeticException: / by zero
Exception occurs
End Code
	at ExceptionHandling.ExceptionDemo.main(ExceptionDemo.java:21)
*/
