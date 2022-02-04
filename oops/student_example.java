package oops;

class student
{
	int id;
	String name;
	float roll_no;

	public void setData(int i, String n, float r)
	{
		id=i;
		name=n;
		roll_no=r;
	}
	
	public void putData()
	{
		System.out.println("id "+id+" "+"name:"+name+" "+"roll no "+roll_no);

	}
}

public class student_example {

	public static void main(String[] args) {
	
		student apurva = new  student();//apurva is instance i.e object 
		apurva.id=102;
		apurva.name="Apurva";
		apurva.roll_no=3;
		
		System.out.println("id "+apurva.id+" "+"name:"+apurva.name+" "+"roll no "+apurva.roll_no);
		
		student maine = new student();
		maine.setData(103,"Manikand",60);
		maine.putData();
	}

}
