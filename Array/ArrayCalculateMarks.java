//enter marks of 5 subjects in an array
//nd calculate total of the marks

package Array;

import java.util.*;

public class ArrayCalculateMarks {

	public static void main(String[] args) {
		int i, sum=0;
		int arr[]=new  int[5]; 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter marks for 5 subject: "); 
		
		for(i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("\nSum of 5 subject marks: "+sum); 
		
		
	}//main

}//class
