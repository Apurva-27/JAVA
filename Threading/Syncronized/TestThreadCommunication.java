package ThreadExample;

class User
{
	int amount =10000;
	
	void withdraw(int amount)
	{
		System.out.println("going to withdraw!");
		
		if(this.amount<amount)
		{
			System.out.println("Less Balance! Wating for deposite");
			try
			{
				wait();
				
			}
			catch(Exception e)
			{
				
			}
			this.amount-=amount;
			System.out.println(amount+"Withdraw complete");
			System.out.println("current balance "+this.amount);
		}//if	
		
	}//withdraw

	synchronized void deposite(int amount)
	{
		System.out.println("going to deposite");
		this.amount+=amount;
		System.out.println("deposite complete");
		notify();
	}

}//user


public class TestThreadCommunication {

	public static void main(String[] args) {
		User u = new User();
		
		new Thread()
		{
			public void run()
			{
				u.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				u.deposite(6000);
			}
		}.start();
	}

}
