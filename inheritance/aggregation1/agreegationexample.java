package Inheritance;

class studente
{
	int id;
	String name;
	
	Address address; //entity reference creation

	public studente(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void Display()
	{
		
		System.out.println("ID: "+id+"Name: "+name);
		System.out.println("City: "+address.city+"State: "+address.state+" "+"Country: " +address.country);
	}
	
}

public class agreegationexample {

	public static void main(String[] args) {
	
		Address add1 = new Address("pune","MH","India");
		Address add2 = new Address("Vishrantwadi","MH","India");
				
		studente s1 = new studente(10,"abc",add1);
		studente s2 = new studente(15,"sfsv",add2);
		
		s1.Display();
		s2.Display();
	}

}
