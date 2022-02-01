/*
 WAP to count the digit in number
 */

import java.util.*;

public class count_digit_in_num {

	public static void main(String[] args) {
		
		int n, count=1;
		
		 Scanner  sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number.");
		 n=sc.nextInt();
		 
		 while(n>=10)
		 {
			n = n/10;
			count++;
		 }
		 
		 System.out.println("Digit in the number."+count);
	}

}


/*
Enter the number.
1
Digit in the number.1

Enter the number.
2365
Digit in the number.4

*/