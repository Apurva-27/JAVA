package Array;

import java.util.*;

public class ArrayExample {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int i;
		//compile time initializing arry e.g
		int arr[]= {2,3,4,5,6};
		
		int arr1[]= new int[5];
		arr1[0]=5;
		arr1[1]=6;
		arr1[2]=7;
		arr1[3]=8;
		arr1[4]=9;
		
		System.out.print("\nEnter Size of the array:");
		int N = sc.nextInt();
		int arr2[]=new int[N];		
		//OR
		System.out.print("\nEnter "+N+"in Array;");
		for(int k=0; k<N; k++)
		{
			arr2[k]=sc.nextInt();	
		}
		
		//traversing array
		System.out.print("\n"+arr[1]);	//3
		
		for(i=0; i<5; i++)
		{
			System.out.print("\n"+arr1[i]);	
		}
		
		//for each loop
		//for(datatype variable:array) {sout(variable);}
		for(int j:arr1)
		{
			System.out.print("\n"+j);
		}
	}

}
