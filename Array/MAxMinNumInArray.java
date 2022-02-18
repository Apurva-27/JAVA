package Array;

import java.util.Scanner;

public class MAxMinNumInArray {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int arr[];
		
		System.out.print("\nEnter Size of the array:");
		int size = sc.nextInt();
		arr=new int[size];
		
		System.out.print("\nEnter "+ size +" array:");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}//for
		
		System.out.print("\nElements in array are: ");
		for(int i:arr)
		{
			System.out.print("\n"+i);
		}
		
		//MAX
		System.out.print("\nFor Maximum");
		int max=arr[0];
		
		for(int j=1; j<size; j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		System.out.print("\nMaximum element in array is:"+max);
	
		//MIN
		System.out.print("\nFor Minimum");
		int min=arr[0];	//{0:5,1:4,2:9,3:7,4:2}
		for(int k=1; k<size; k++)
		{
			if(arr[k]<min) //1
			{
				min=arr[k];//4,2
			}
		}
		System.out.print("\nMinimum element in array is:"+min);//2
		
	}//main

}//class
