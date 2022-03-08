package ThreadExample;


class NumberTable4
{
	synchronized static void printTable(int n)
	{
		for(int i=1; i<=5; i++)
		{	
			System.out.println(Thread.currentThread().getName()+"="+n*i);
			try 
			{
				Thread.sleep(500);
			}//try
			catch(Exception e)
			{
				System.out.println(e);
			}//catch
			
		}//for
		
	}//void
}
 

public class staticSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Thread t1 = new Thread("thread 1 -")
	{
		public void run()
		{
			NumberTable4.printTable(5);		}
		
	};
	
	Thread t2 = new Thread("thread 2 -")
	{
		public void run()
		{
			NumberTable4.printTable(10);		}
		
	};
	
	Thread t3 = new Thread("thread 3 -")
	{
		public void run()
		{
			NumberTable4.printTable(100);		}
		
	};
	
	Thread t4 = new Thread("thread 4 -")
	{
		public void run()
		{
			NumberTable4.printTable(100);		}
		
	};
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
