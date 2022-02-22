package Array;

import java.util.Scanner;

public class AdditionOfTwoD {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int result[][]=new int[3][3];
		
		int i=0, j=0;
		
		//intializing b array
		System.out.println("Enter elements in a array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}	
			
		}//for a
		
		System.out.println("Elements in 'a'=");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}//elements in a
		
		//intializing b array
		System.out.println("Enter elements in b array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				b[i][j]=sc.nextInt();
			}	
			
		}//for b
		
		System.out.println("Elements in 'b'=");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}//elements in b
		
		//Addition of array
		System.out.println("Addition of a and b array.");
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				result[i][j]=a[i][j]+b[i][j];
			}	
		}//result
		
		System.out.println("Result of 'a' and 'b'");
		
		for(i=0; i<3;i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println();
		}//result
	}

}
