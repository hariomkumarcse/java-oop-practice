import java.util.Scanner;

public class ExceptionHandlingMain
{
	static int divide(int dividend, int divisor)
	{
		return dividend/divisor;
	}

	static int getElement(int[] arr, int index)
	{
		return arr[index];
	}
	static void goToSleep(int duration) throws InterruptedException
	{
		if(duration < 0)
		{
			throw new IllegalArgumentException("Sleep duration cannot be negative");
		}
		Thread.sleep(duration);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int dividend, divisor, index, sleepDuration;
		int[] arr = {1,2,3,4,5};
		
		try
		{
			System.out.println("Enter dividend: ");
			dividend = sc.nextInt();
			
			System.out.println("Enter divisor: ");
			divisor = sc.nextInt();
			
			System.out.println("Result of division: " + divide(dividend, divisor));
	
			System.out.println("Enter sleep duration: ");
			sleepDuration = sc.nextInt();
		
			goToSleep(sleepDuration);
	
			System.out.println("Enter index position to get the element: ");
			index = sc.nextInt();

			System.out.println("The element at index position " + index + " is "+getElement(arr,index));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled: " + e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Exception handled: " + e.getMessage());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Ilegal Argument Exception handled: " + e.getMessage());
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted Exception handled: "+ e.getMessage());
		}
		finally
		{
			sc.close();
			System.out.println("The resource (Scanner instance 'sc') closed. ");
		}
	}
}