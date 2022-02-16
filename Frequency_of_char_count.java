package StringHandaling;

import java.util.*;

public class Frequency_of_char_count {

	public static void main(String[] args) {
	
		String value;
		int i, count=0;
		char ch;
		char search;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence ");
		value = sc.nextLine();
		
		System.out.println("Enter charater to find count:");
		ch = sc.next().charAt(0);
		
		for(i=0; i<value.length(); i++)
		{
			if(value.charAt(i)==ch)
			{
				count++;
			}//if
		}//for
		System.out.println("Count of charater:"+count);
	}

}


/*
	OUTPUT
Enter sentence 
apurva
Enter charater to find count:
a
Count of charater:2

*/