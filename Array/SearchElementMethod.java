package Array;

import java.util.Scanner;

public class SearchElementMethod {

	public static int Search(int arr[],int search)
	{
		int i, pos=-1;
		boolean f= false;
		
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]==search)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}//search
	
	public static void main(String[] args) {
	
		int search, n, arr[], i , pos;
		Scanner sc =  new Scanner(System.in);
		System.out.print("\nEnter Size of the array:");
		 n = sc.nextInt();
		 arr=new int[n];
			
			
			System.out.print("\nEnter "+ n +" array:");
			for(i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
			}//for
			
			System.out.print("\nElements in array are: ");
			for(int k:arr)
			{
				System.out.print("\n"+k);
			}//for
			
			//search
			System.out.print("\nElement to search in array: ");
			search=sc.nextInt();
			
			pos=Search(arr,search);
			if(pos != -1)
			{
				System.out.println("\nElement "+search+" present at "+(pos)+" position.");
			}
			else
			{
				System.out.println("\nElement is not present.");
			}
		
	}

}
