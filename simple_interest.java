import java.util.*;

class simple_interest
{
	public static void main(String args[])
	{
		float p, r, n, simple_interest;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter principal amount:");
		p=sc.nextFloat();
		
		System.out.println("\nEnter time period:");
		n=sc.nextFloat();
		
		System.out.println("\nEnter rate of interest:");
		r=sc.nextFloat();
		
		simple_interest = (p*r*n)/100;
		
		System.out.println("\nSimple interest is="+simple_interest);
	}
}

/*
E:\Apurva\marevellous\java>javac simple_interest.java

E:\Apurva\marevellous\java>java simple_interest

Enter principal amount:
1000

Enter time period:
1

Enter rate of interest:
5

Simple interest is=50.0

E:\Apurva\marevellous\java>
*/