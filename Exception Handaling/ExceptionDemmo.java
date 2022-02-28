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
			System.out.println(e);
		}
		
		System.out.println("End Code");
	
		
	}

}


/*
	OUTPUT
Enter 1st value
10
Enter 2nd value
0
java.lang.ArithmeticException: / by zero
End Code
*/
