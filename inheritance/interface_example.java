package Inheritance;

interface demo
{
	void method1(); 
	void method2();
}

interface demo1
{
	void method3();

}

class XYZ implements demo,demo1
{
	public void method1()
	{
		System.out.println("In method1");
	}
	
	public void method2()
	{
		System.out.println("In method2");
	}

	public void method3()
	{
		System.out.println("In method3");
	}

}

public class interface_example {

	public static void main(String[] args) {
				XYZ obj = new XYZ();
				
				obj.method1();
				obj.method2();
				obj.method3();
	}

}
/*

->interface is a collection of abstract class
->means we can achive 100% abstraction by it
->interface are by default abstract (dont need to define abstract)
->variable declare ainan interface are public static 
	& final(constatnt) by default
->methods in interface do not have body, the implementated 
	by class before you can acces them
->every method in interface should be implemented 
->

OUTPUT
In method1
In method2
In method3

*/