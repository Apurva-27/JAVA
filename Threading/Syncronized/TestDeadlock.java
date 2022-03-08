package ThreadExample;

public class TestDeadlock {

	public static void main(String[] args) {
		
		String resource1="paper";
		String resource2="pen";
		
		Thread apurva = new Thread()
		{
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread 1-Apurva:locked paper");
					try
					{
						Thread.sleep(400);
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
					
					synchronized(resource2)
					{
						System.out.println("Thread 1:locked pen");
					}	
				}
			}
		};
		
		Thread Monalisa = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 2-Monalisa:locked pen");
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				synchronized(resource2)
				{
					System.out.println("Thread 2:locked paper");
				}
			}//run
		};//monalisa	
		
		apurva.start();
		Monalisa.start();
				
	}

}
