import java.util.*;

public class natural_num_reverse {

	public static void main(String[] args) {
	
		int i, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range to print natural number.");
		n=sc.nextInt();
		
		for(i=n; i>=1; i--)
		{
			System.out.println(i);
		}
	}

}
