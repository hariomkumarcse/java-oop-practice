class MyTaskDemo implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("Running Thread: " + Thread.currentThread().getName());

			for(int i=1; i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName() + " -> "+i);

			Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
public class MyTask
{
	public static void main(String[] args)
	{
		try
		{
			//1. Thread() default constructor
		
			Thread t1 = new Thread();
			t1.setName("Default Thread");
	
			//2. Thread(Runnable target)
	
			MyTaskDemo obj1 = new MyTaskDemo();
			Thread t2 = new Thread(obj1);

			t2.setName("Runnable Thread");

			//3. Thread(Runnable target, String name)

			MyTaskDemo obj2 = new MyTaskDemo();
			Thread t3 = new Thread(obj2, "Custom Named Thread");

			//setPriority() and getPriority()

			t2.setPriority(8);
			System.out.println("Priority of t2: "+t2.getPriority());

			//getName()
			
			System.out.println("Name of t3: " +t3.getName());

			//getSate() before start
			
			System.out.println("State of t2 before start: " + t2.getState());

			//start()
			
			t2.start();
			t3.start();

			//isAlive()
			System.out.println("Is t2 alive? " +t2.isAlive());

			//join()
			//wait for t2 to finish

			t2.join();

			System.out.println("t2 completed");
	
			t3.join(1000);
			
			//getState() after execution 

			System.out.println("State of t2 of completion: " + t2.getState());
	
			//currentThread()

			System.out.println("Current Thread: " + Thread.currentThread().getName());

			//sleep(millis, nanos)
	
			Thread.sleep(1000,500);

			System.out.println("Main Thread Finished");
		} 
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}