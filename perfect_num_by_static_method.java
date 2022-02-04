import java.util.*;

public class perfect_num_by_static_method {

	public static int perfect(int num)
	{
		int i=1, sum=0;
		
		while(i<=num/2)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		if(perfect(n)==n)
		{	
			System.out.println(n+" is perfect number.");
		}
		else
		{
			System.out.println(n+" is not perfect num");
		}
		
	}
}
