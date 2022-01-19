import java.util.*;

class opt_demo
{
	int result;
		public void addition(int n1,int n2)
		{
			result =n1 + n2;
			
			System.out.println("\nAddition of two nubers is:"+result);
		}
		
		public void subtraction(int n1, int n2)
		{
			if(n1>n2)
			{
				result=n1-n2;
				System.out.println("\nSubtraction of two nubers is:"+result);
			}	
			else
			{
				System.out.println("\nInvalid input for subtraction.");
			}
		}
		
		public void multiplication(int n1, int n2)
		{
			result=n1*n2;
			System.out.println("\nMultiplication is:"+result);
		}
		
		public void devision(int n1, int n2)
		{
				if(n1>n2)
			{
				result=n1/n2;
				System.out.println("\nDevision of two nubers is:"+result);
			}	
			else
			{
				System.out.println("\nInvalid input for devision.");
			}
		}
		
		
	public static void main(String arg[])
	{
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two nubers:\n");
				
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		
		opt_demo obj = new opt_demo();	
		obj.addition(n1,n2);
		obj.subtraction(n1,n2);
		obj.multiplication(n1,n2);
		obj.devision(n1,n2);
	}
	
}

/*
E:\Apurva\marevellous\java>java opt_demo
Enter two nubers:

6
3

Addition of two nubers is:9

Subtraction of two nubers is:3

Multiplication is:18

Devision of two nubers is:2

E:\Apurva\marevellous\java>java opt_demo
Enter two nubers:

3
6

Addition of two nubers is:9

Invalid input for subtraction.

Multiplication is:18

Invalid input for devision.

E:\Apurva\marevellous\java>
*/
