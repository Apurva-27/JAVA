import java.util.*;

class basic_info
{
	public static void main(String args[])
	{
		float per;
		String Name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Your Name:");
		Name=sc.nextLine();
		
		System.out.println("\nEnter Your Percentage:");
		per=sc.nextFloat();
		
		System.out.println("\nName is:"+Name);
		System.out.println("\nPercentage are:"+per);
		
	}
}

/*
E:\Apurva\marevellous\java>javac basic_info.java

E:\Apurva\marevellous\java>java basic_info

Enter Your Name:
Apurva

Enter Your Percentage:
89

Name is:Apurva

Percentage are:89.0

*/
