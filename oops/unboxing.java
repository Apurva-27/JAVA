package oops;

public class unboxing {

	public static void main(String[] args) {
		
		Integer in = new Integer(23);//Integer in = Integer.valueof(23);
		int i=in;   //auto-unboxing
		
		System.out.println(i);   //23

		Double d = new Double(45.6);
		double con = d; 

		System.out.println(con);     //45.6

		Long l = new Long(12389);
		long log = l;
		
		System.out.println(log);	//123389

		Character ch = Character.valueOf('a');
		char c = ch;
		
		System.out.println(c);	// a
		
		String s = "5";
		Integer it =Integer.parseInt(s);
		
		System.out.println(it);	// 5
	
		Double d1 = Double.parseDouble(s);
		System.out.println(d1);	//5.0

	
	}

}

