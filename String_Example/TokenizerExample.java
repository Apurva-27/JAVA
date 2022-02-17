package StringHandaling;

import java.util.StringTokenizer;

public class TokenizerExample {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("Welcome, to, java, world"," ");
		
		/*while(st.hasMoreTokens())
		{
			System.out.print("\n"+st.nextToken());
		}*/
	
		/* 
		String s= st.nextToken(",").toUpperCase();	//uppercase
		System.out.println(s);
	    */
		
		/*
		while(st.hasMoreElements())
		{
			System.out.print("\n"+st.nextElement());
		}
		*/
		System.out.print("\nTotal count of token:"+st.countTokens());
	
	}
}
