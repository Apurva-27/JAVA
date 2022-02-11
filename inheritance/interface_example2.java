/*
	INTERFACE extends another INTERFACES
*/

package Inheritance;

interface demo
{
	void method1(); 
	void method2();
}

interface demo1 extends demo
{
	void method3();

}

class XYZ implements demo1
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


public class interface_example2 {

	public static void main(String[] args) {
		
		XYZ obj = new XYZ();
		
		obj.method1();
		obj.method2();
		obj.method3();
	}

}


/*
==========OUTPUT================
In method1
In method2
In method3

*/