class Data
{
	int data;

	public Data(int data)
	{
		this.data = data;
	}
	void displayData(String threadName)
	{
		System.out.println(threadName + " Start");
		System.out.println(threadName + " data = " + data);
		System.out.println(threadName + " End");
	}
}
class DataAccess implements Runnable
{
	Data dataObj;
	
	DataAccess(Data dataObj)
	{
		this.dataObj = dataObj;
	}
	public void run()
	{
		synchronized (dataObj)
		{
			dataObj.displayData(Thread.currentThread().getName());
		} 
	}
}
public class ThreadSyncExample1
{
	public static void main(String[] args)
	{
		Data data1 = new Data(10);
		Thread thread1 = new Thread(new DataAccess(data1), "First Thread");
		Thread thread2 = new Thread(new DataAccess(data1), "Second Thread");

		thread1.start();
		thread2.start();
	}
}