package oops;

public class boxingexample {

	public static void main(String[] args) {
		
		int a=50;
		
		Integer wrap = new Integer(a);    //boxing
		
		Integer a2 = 67;  //autoboxing 
		
		System.out.println(wrap+ " "+ a2);
		
		Integer a3=Integer.valueOf(a);//boxing
		System.out.println(a3);
	
	
	}

}
/*
50 67
50

*/