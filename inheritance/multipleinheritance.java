package Inheritance;

interface A
{
	 void Display(); //abstract method
}

interface B extends A
{
	void Display();
	
}

interface C 
{
	void Display();
}
 
class D implements B,C
{
	public void Display()
	{
	System.out.println(" multuple inheritance");
	}

}

public class multipleinheritance {

	public static void main(String[] args) {
		
		D cobj = new D();
		cobj.Display();
		
	}

}
/*

B EXTENDS->A
D EXTENDS -> B & C
**/