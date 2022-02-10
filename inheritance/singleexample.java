package Inheritance;

class Bank
{
	String Bank_name;
	
	public Bank(String Bank_name)
	{
		this.Bank_name=Bank_name;
	}//Bank Constructor
	
	public int interest()
	{
		return 8;
	}
	
}//bank

class sbi extends Bank
{
	public sbi(String Bank_name)
	{
		super(Bank_name);//call parent class constructor 
		
	}//sbi Constructor
	
	void display()
	{
		System.out.println("Bank Name :"+Bank_name);
	}//display
}//child class



public class singleexample {

	public static void main(String[] args) {
		
		sbi s = new sbi(" State bank of india");
		
		s.display();
		System.out.print(s.interest());
	}

}//main
