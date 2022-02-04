
import java.util.*;

public class strong_num {
	
	public static int fact(int num)
	{
		int fact=1, i;
		for(i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {


		int n, fact;
		int sum=0;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number.");
		 n=sc.nextInt();
		 int temp=n;
		 while(n>0)
		 {
			int r= n%10;
			fact=fact(r);
		 sum=sum+fact;
		 n=n/10;
		 }	 
		
		 if(temp==sum)
		 {
			 System.out.println(temp+  " is strong number.");
		 }
		 else
		{
			 System.out.println(temp+" is not strong number.");
		}
	}
}
