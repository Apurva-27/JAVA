package ThreadExample;

class NumberTable
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
/*
void printTable(int n)
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
	}//void*/
	
}//class
class thread1 extends Thread
{
	NumberTable num;
	
	public thread1(NumberTable nt)
	{
		num =nt;
	}
	
	public void run()
	{
		num.printTable(5);
	}
}


class thread2 extends Thread
{
	NumberTable num;
	
	public thread2(NumberTable nt)
	{
		num =nt;
	}
	
	public void run()
	{
		num.printTable(10);
	}
}

public class TestSynchronozedMethod {

	public static void main(String[] args) {
		
		NumberTable nt =new NumberTable();
		
		thread1 t1=new thread1(nt);
		thread2 t2=new thread2(nt);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
	
		
		t1.start();
		t2.start();
	}

}
