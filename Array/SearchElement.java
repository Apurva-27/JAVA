package Array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

Scanner sc =  new Scanner(System.in);
		
		int arr[];
		int i=0, j=0, flag=0;
		
		System.out.print("\nEnter Size of the array:");
		int size = sc.nextInt();
		arr=new int[size];
		
		System.out.print("\nEnter "+ size +" array:");
		for(i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}//for
		
		System.out.print("\nElements in array are: ");
		for(int k:arr)
		{
			System.out.print("\n"+k);
		}//for
		
		System.out.print("\nElement to search in array: ");
		int element=sc.nextInt();
		
		for( j=0; j<size; j++)
		{
			if(arr[j]==element)
			{
				flag=1;
				break;
			
			}	//if
			else
			{
				flag=0;
			
			}

		} //for
		if(flag==1)
		{
			System.out.println("\nElement "+element+" present at "+(j+1)+" position.");
		}
		else
		{
			System.out.println("\nElement is not present array.");
		}	
	}
}


/*

Enter Size of the array:5

Enter 5 array:96
58
25
36
12

Elements in array are: 
96
58
25
36
12
Element to search in array: 3

Element is not present array.


*/