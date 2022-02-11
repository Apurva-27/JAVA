package Inheritance;

abstract class student
{
	String name;
	
	public student(String name)//constructor
	{	
		super();
		this.name = name;
	}
	
	public void method()
	{
		System.out.println("abstract class in parent class");
	}
	abstract void display();
	
}

class user extends student
{
	public user(String name)
	{
		super(name);
	}
	
	@Override
	void display()
	{
		System.out.println("child user class display " +name);
		
	}

}

public class abstract_example {

	public static void main(String[] args) {
		
		user u =new user("raj");
		u.display();
		u.method();
	}

}

/*
child user class display raj
abstract class in parent class

*/