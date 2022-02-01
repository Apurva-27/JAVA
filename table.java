
import java.util.*;

public class table {

	public static void main(String[] args) {
	 int i, n ;
	 
	 Scanner  sc= new Scanner(System.in);
	 
	 System.out.println("Enter the number to print table.");
	 n=sc.nextInt();
	 
	 for(i=1; i<=10; i++)
	 { 
	   System.out.println(n+"*"+i+"="+(n*i));	 
	 }
	}

}
