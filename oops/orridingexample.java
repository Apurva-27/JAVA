package oops;

class bankie
{
	String BankName;
	
	int x=10;
	
	public bankie(String BankName)
	{
		this.BankName=BankName;
	}
	
	public int interest()
	{
		return 8;
	}
}

class SBI extends bankie
{
	int x=100;
	
	public SBI(String BankName)
	{
		super(BankName);
	}
	
	public int interest()
	{
		return 6;
	}

}

class axis extends bankie
{
	int x=100;
	
	public axis(String BankName)
	{
		super(BankName);
	}
	
	public int interest()
	{
		return 7;
	}

}

public class orridingexample {

	public static void main(String[] aargs) {
	bankie b;
	
	b =new SBI("SBI");
	System.out.println("Interest Rate at SBI = "+b.interest());
	
	b =new axis("Axis");
	System.out.println("Interest Rate at AXIS = "+b.interest());
	
	}
}
