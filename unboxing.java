package oops;

public class unboxing {

	public static void main(String[] args) {
		
		Integer in = new Integer(23);
		int i=in;   //auto-unboxing
		
		System.out.println(i);   //23

		Double d = new Double(45.6);
		double con = d; 

		System.out.println(con);     //45.6

	}

}
