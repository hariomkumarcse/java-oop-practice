class Cls {
	
	int counter = 1;

	synchronized void printOddEven() 
	{


        	// First print 5 odd
        	while (counter <= 10) 
		{
           		if (counter % 2 != 0) 
			{
                		System.out.println("Odd: " + counter);
                		
            		}
            		counter++;
        	}
		
		counter = 1;
        	// Then print 5 even
        	while (counter <= 10) 
		{
            		if (counter % 2 == 0) 
			{
                	System.out.println("Even: " + counter);
                	
            		}
            		counter++;
        	}
	}
}

class OddEvenDemo 
{
	public static void main(String[] args) 
	{

        	Cls obj = new Cls();

        	Thread t1 = new Thread(() -> {
            	obj.printOddEven();
        	});

        	/* Thread t2 = new Thread(() -> {
            	obj.printOddEven();
        	}); 
		//Two objects can create but inter thread communication give problems
		*/

        t1.start();
        //t2.start();
    }
}