import java.util.*;

class arithmatic_operators
{
	public static void main(String args[])
	{
		float n1,n2,result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers\n");
		
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		
		result=n1+n2;
		System.out.println("\n This is addition=" +result);
		
		result=n1-n2;
		System.out.println("\n This is subtraction=" +result);
		
		result=n1*n2;
		System.out.println("\n This is multiplication=" +result);
		
		result=n1/n2;
		System.out.println("\n This is devision=" +result);

	}
}

/*

E:\Apurva\marevellous\java>javac arithmatic_operators.java

E:\Apurva\marevellous\java>java arithmatic_operators
Enter two numbers

6
3

 This is addition=9.0

 This is subtraction=3.0

 This is multiplication=18.0

 This is devision=2.0

E:\Apurva\marevellous\java>

*/