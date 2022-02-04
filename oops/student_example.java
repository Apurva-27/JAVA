package oops;

class student
{
	int id;
	String name;
	float roll_no;
	
}

public class student_example {

	public static void main(String[] args) {
	
		student apurva = new  student();//apurva is instance i.e object 
		apurva.id=102;
		apurva.name="Apurva";
		apurva.roll_no=3;
		
		System.out.println("id "+apurva.id+" "+"name:"+apurva.name+" "+"roll no "+apurva.roll_no);
	}

}
