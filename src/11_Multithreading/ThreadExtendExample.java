class MyThread extends Thread
{
	MyThread(String threadName)
	{
		super(threadName);
	}

	@Override
	public void run()
	{
		String threadName = getName();
		System.out.println(threadName+" starts -- ");
		for(int i = 0; i<5; i++)
		{
			try
			{
				Thread.sleep(500);
				System.out.println(threadName+ " ' s i = " +i);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(" -- "+threadName +" ends. ");
	}
}
public class ThreadExtendExample
{
	public static void main(String[] args)
	{
		MyThread thread1 = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");

		thread1.start();
		thread2.start();
	}
}