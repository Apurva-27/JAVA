import java.util.*;

class rectangle_area_perimeter
{
	public static void main(String args[])
	{
		float length , width , perimeter ,area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter length of rectangle:");
		length = sc.nextInt();
		
		System.out.println("\nEnter width of rectangle:");
		width = sc.nextInt();
		
		perimeter=2*(length+width);
		area=(length*width);
		
		System.out.println("\nPerimeter of rectangle is="+perimeter);
		System.out.println("\nArea of rectangleis="+area);
	}
}

/*

E:\Apurva\marevellous\java>javac rectangle_area_perimeter.java

E:\Apurva\marevellous\java>java rectangle_area_perimeter
Enter length of rectangle:

6
Enter width of rectangle

4

Perimeter of rectangle is=20.0

Area of rectangleis=24.0

E:\Apurva\marevellous\java>

*/