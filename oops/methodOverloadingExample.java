package oops;

class A
{
	public int add(int a, int b)
	{
		return (a+b);
	}
	
	public void add(int x, int y, int z)
	{
		System.out.println("Addition value: "+(x+y+z));
	}
	
	public double add(double p, int q)
	{
		return (p+q);
	}
	
	public double add(int m, double n)
	{
		return (m+n);
	}
}



public class methodOverloadingExample {

	public static void main(String[] args) {
		
		A obj =new A();
		obj.add(2, 3, 4);
		System.out.println(obj.add(2.3, 3));
	}

}
