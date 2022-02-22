package Array;

import java.util.Scanner;

public class mergeArrayOneD {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		int i, k=5;
		
		int first[]=new int[5];
		int second[]=new int[5];
		int result[]=new int[10];
		
		System.out.print("First Array");
		for(i=0; i<5; i++)
		{
			first[i]=sc.nextInt();
		}
		
		System.out.print("Second Array");
		for(i=0; i<5; i++)
		{
			second[i]=sc.nextInt();
		}
		
		System.out.print("Result Array ");
		for(i=0; i<5; i++)
		{
			result[i]=first[i];
			
			
		}
		
		for(i=0; i<5; i++)
		{
			result[k]=second[i];
			k++;
			
		}
	
		//System.out.print("Mearge array ");
		for(i=0;i<10;i++ )
		{
			System.out.print(result[i]+" ");
		}

	}

}
