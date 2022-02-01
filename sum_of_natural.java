 /*wapto findsum ofnatural number
 n=5 1+2+3+4+5+=15
 */

import java.util.*;
 
public class sum_of_natural {

	public static void main(String[] args) {
		
		int i, n, sum=0;	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number to print sum of natural number till that number.");
		n=sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
			sum= sum + i;
			
		}
		
		System.out.println("Sum of natural number is="+sum);
	}

}

/*
Enter number to print sum of natural number till that number.
5
Sum of natural number is=15

*/