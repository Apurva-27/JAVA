package ThreadExample;

public class ThreadDemo extends Thread {

	public void run()
	{
		System.out.println("Thread is running...");
		System.out.println("Thread priority: "+Thread.currentThread());
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();	//new state
		ThreadDemo t2 = new ThreadDemo();
		
		t1.start(); //runnable state
		t2.start();
	
		//getting the thread name by invoking the getName(
		String n1 = t1.getName();
		System.out.println("t1 name: "+n1);
		
		String n2 = t2.getName();
		System.out.println("t2 name: "+n2);
		t1.setName("First thread");
	
		String change = t1.getName();
		System.out.println("t1 name: "+change);
	
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		 t2.setPriority(Thread.MAX_PRIORITY);
		 t1.setPriority(Thread.MAX_PRIORITY);
	}

}
