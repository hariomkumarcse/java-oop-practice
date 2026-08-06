public class StackTraceDemo
{
	static void divide()
	{
		int result = 100/0;

		System.out.println(result);
	}

	static void calculate()
	{
		divide();
	}

	public static void main(String[] args)
	{
		try
		{
			calculate();
		}

		catch(Exception e)
		{
			System.out.println("Exception Message: ");
			System.out.println(e.getMessage());

			System.out.println("\nException Class:");
			System.out.println(e.getClass().getName());

			System.out.println("\nStack Trace:");

			e.printStackTrace();
		}
	}
}