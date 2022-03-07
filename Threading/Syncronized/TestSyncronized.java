package ThreadExample;

class NumberTable2
{
	synchronized void printTable(int n)
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

public class TestSyncronized {

	public static void main(String[] args) {
		
		final NumberTable2 nt =new NumberTable2();
		
		Thread t1 =new Thread()
		{
			public void run()
			{
				nt.printTable(5);
			}
		};
		
		Thread t2 =new Thread()
		{
			public void run()
			{
				nt.printTable(10);
			}
		};
		
		t1.start();
		t2.start();
	}

}
