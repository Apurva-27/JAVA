package Inheritance;

interface Ab
{
	void Dis1();
}

interface Bb extends Ab
{
	void Dis2();
}

interface Cb extends Ab
{
	void Dis3();
}

class Db implements Bb,Cb
{
	public void Dis1()
	{
		System.out.println(" Dis1");
	}

	@Override
	public void Dis3() 
	{
		System.out.println(" Dis3");
	}

	@Override
	public void Dis2() 
	{
		System.out.println(" Dis2");
		
	}
}

public class hybridexmple {

	public static void main(String[] args) {
	 
			Db obj =new Db();
			obj.Dis1();
			obj.Dis2();
			obj.Dis3();
	}
}
