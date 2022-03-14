package oops;

public class new_bank_trans {

class bank
{
	 int acc_no;
	 String name;
	 long balance;

	public bank(int acc_no,String name,long balance) 
	{
		this.acc_no=acc_no;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(long wamount)
	{
		if(wamount<balance)
		{
			if(wamount>=500)
			{
				balance=balance-wamount;
				System.out.println(wamount+"withdraw has done sucessfully");
			}
			else
			{
				System.out.println("minimum withdrawl amount is 500");
			}
		}//if
		else
		{
			System.out.println("insufficient balance !deposite first");
		}//else

	}//withdraw
	
	public void deposit(long damt)
	{
		balance=balance+damt;
		System.out.println("deposit is completed");
	
	}//depposite
	
	public void check_balance()
	{
		System.out.println("account number: "+ this.acc_no);
		System.out.println("account holader name: "+this.name);
		System.out.println("account balance: "+this.balance);
	
	}//check balance
	
}

}
