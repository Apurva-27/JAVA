package ThreadExample;

class NumberTable3
{
	synchronized void printTable(int n)
	{
		synchronized(this)
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
	}//synchronized
	
	}//void
}

class thread11 extends Thread
{
	NumberTable3 num;
	
	public thread11(NumberTable3 nt)
	{
		num =nt;
	}
	
	public void run()
	{
		num.printTable(5);
	}
}


class thread21 extends Thread
{
	NumberTable3 num;
	
	public thread21(NumberTable3 nt)
	{
		num =nt;
	}
	
	public void run()
	{
		num.printTable(10);
	}
}

public class syncronizedBlock {

	public static void main(String[] args) {
		
NumberTable3 nt =new NumberTable3();
		
		thread11 t1=new thread11(nt);
		thread21 t2=new thread21(nt);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
	
		
		t1.start();
		t2.start();
	}

}
