/*
 WAP for perfet number
 */

import java.util.*;

public class perfect_num {

	public static void main(String[] args) {
		
		int n, i=1, sum=0;
		
		 Scanner  sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number.");
		 n=sc.nextInt();
		 
		 while(i<=n/2)
		 {
			 if(n%i==0)
			 {
				 sum = sum+i;
			 }
			 i++;
		 }
		 
		 if(sum==n)
		 {
			 System.out.println("Enter the number is perfect number.");
		 }
		 else
		 {
			 System.out.println("Enter the number is not perfect number.");
		 }
		 
	}

}

/*

Enter the number.
6
Enter the number is perfect number.

Enter the number.
7
Enter the number is not perfect number.

*/