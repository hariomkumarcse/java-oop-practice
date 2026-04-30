class EvenOdd
{
	int counter = 1;

	synchronized void printEven()
	{
		while(counter<=10)
		{
			if(counter %2 == 0)
			{
				System.out.println("Even Number: "+counter);
			}
			counter ++;
		}

	}


	synchronized void printOdd()
	{
		counter = 1;
		while(counter<= 10)
		{
			if(counter % 2 != 0)
			{
				System.out.println("Odd Number: "+counter);
			}
			counter++;
		}
	
	}
}
class EvenThread extends Thread
{
	EvenOdd obj;

	EvenThread(EvenOdd obj)
	{
		this.obj = obj;
	}

	public void run()
	{
		obj.printEven();
	}
}
class OddThread extends Thread
{
	EvenOdd obj;
	
	OddThread(EvenOdd obj)
	{
		this.obj = obj;
	}

	public void run()
	{
		obj.printOdd();
	}
}
class ThreadClassDemo
{
	public static void main(String[] args)
	{
		EvenOdd obj = new EvenOdd();

		EvenThread t1 = new EvenThread(obj);
		OddThread t2 = new OddThread(obj);

		t1.start();
		t2.start();
	}
}