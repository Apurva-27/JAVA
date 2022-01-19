import java.util.*;

class circle
{
	public static void main(String args[])
	{
			double radius, circumference, area_of_circle;
			double pi=3.14;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nEnter radius of circle=");
			radius=sc.nextDouble();
			
			circumference = 2*pi*radius;
			area_of_circle =pi*radius*radius;
			
			System.out.println("\nCicumference of circle is="+circumference);
			System.out.println("\nArea of circle is="+area_of_circle);
	}
}

/*

E:\Apurva\marevellous\java>javac circle.java

E:\Apurva\marevellous\java>java circle

Enter radius of circle=
6

Cicumference of circle is=37.68

Area of circle is=113.03999999999999

E:\Apurva\marevellous\java>

*/