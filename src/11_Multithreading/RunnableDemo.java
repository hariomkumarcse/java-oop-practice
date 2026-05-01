class EvenOdd implements Runnable
{
	static int counter = 1;
	String type;

	
	EvenOdd(String type)
	{
		this.type = type;
	}

	public void run()
	{
		
		while(counter<=10)
		{
			if(type.equals("Even") && counter %2 == 0)
			{
				System.out.println("Even Number: " + counter);
			}
			if(type.equals("Odd") && counter % 2 != 0)
			{
				System.out.println("Odd Number: " +counter);
			}
			counter ++;
		}

	}
}
public class RunnableDemo
{
	public static void main(String[] args)
	{
		EvenOdd evenObj = new EvenOdd("Even");
		
		EvenOdd oddObj = new EvenOdd("Odd");

		Thread t1 = new Thread(evenObj);
		Thread t2 = new Thread(oddObj);

		t1.start();
		t2.start();

	
	}

}