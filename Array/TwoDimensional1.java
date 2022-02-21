package Array;

import java.util.Scanner;

public class TwoDimensional1 {

	public static void main(String[] args) {
		//declaration and initialization at compile time
		Scanner sc =  new Scanner(System.in);
		int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]);
			}	
			System.out.println();
		}
		
		System.out.println();
		//Run time Declaration
	
		int a[][]=new int[2][3];
		System.out.println("In matrix 2*3");
		for(int i=0; i<2;i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt(); 
			}	
			System.out.println();
		}
		//print Array
		
		for(int i=0; i<2;i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		
	}//main

}
