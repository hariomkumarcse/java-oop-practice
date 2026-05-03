class MyThread implements Runnable
{
	public void run()
	{
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+ " starts -- ");
		for(int i =0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
				System.out.println(threadName+"s i = "+i);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("--"+threadName+" ends. ");
	}
	
}
public class ThreadRunnableExample
{
	public static void main(String[] args)
	{
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread thread1 = new Thread(obj1,"Thread 1");
		Thread thread2 = new Thread(obj2,"Thread 2");

		thread1.start();
		thread2.start();
	}
}