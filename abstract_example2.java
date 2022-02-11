package Inheritance;

abstract class bannk
{
	abstract void getInterestRate();

}

class city extends bannk
{

	@Override
	void getInterestRate() {
		System.out.println("In child city class interest = 2%");		
	}

}
/*
****************************************************************
*/


abstract class shape
{
	
	abstract void draw();
	
}

class rectangle extends shape
{

	@Override
	void draw() {
			System.out.println("draw rectanle");		
	}
		

}

class circle extends shape
{

	@Override
	void draw() {
		System.out.println("draw circle");		
		
	}
		
}

public class abstract_example2 {

	public static void main(String[] args) {
		
		rectangle r=new rectangle();
		r.draw();
		
		circle c = new circle();
		c.draw();
		
		city b1 = new city();
		b1.getInterestRate();
	}

}


/*
draw rectanle
draw circle
In child city class interest = 2%
*/