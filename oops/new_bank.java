package oops;

import java.util.*;

class Bankk
{
	int acc_no;
	String holder_name;
	long acc_balance;
	
	public Bankk(int acc_no, String holder_name, long acc_balance)
	{
		this.acc_balance=acc_balance;
		this.acc_no=acc_no;
		this.holder_name=holder_name;
	}
	
	public void withdraw(long amount)
	{
		if((amount<acc_balance) && (amount>=500))
		{
			acc_balance=acc_balance-amount;
			System.out.println(amount+"Withdraw has done successfully.");
		}
		else
		{
			System.out.println("Insufficient balance! deposite first");
		}
	}
	
	public void checkbalance()
	{
		System.out.println("accoount no:"+this.acc_no);
		System.out.println("account holder name:"+this.holder_name);
		System.out.println("account balance:"+this.acc_balance);
	}
}

public class new_bank {

	public static void main(String[] args) {
	
		long withdraw, acc_balance;
		int acc_no;
		String holder_name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number:");
		acc_no=sc.nextInt();
		
		System.out.println("Enter account holder name:");
		holder_name=sc.nextLine();
		
		sc.nextLine();
				
		System.out.println("Enter Balance:");
		acc_balance=sc.nextLong();
				
		Bankk Obank = new Bankk(acc_no,holder_name,acc_balance );
		
		System.out.println("Enter amount to withdraw:");
		withdraw = sc.nextLong();
		
		Obank.withdraw(withdraw);
		Obank.checkbalance();
	}

}
/*
Enter account number:
25698
Enter account holder name:
Apurva
Enter Balance:
50000
Enter amount to withdraw:
10000
10000Withdraw has done successfully.
accoount no:25698
account holder name:
account balance:40000
*/