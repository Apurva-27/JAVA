/*
1) Write a function in java to find the factorial in class perfect and then 
call that function from main woith in anotheer clss  
*/

package oops;

import java.util.*;

class calculation
{
	public int perfect(int num)
	{
		
		int i=1, sum=0, fact;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==num)
		{
			fact=factorial(num);
			return fact;
		}
		else
		{
			return -1;
		}
	}//perfect
	
	public int factorial(int num)
	{
		int fact=1, j;
		
		for(j=1; j<=num; j++)
		{
			fact=fact*j;
		}
		return fact;
	}
	
}

public class perfect_fact {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
			
		System.out.println("Enter number:");
		int num=sc.nextInt();
	
		calculation ocal=new calculation();
	
		int facto=ocal.perfect(num);
		if( facto!=-1)
		{
			System.out.println("Factorial is: "+facto);
		}
		else
		{
			System.out.println(facto);
		}
	}

}
