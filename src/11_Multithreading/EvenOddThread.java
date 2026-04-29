class EvenOdd
{
	int counter = 1;
	
	synchronized void printEven()
	{
		while(counter<=10)
		{
			if(counter % 2 == 0)
			{
				System.out.println("Even number: " +counter);
			}
		counter++;
		}
	}
	
	
	synchronized void printOdd()
	{
		counter = 1;

		while(counter<=10)
		{
			if(counter %2 !=0)
			{
				System.out.println("Odd number: "+counter);
			}
			counter++;
		}
	}
}
class EvenOddThread
{
	public static void main(String[] args)
	{
		EvenOdd obj = new EvenOdd();

		Thread t1 = new Thread(() -> {
					obj.printEven();
					});

		Thread t2 = new Thread(() -> {

					obj.printOdd();
					}); 

		t1.start();
		t2.start();
	}
}