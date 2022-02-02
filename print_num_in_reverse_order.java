/*
WAP to write number in reverse order
123-> 321
 */


import java.util.*;

public class print_num_in_reverse_order {

	public static void main(String[] args) {
		
		int n, reverse=0, remainder=0;
		
		Scanner  sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number.");
		 n=sc.nextInt();
		 
		 
		 while(n!=0)
		 {
			 remainder = n%10;
			 reverse = reverse*10 + remainder;
			 n=n/10;
			 
		 }
		 System.out.println("reverse number is="+reverse); 
	}

}

/*
Enter the number.
123
reverse number is=321
*/