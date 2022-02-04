// createorn bank class , declare varables acc_no, acc_holder_name, amount.
//declare withdra method  which will be responsible to withdraw amnt from main balance before withdraw check  sufficient or not 
//10000 to 15000 insufficient 
//

package oops;

class bank_info
{
	int acc_no;
	String name; 
	float amount;
	
	public void set_data(int no, String aa_name, float aa_amount)
	{
		acc_no= no;
		name = aa_name;
		amount= aa_amount;
	}

	public void putData()
	{
		System.out.println("acc_no:"+acc_no+" "+"name:"+name+" "+"amount:"+amount+" ");
	}
	
	public void withdraw(float Famount)
	{
		if(Famount>amount)
		{
			System.out.println("Ammount is not Sufficient to withdraw.");
		}
		else
		{
			System.out.println("Ammount is Sufficient to withdraw.");

		}
	}
}

public class bank {

	public static void main(String[] args) {
		
		bank_info bobj = new bank_info();
		bobj.set_data(123, "abc", 10000);
		bobj.putData();
		bobj.withdraw(5000);
	}

}
