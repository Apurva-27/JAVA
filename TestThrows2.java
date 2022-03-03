package ExceptionHandling;

import java.io.*;  

class Mm
{  
	 void method()throws IOException
	 {  
		 System.out.println("device operation performed");  
	 }  
}  

public class TestThrows2 {

	public static void main(String[] args)throws IOException {
	
	     Mm m=new Mm();  
	     m.method();  
	  
	    System.out.println("normal flow...");  

	}

}
/*

OUTPUT

device operation performed
normal flow...
*/